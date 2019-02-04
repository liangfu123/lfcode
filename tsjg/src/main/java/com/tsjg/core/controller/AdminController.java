package com.tsjg.core.controller;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import cn.itcast.common.page.Pagination;

import com.tsjg.common.web.json.ResponseUtils;
import com.tsjg.core.bean.Book;
import com.tsjg.core.bean.BookCategory;
import com.tsjg.core.bean.BookCategoryExample;
import com.tsjg.core.bean.BookExample;
import com.tsjg.core.bean.BookPurchaseExample;
import com.tsjg.core.bean.BookSubject;
import com.tsjg.core.bean.BookSubjectExample;
import com.tsjg.core.bean.BookUserdefined;
import com.tsjg.core.bean.BookUserdefinedExample;
import com.tsjg.core.bean.Mag;
import com.tsjg.core.bean.MagCategory;
import com.tsjg.core.bean.MagCategoryExample;
import com.tsjg.core.bean.MagExample;
import com.tsjg.core.bean.MagPurchase;
import com.tsjg.core.bean.MagPurchaseExample;
import com.tsjg.core.bean.MagUserdefined;
import com.tsjg.core.bean.MagUserdefinedExample;
import com.tsjg.core.bean.Message;
import com.tsjg.core.bean.MyBookPurchase;
import com.tsjg.core.bean.User;
import com.tsjg.core.bean.UserExample;
import com.tsjg.core.bean.UserMessage;
import com.tsjg.core.dao.BookCategoryMapper;
import com.tsjg.core.dao.BookMapper;
import com.tsjg.core.dao.BookPurchaseMapper;
import com.tsjg.core.dao.BookSubjectMapper;
import com.tsjg.core.dao.BookUserdefinedMapper;
import com.tsjg.core.dao.MagCategoryMapper;
import com.tsjg.core.dao.MagMapper;
import com.tsjg.core.dao.MagPurchaseMapper;
import com.tsjg.core.dao.MagUserdefinedMapper;
import com.tsjg.core.dao.MessageMapper;
import com.tsjg.core.dao.MyBookUdMapper;
import com.tsjg.core.dao.MyMagUdMapper;
import com.tsjg.core.dao.UserMapper;
import com.tsjg.core.service.BookService;
import com.tsjg.core.service.UserService;
import com.tsjg.core.web.Constans;
import com.tsjg.core.web.GetUuid;

@Controller
@RequestMapping(value = "/backpage")
public class AdminController {
	@Autowired
	private MagCategoryMapper magCategoryMapper;
	@Autowired
	private MagMapper magMapper;
	@Autowired
	private BookCategoryMapper bookCategoryMapper;
	@Autowired
	private BookSubjectMapper bookSubjectMapper;
	@Autowired
	private UserMapper userMapper;
	@Autowired
	private UserService userService;
	@Autowired
	private BookService bookService;
	@Autowired
	private BookMapper bookMapper;
	@Autowired
	private BookPurchaseMapper bookPurchaseMapper;
	@Autowired
	private MagPurchaseMapper magPurchaseMapper;
	@Autowired
	private MessageMapper messageMapper;
	@Autowired
	private BookUserdefinedMapper bookUserdefinedMapper;
	@Autowired
	private MagUserdefinedMapper magUserdefinedMapper;
	@Autowired
	private MyBookUdMapper myBookUdMapper;
	@Autowired
	private MyMagUdMapper myMagUdMapper;
	
	@RequestMapping(value = "/toTop.do")
	public String toTop(){
		return "top";
	}
	
	@RequestMapping(value = "/toLeft.do")
	public String toLeft(){
		return "left";
	}
	
	@RequestMapping(value = "updateReview.do")
	public void updateReview(boolean code, Integer userId){
		User user = new User();
		user.setUserId(userId);
		if(code){
			user.setIsReview(1);
		}else{
			user.setIsReview(2);
		}
		userMapper.updateUserReview(user);
	}
	
