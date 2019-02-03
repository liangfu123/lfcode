package com.tsjg.core.controller;


import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cn.itcast.common.page.Pagination;

import com.tsjg.common.web.json.ResponseUtils;
import com.tsjg.common.web.session.SessionProvider;
import com.tsjg.core.bean.Book;
import com.tsjg.core.bean.BookCollection;
import com.tsjg.core.bean.BookCollectionExample;
import com.tsjg.core.bean.BookComment;
import com.tsjg.core.bean.BookJg;
import com.tsjg.core.bean.BookJgExample;
import com.tsjg.core.bean.BookPurchase;
import com.tsjg.core.bean.BookPurchaseExample;
import com.tsjg.core.bean.BookUserdefined;
import com.tsjg.core.bean.BookUserdefinedExample;
import com.tsjg.core.bean.Mag;
import com.tsjg.core.bean.MagCollection;
import com.tsjg.core.bean.MagCollectionExample;
import com.tsjg.core.bean.MagComment;
import com.tsjg.core.bean.MagJg;
import com.tsjg.core.bean.MagJgExample;
import com.tsjg.core.bean.MagPurchase;
import com.tsjg.core.bean.MagPurchaseExample;
import com.tsjg.core.bean.MagUserdefined;
import com.tsjg.core.bean.MagUserdefinedExample;
import com.tsjg.core.bean.User;
import com.tsjg.core.dao.BookCollectionMapper;
import com.tsjg.core.dao.BookCommentMapper;
import com.tsjg.core.dao.BookJgMapper;
import com.tsjg.core.dao.BookPurchaseMapper;
import com.tsjg.core.dao.BookUserdefinedMapper;
import com.tsjg.core.dao.MagCollectionMapper;
import com.tsjg.core.dao.MagCommentMapper;
import com.tsjg.core.dao.MagJgMapper;
import com.tsjg.core.dao.MagPurchaseMapper;
import com.tsjg.core.dao.MagUserdefinedMapper;
import com.tsjg.core.service.BookService;
import com.tsjg.core.web.Constans;

@Controller
public class ReaderController {
	@Autowired
	private BookService bookService;
	@Autowired
	private BookCommentMapper bookCommentMapper;
	@Autowired
	private MagCommentMapper magCommentMapper;
	@Autowired
	private BookPurchaseMapper bookPurchaseMapper;
	@Autowired
	private BookJgMapper bookJgMapper;
	@Autowired
	private MagJgMapper magJgMapper;
	@Autowired
	private MagPurchaseMapper magPurchaseMapper;
	@Autowired
	private SessionProvider sessionProvider;
	@Autowired
	private BookUserdefinedMapper bookUserdefinedMapper;
	@Autowired
	private MagUserdefinedMapper magUserdefinedMapper;
	@Autowired
	private BookCollectionMapper bookCollectionMapper;
	@Autowired
	private MagCollectionMapper magCollectionMapper;
	
	@RequestMapping(value = "/jg/magJg.shtml")
	public void magJg(String magIssn,Integer userId,HttpServletResponse response,HttpServletRequest request){
		MagJgExample magJgExample = new MagJgExample();
		magJgExample.createCriteria().andMagIssnEqualTo(magIssn).andUserIdEqualTo(userId);
		List<MagJg> mgm = magJgMapper.selectByExample(magJgExample);
		
		boolean flag = (Boolean) request.getAttribute("flag");
		if(flag){
			JSONObject jo = new JSONObject();
			jo.put("msg", "您没有完善个人资料，请到个人中心完善资料后荐购！");
			ResponseUtils.renderJson(response, jo.toString());
		}else if(mgm  != null && !mgm.isEmpty()){
			JSONObject jo = new JSONObject();
			jo.put("msg", "你已推荐过此期刊，请勿重复荐购！");
			ResponseUtils.renderJson(response, jo.toString());
		}else{
			bookService.updateMagNum(magIssn);
			
			MagPurchase magPurchase = new MagPurchase();
			magPurchase.setMagIssn(magIssn);
			
			MagPurchaseExample magPurchaseExample = new MagPurchaseExample();
			magPurchaseExample.createCriteria().andMagIssnEqualTo(magIssn);
			List<MagPurchase> mp = magPurchaseMapper.selectByExample(magPurchaseExample);
			if(mp.isEmpty()){
				magPurchaseMapper.insertSelective(magPurchase);
			}
			
			MagJg magJg = new MagJg();
			magJg.setMagjgTime(new Date());
			magJg.setMagIssn(magIssn);
			magJg.setUserId(userId);
			magJgMapper.insertSelective(magJg);
			
			JSONObject jo = new JSONObject();
			jo.put("msg", "荐购成功");
			ResponseUtils.renderJson(response, jo.toString());
		}
	}
	