	@RequestMapping(value = "review.do")
	public String review(ModelMap model,Integer pageNo){
		User user = new User();
		user.setPageNo(Pagination.cpn(pageNo));
		user.setPageSize(10);
		user.setIsadministrator(0);
		user.setIsReview(0);
		user.setIsadministrator(0);
		
		Pagination users = userService.findUserReview(user);
		String url = "/"+ Constans.PROJECT_NAME +"/backpage/review.do";
		users.pageView(url, null);
		
		model.addAttribute("users", users);
		return "manager";
	}
	
	@RequestMapping(value = "message.do")
	public void message(Message message,HttpServletResponse response){
		message.setMsgTime(new Date());
		String uuid = GetUuid.getuuid();
		message.setMsgId(uuid);
		
		UserExample userExample = new UserExample();
		userExample.createCriteria();
		List<User> user = userMapper.selectByExample(userExample);
		if(user == null || user.size() == 0){
			JSONObject jo = new JSONObject();
			jo.put("msg", "暂时没有用户对象，该通知不能发布！");
			ResponseUtils.renderJson(response, jo.toString());
			return ;
		}
		
		messageMapper.insertSelective(message);
		
		UserMessage userMessage = new UserMessage();
		for (User u : user) {
			userMessage.setUserId(u.getUserId());
			userMessage.setMessageId(uuid);
			userService.insertPatch(userMessage);
		}
		
		JSONObject jo = new JSONObject();
		jo.put("msg", "发布成功！");
		ResponseUtils.renderJson(response, jo.toString());
	}
	
	@RequestMapping(value = "/newMagPub.do")
	public void newMagPub(String[] checkissn,HttpServletResponse response){
		bookService.updateMagIsget(checkissn);
		bookService.updateMagJgIsget(checkissn);
		JSONObject jo = new JSONObject();
		jo.put("msg", "发布成功！");
		ResponseUtils.renderJson(response, jo.toString());
	}
	
	@RequestMapping(value = "/newBookPub.do")
	public void newBookPub(String[] checkisbn,HttpServletResponse response){
		bookService.updateBookIsget(checkisbn);
		bookService.updateBookJgIsget(checkisbn);
		JSONObject jo = new JSONObject();
		jo.put("msg", "发布成功！");
		ResponseUtils.renderJson(response, jo.toString());
	}
	
	@RequestMapping(value = "/toRight.do")
	public String toRight(Integer pageNo,ModelMap model){
		Book book = new Book();
		book.setPageNo(Pagination.cpn(pageNo));
		book.setPageSize(7);
		Pagination books = bookService.findAllBook(book);
		String url = "/"+ Constans.PROJECT_NAME +"/backpage/toRight.do";
		books.pageView(url, null);
		model.addAttribute("books", books);
		return "right";
	}
	
	@RequestMapping(value = "/deleteBatchBook.do")
	public String deleteBatchBook(String[] checkisbn,HttpServletResponse response){
		bookService.deleteBatchBook(checkisbn);
		return "redirect:/backpage/toRight.do";
	}
	
	@RequestMapping(value = "/deleteOneBook.do")
	public void deleteOneBook(String isbn,HttpServletResponse response){
		BookExample bookExample = new BookExample();
		bookExample.createCriteria().andIsbnEqualTo(isbn);
		int result = bookMapper.deleteByExample(bookExample);
		
		JSONObject jo = new JSONObject();
		jo.put("result", result);
		ResponseUtils.renderJson(response, jo.toString());
	}
	
	@RequestMapping(value = "/updateBook.do")
	public void updateBook(Book book ,HttpServletResponse response){
		BookExample bookExample = new BookExample();
		bookExample.createCriteria().andIsbnEqualTo(book.getIsbn());
		bookMapper.updateByExampleSelective(book, bookExample);
		
		JSONObject jo = new JSONObject();
		jo.put("msg", "完成编辑");
		ResponseUtils.renderJson(response, jo.toString());
	}
	