	@RequestMapping(value = "/jg/bookJg.shtml")
	public void bookJg(String isbn,Integer userId,HttpServletResponse response,HttpServletRequest request){
		BookJgExample bookJgExample = new BookJgExample();
		bookJgExample.createCriteria().andIsbnEqualTo(isbn).andUserIdEqualTo(userId);
		List<BookJg> bjm = bookJgMapper.selectByExample(bookJgExample);
		
		boolean flag = (Boolean) request.getAttribute("flag");
		if(flag){
			JSONObject jo = new JSONObject();
			jo.put("msg", "您没有完善个人资料，请到个人中心完善资料后荐购！");
			ResponseUtils.renderJson(response, jo.toString());
		}else if(bjm  != null && !bjm.isEmpty()){
			JSONObject jo = new JSONObject();
			jo.put("msg", "你已推荐过此书，请勿重复荐购！");
			ResponseUtils.renderJson(response, jo.toString());
		}else{
			bookService.updateBookNum(isbn);
			
			BookPurchase bookPurchase = new BookPurchase();
			bookPurchase.setIsbn(isbn);
			
			BookPurchaseExample bookPurchaseExample = new BookPurchaseExample();
			bookPurchaseExample.createCriteria().andIsbnEqualTo(isbn);
			List<BookPurchase> bp = bookPurchaseMapper.selectByExample(bookPurchaseExample);
			if(bp.isEmpty()){
				bookPurchaseMapper.insert(bookPurchase);
			}
			
			BookJg bookJg = new BookJg();
			bookJg.setBookjgTime(new Date());
			bookJg.setIsbn(isbn);
			bookJg.setUserId(userId);
			bookJgMapper.insertSelective(bookJg);
			
			JSONObject jo = new JSONObject();
			jo.put("msg", "荐购成功");
			ResponseUtils.renderJson(response, jo.toString());
		}

	}
	
	@RequestMapping(value = "/magComment.shtml")
	public void magComment(String mcContent,Integer magId,Integer userId,HttpServletResponse response){
		MagComment magComment = new MagComment();
		if(mcContent != null && StringUtils.isNotBlank(mcContent)){
			magComment.setMcContent(mcContent);
			magComment.setMcTime(new Date());
			magComment.setUserId(userId);
			magComment.setMagId(magId);
			magCommentMapper.insertSelective(magComment);
			
			JSONObject jo = new JSONObject();
			 jo.put("msg", "评论成功！请刷新页面");
			ResponseUtils.renderJson(response, jo.toString());
		}else{
			JSONObject jo = new JSONObject();
			jo.put("msg", "评论内容不能为空");
			ResponseUtils.renderJson(response, jo.toString());
		}
	}
	
	@RequestMapping(value = "/bookComment.shtml")
	public void bookComment(String bcContent,Integer bookId,Integer userId,HttpServletResponse response){
		BookComment bookComment = new BookComment();
		if(bcContent != null && StringUtils.isNotBlank(bcContent)){
			bookComment.setBcContent(bcContent);
			bookComment.setBcTime(new Date());
			bookComment.setBookId(bookId);
			bookComment.setUserId(userId);
			bookCommentMapper.insertSelective(bookComment);
			
			JSONObject jo = new JSONObject();
			 jo.put("msg", "评论成功");
			ResponseUtils.renderJson(response, jo.toString());
		}else{
			JSONObject jo = new JSONObject();
			jo.put("msg", "评论内容不能为空");
			ResponseUtils.renderJson(response, jo.toString());
		}
	}
	
	@RequestMapping(value = "/toBookDetails.shtml")
	public String toBookDetails(String isbn,ModelMap model){
		Book bookinfo = bookService.findBookInfo(isbn);
		
		List<BookComment> comments = bookService.findBookComment(bookinfo.getBookId());
		
		model.addAttribute("bookinfo", bookinfo);
		model.addAttribute("comments", comments);
		return "details";
	}
	
	@RequestMapping(value = "/toMagDetails.shtml")
	public String toMagDetails(String issn,ModelMap model){
		Mag maginfo = bookService.findMagInfo(issn);
		
		List<MagComment> comments = bookService.findMagComment(maginfo.getMagId());
		
		model.addAttribute("maginfo", maginfo);
		model.addAttribute("comments", comments);
		return "magdetails";
	}
	
	@RequestMapping(value = "/toReader.shtml")
	public String toReader(){
		return "reader";
	}
	
	@RequestMapping(value = "/jg/readerBookJg.shtml",method = RequestMethod.POST)
	public void readerBookJg(BookUserdefined bookUserdefined,HttpServletResponse response,HttpServletRequest request){
		User user = (User)sessionProvider.getAttribute(request, Constans.USER_SESSION);
		bookUserdefined.setUserId(user.getUserId());
		bookUserdefined.setBookJgTime(new Date());
		
		BookCollectionExample bookCollectionExample = new BookCollectionExample();
		bookCollectionExample.createCriteria().andIsbnEqualTo(bookUserdefined.getIsbn());
		List<BookCollection> bc = bookCollectionMapper.selectByExample(bookCollectionExample);
		
		boolean flag = (Boolean) request.getAttribute("flag");
		if(flag){
			ResponseUtils.renderText(response, "您没有完善个人资料，请到个人中心完善资料后荐购！");
			return ;
		}
		
		if(bc != null && !bc.isEmpty()){
			ResponseUtils.renderText(response, "该书图书馆已有，可到图书馆阅读");
			return ;
		}
		
		BookUserdefinedExample bookUserdefinedExample = new BookUserdefinedExample();
		bookUserdefinedExample.createCriteria().andUserIdEqualTo(user.getUserId()).andIsbnEqualTo(bookUserdefined.getIsbn());
		List<BookUserdefined> bu = bookUserdefinedMapper.selectByExample(bookUserdefinedExample);
		
		if(bu != null && !bu.isEmpty()){
			ResponseUtils.renderText(response, "你已荐购该书，请勿重复荐购！");
			return ;
		}
		
		bookUserdefinedMapper.insertSelective(bookUserdefined);
		
		ResponseUtils.renderText(response, "荐购成功，请刷新页面！");
	}
	
	@RequestMapping(value = "/toReaderBookJg.shtml")
	public String toReaderBookJg(Integer pageNo,ModelMap model,HttpServletRequest request){
		User user = (User)sessionProvider.getAttribute(request, Constans.USER_SESSION);
		
		BookUserdefined bookUserdefined = new BookUserdefined();
		bookUserdefined.setPageNo(Pagination.cpn(pageNo));
		bookUserdefined.setPageSize(10);
		bookUserdefined.setUserId(user.getUserId());
		
		Pagination pagination = bookService.findUserBookJg(bookUserdefined, user.getUserId());
		String url = "/"+ Constans.PROJECT_NAME +"/toReaderBookJg.shtml";
		pagination.pageView(url, null);
		
		model.addAttribute("pagination", pagination);
		return "readerbookjg";
	}
	