	@RequestMapping(value = "/editBook.do")
	public void editBook(String code,HttpServletResponse response){
		BookExample bookExample = new BookExample();
		bookExample.createCriteria().andIsbnEqualTo(code);
		List<Book> bookinfo = bookMapper.selectByExample(bookExample);
		
		BookSubjectExample bookSubjectExample = new BookSubjectExample();
		List<BookSubject> bSubject = bookSubjectMapper.selectByExample(bookSubjectExample);
		
		BookCategoryExample bookCategoryExample = new BookCategoryExample();
		List<BookCategory> bCategory = bookCategoryMapper.selectByExample(bookCategoryExample);
				
		JSONObject jo = new JSONObject();
		jo.put("bookinfo", bookinfo);
		jo.put("bSubject", bSubject);
		jo.put("bCategory", bCategory);
		ResponseUtils.renderJson(response, jo.toString());
	}
	
	@RequestMapping(value = "/addBooks.do")
	public String addBooks(ModelMap model,@RequestParam("file") MultipartFile file,Integer pageNo) throws Exception{
		//判断文件是否为空
		if(file == null) return null;
		String filename = file.getOriginalFilename();
		if(filename == null || "".equals(filename) && file.getSize() == 0) return null;
		
		boolean b = bookService.batchImportBook(file);
		if(b){
			model.addAttribute("msg", "导入成功");
			Book book = new Book();
			book.setPageNo(Pagination.cpn(pageNo));
			book.setPageSize(7);
			
			Pagination books = bookService.findAllBook(book);
			String url = "/"+ Constans.PROJECT_NAME +"/backpage/toRight.do";
			books.pageView(url, null);
			model.addAttribute("books", books);
			return "right";
		}else{
			model.addAttribute("msg", "导入失败");
			return "right";
		}

	}
	
	@RequestMapping(value = "/toMag.do")
	public String toMag(Integer pageNo,ModelMap model){
		Mag mag = new Mag();
		mag.setPageNo(Pagination.cpn(pageNo));
		mag.setPageSize(7);
		
		Pagination mags = bookService.findAllMag(mag);
		String url = "/"+ Constans.PROJECT_NAME +"/backpage/toMag.do";
		mags.pageView(url, null);
		model.addAttribute("mags", mags);
		return "mag";
	}
	
	@RequestMapping(value = "/addMags.do")
	public String addMags(ModelMap model,@RequestParam("file") MultipartFile file,Integer pageNo) throws Exception{
		//判断文件是否为空
		if(file == null) return null;
		String filename = file.getOriginalFilename();
		if(filename == null || "".equals(filename) && file.getSize() == 0) return null;
		
		boolean b = bookService.batchImportMag(file);
		
		if(b){
			model.addAttribute("msg", "导入成功");
			Mag mag = new Mag();
			mag.setPageNo(Pagination.cpn(pageNo));
			mag.setPageSize(7);
			
			Pagination mags = bookService.findAllMag(mag);
			String url = "/"+ Constans.PROJECT_NAME +"backpage/toMag.do";
			mags.pageView(url, null);
			model.addAttribute("mags", mags);
			return "mag";
		}else{
			model.addAttribute("msg", "导入失败");
			return "mag";
		}
		
	}
	
	@RequestMapping(value = "/editMag.do")
	public void editMag(String code,HttpServletResponse response){
		MagExample magExample = new MagExample();
		magExample.createCriteria().andMagIssnEqualTo(code);
		List<Mag> maginfo = magMapper.selectByExample(magExample);
		
		MagCategoryExample magCategoryExample = new MagCategoryExample();
		List<MagCategory> mCategory = magCategoryMapper.selectByExample(magCategoryExample);
				
		JSONObject jo = new JSONObject();
		jo.put("maginfo", maginfo);
		jo.put("mCategory", mCategory);
		ResponseUtils.renderJson(response, jo.toString());
	}
	
	@RequestMapping(value = "/updateMag.do")
	public void updateMag(Mag mag,HttpServletResponse response){
		MagExample magExample = new MagExample();
		magExample.createCriteria().andMagIssnEqualTo(mag.getMagIssn()).andMagCnEqualTo(mag.getMagCn());
		magMapper.updateByExampleSelective(mag, magExample);
		
		JSONObject jo = new JSONObject();
		jo.put("msg", "完成编辑");
		ResponseUtils.renderJson(response, jo.toString());
	}
	
	@RequestMapping(value = "/deleteBatchMag.do")
	public String deleteBatchMag(String[] checkissn,HttpServletResponse response){
		bookService.deleteBatchMag(checkissn);
		return "redirect:/backpage/toMag.do";
	}
	