	@RequestMapping(value = "/jg/readerMagJg.shtml",method = RequestMethod.POST)
	public void readerMagJg(MagUserdefined magUserdefined,HttpServletResponse response,HttpServletRequest request){
		User user = (User)sessionProvider.getAttribute(request, Constans.USER_SESSION);
		magUserdefined.setIsget(0);
		magUserdefined.setUserId(user.getUserId());
		magUserdefined.setMagJgTime(new Date());
		
		MagCollectionExample magCollectionExample = new MagCollectionExample();
		magCollectionExample.createCriteria().andIssnEqualTo(magUserdefined.getMagIssn());
		List<MagCollection> mc = magCollectionMapper.selectByExample(magCollectionExample);
		
		boolean flag = (Boolean) request.getAttribute("flag");
		if(flag){
			ResponseUtils.renderText(response, "您没有完善个人资料，请到个人中心完善资料后荐购！");
			return ;
		}
		
		if(mc != null && !mc.isEmpty()){
			ResponseUtils.renderText(response, "该期刊图书馆已有，可到图书馆阅读");
			return ;
		}
		
		MagUserdefinedExample magUserdefinedExample = new MagUserdefinedExample();
		magUserdefinedExample.createCriteria().andMagIssnEqualTo(magUserdefined.getMagIssn()).andUserIdEqualTo(user.getUserId());
		List<MagUserdefined> mud = magUserdefinedMapper.selectByExample(magUserdefinedExample);
		
		if(mud != null && !mud.isEmpty()){
			ResponseUtils.renderText(response, "你已荐购该期刊，请勿重复荐购！");
			return ;
		}
		
		magUserdefinedMapper.insertSelective(magUserdefined);
		
		ResponseUtils.renderText(response, "荐购成功，请刷新页面！");
	}
	
	@RequestMapping(value = "/toReaderMagJg.shtml")
	public String toReaderMagJg(Integer pageNo,ModelMap model,HttpServletRequest request){
		User user = (User)sessionProvider.getAttribute(request, Constans.USER_SESSION);
		
		MagUserdefined magUserdefined = new MagUserdefined();
		magUserdefined.setPageNo(Pagination.cpn(pageNo));
		magUserdefined.setPageSize(10);
		magUserdefined.setUserId(user.getUserId());
		
		Pagination pagination = bookService.findUserMagJg(magUserdefined, user.getUserId());
		String url = "/"+ Constans.PROJECT_NAME +"/toReaderMagJg.shtml";
		pagination.pageView(url, null);
		
		model.addAttribute("pagination", pagination);
		
		return "readermagjg";
	}
	
	@RequestMapping(value = "/toReaderBook.shtml")
	public String toReaderBook(Integer pageNo,ModelMap model,HttpServletRequest request){
		User user = (User) sessionProvider.getAttribute(request, Constans.USER_SESSION);
		int userId = user.getUserId();
		
		BookJg bookJg = new BookJg();
		bookJg.setUserId(userId);
		
		Book book = new Book();
		book.setPageNo(Pagination.cpn(pageNo));
		book.setPageSize(16);
		book.setBookJg(bookJg);
		
		Pagination pagination = bookService.findReaderBook(book,userId);
		String url = "/"+ Constans.PROJECT_NAME +"/toReaderBook.shtml";
		pagination.pageView(url, null);
		
		model.addAttribute("pagination", pagination);
		return "readerbook";
	}
	
	@RequestMapping(value = "/toReaderMag.shtml")
	public String toReaderMag(Integer pageNo,ModelMap model,HttpServletRequest request){
		User user = (User) sessionProvider.getAttribute(request, Constans.USER_SESSION);
		int userId = user.getUserId();
		
		MagJg magJg = new MagJg();
		magJg.setUserId(userId);
		
		Mag mag = new Mag();
		mag.setPageNo(Pagination.cpn(pageNo));
		mag.setPageSize(16);
		mag.setMagJg(magJg);
		
		Pagination pagination = bookService.findReaderMag(mag, userId);
		String url = "/"+ Constans.PROJECT_NAME +"/toReaderMag.shtml";
		pagination.pageView(url, null);
		
		model.addAttribute("pagination", pagination);
		return "readermag";
	}
	
}