	@RequestMapping(value = "/deleteOneMag.do")
	public void deleteOneMag(String magissn,HttpServletResponse response){
		MagExample magExample = new MagExample();
		magExample.createCriteria().andMagIssnEqualTo(magissn);
		int result = magMapper.deleteByExample(magExample);
		
		JSONObject jo = new JSONObject();
		jo.put("result", result);
		ResponseUtils.renderJson(response, jo.toString());
	}
	
	@RequestMapping(value = "/toManager.do")
	public String toManager(ModelMap model,Integer pageNo){
		User user = new User();
		user.setPageNo(Pagination.cpn(pageNo));
		user.setPageSize(10);
		user.setIsadministrator(0);
		
		Pagination users = userService.findAllPage(user);
		String url = "/"+ Constans.PROJECT_NAME +"/backpage/toManager.do";
		users.pageView(url, null);
		
		model.addAttribute("users", users);
		return "manager";
	}
	
	@RequestMapping(value = "/toManagerQuery.do")
	public String toManagerQuery(ModelMap model,Integer pageNo,String choice,String choiceValue){
		if(choice == null || choiceValue == null || StringUtils.isBlank(choiceValue)){
			model.addAttribute("msg", "不能为空");
			return "manager";
		}
		User user = new User();
		user.setPageNo(Pagination.cpn(pageNo));
		user.setPageSize(10);
		Pagination users = null;
		if(choice.equals("性别")){
			user.setSex(choiceValue);
			users = userService.findSexPage(user);
		}else if(choice.equals("用户类型")){
			user.setType(choiceValue);
			users = userService.findTypePage(user);
		}else if(choice.equals("所属学院")){
			user.setCollege(choiceValue);
			users = userService.findCollegePage(user);
		}else{
			model.addAttribute("msg", "请选择搜索范围");
			return "manager";
		}
		String url = "/"+ Constans.PROJECT_NAME +"/backpage/toManagerQuery.do";
		users.pageView(url, null);
		
		model.addAttribute("users", users);
		model.addAttribute("cValue", choiceValue);
		model.addAttribute("choice", choice);
		return "manager";
	}
	
	@RequestMapping(value = "/toBookPurchase.do")
	public String toBookPurchase(ModelMap model,Integer pageNo){
		MyBookPurchase mybookPurchase = new MyBookPurchase();
		mybookPurchase.setPageNo(Pagination.cpn(pageNo));
		mybookPurchase.setPageSize(14);
		String url = "/"+ Constans.PROJECT_NAME +"/backpage/toBookPurchase.do";
		Pagination pagination = bookService.selectPurchaseBookList(mybookPurchase);
		pagination.pageView(url, null);
		model.addAttribute("pagination", pagination);
		return "bookpurchase";
	}
	
	@RequestMapping(value = "/deleteBook.do")
	public void deleteBook(String isbn,HttpServletResponse response){
		BookPurchaseExample bookPurchaseExample = new BookPurchaseExample();
		bookPurchaseExample.createCriteria().andIsbnEqualTo(isbn);
		int result = bookPurchaseMapper.deleteByExample(bookPurchaseExample);
		
		JSONObject jo = new JSONObject();
		jo.put("result", result);
		ResponseUtils.renderJson(response, jo.toString());
	}
	
	@RequestMapping(value = "/deleteMag.do")
	public void deleteMag(String magissn,HttpServletResponse response){
		MagPurchaseExample magPurchaseExample = new MagPurchaseExample();
		magPurchaseExample.createCriteria().andMagIssnEqualTo(magissn);
		int result = magPurchaseMapper.deleteByExample(magPurchaseExample);
		
		JSONObject jo = new JSONObject();
		jo.put("result", result);
		ResponseUtils.renderJson(response, jo.toString());
	}
	
	@RequestMapping(value = "/deleteBooks.do")
	public String deleteBooks(String[] checkisbn,HttpServletResponse response){
		bookService.deleteBooks(checkisbn);
		return "redirect:/backpage/toBookPurchase.do";
	}
	
	@RequestMapping(value = "/deleteMags.do")
	public String deleteMags(String[] checkissn,HttpServletResponse response){
		bookService.deleteMags(checkissn);
		return "redirect:/backpage/toMagPurchase.do";
	}
	
	@RequestMapping(value = "/deleteBookZj.do")
	public void deleteBookZj(String isbn,HttpServletResponse response){
		BookUserdefinedExample bookUserdefinedExample = new BookUserdefinedExample();
		bookUserdefinedExample.createCriteria().andIsbnEqualTo(isbn);
		int result = bookUserdefinedMapper.deleteByExample(bookUserdefinedExample);
		
		JSONObject jo = new JSONObject();
		jo.put("result", result);
		ResponseUtils.renderJson(response, jo.toString());
	}
	
	@RequestMapping(value = "/deleteMagZj.do")
	public void deleteMagZj(String magissn,HttpServletResponse response){
		MagUserdefinedExample magUserdefinedExample = new MagUserdefinedExample();
		magUserdefinedExample.createCriteria().andMagIssnEqualTo(magissn);
		int result = magUserdefinedMapper.deleteByExample(magUserdefinedExample);
		
		JSONObject jo = new JSONObject();
		jo.put("result", result);
		ResponseUtils.renderJson(response, jo.toString());
	}
	
	@RequestMapping(value = "/deleteBooksZj.do")
	public String deleteBooksZj(String[] checkisbn,HttpServletResponse response){
		myBookUdMapper.deleteBooksZj(checkisbn);
		return "redirect:/backpage/toBookZj.do";
	}
	
	@RequestMapping(value = "/deleteMagsZj.do")
	public String deleteMagsZj(String[] checkissn,HttpServletResponse response){
		myMagUdMapper.deleteMagsZj(checkissn);
		return "redirect:/backpage/toMagZj.do";
	}
	
	@RequestMapping(value = "/exportBooks.do")
	public void exportBooks(HttpServletResponse response) throws Exception{
		String url = bookService.exportBooks();
		JSONObject jo = new JSONObject();
		jo.put("url", url);
		ResponseUtils.renderJson(response, jo.toString());
	}
	
	@RequestMapping(value = "/exportMags.do")
	public void exportMags(HttpServletResponse response) throws Exception{
		String url = bookService.exportMags();
		JSONObject jo = new JSONObject();
		jo.put("url", url);
		ResponseUtils.renderJson(response, jo.toString());
	}
	
	@RequestMapping(value = "/toMagPurchase.do")
	public String toMagPurchase(ModelMap model,Integer pageNo){
		MagPurchase magPurchase = new MagPurchase();
		magPurchase.setPageNo(Pagination.cpn(pageNo));
		magPurchase.setPageSize(14);
		String url = "/"+ Constans.PROJECT_NAME + "/backpage/toMagPurchase.do";
		Pagination pagination = bookService.selectPurchaseMagList(magPurchase);
		pagination.pageView(url, null);
		model.addAttribute("pagination", pagination);
		return "magpurchase";
	}
	
	@RequestMapping(value = "/toBookZj.do")
	public String toBookZj(ModelMap model,Integer pageNo){
		BookUserdefined bookUserdefined = new BookUserdefined();
		bookUserdefined.setPageNo(Pagination.cpn(pageNo));
		bookUserdefined.setPageSize(14);
		String url = "/"+ Constans.PROJECT_NAME +"/backpage/toBookZj.do";
		Pagination pagination = userService.findUserBook(bookUserdefined);
		pagination.pageView(url, null);
		model.addAttribute("pagination", pagination);
		return "bookzj";
	}
	
	@RequestMapping(value = "/toMagZj.do")
	public String toMagZj(ModelMap model,Integer pageNo){
		MagUserdefined magUserdefined = new MagUserdefined();
		magUserdefined.setPageNo(Pagination.cpn(pageNo));
		magUserdefined.setPageSize(14);
		
		String url = "/"+ Constans.PROJECT_NAME +"/backpage/toMagZj.do";
		Pagination pagination = userService.findUserMag(magUserdefined);
		pagination.pageView(url, null);
		model.addAttribute("pagination", pagination);
		return "magzj";
	}
}
