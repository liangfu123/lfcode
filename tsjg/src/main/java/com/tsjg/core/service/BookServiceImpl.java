package com.tsjg.core.service;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import cn.itcast.common.page.Pagination;

import com.tsjg.common.encode.ExcelUtil;
import com.tsjg.core.bean.Book;
import com.tsjg.core.bean.BookComment;
import com.tsjg.core.bean.BookUserdefined;
import com.tsjg.core.bean.Mag;
import com.tsjg.core.bean.MagComment;
import com.tsjg.core.bean.MagPurchase;
import com.tsjg.core.bean.MagUserdefined;
import com.tsjg.core.bean.MyBookPurchase;
import com.tsjg.core.dao.BookCommentMapper;
import com.tsjg.core.dao.BookJgMapper;
import com.tsjg.core.dao.BookMapper;
import com.tsjg.core.dao.BookUserdefinedMapper;
import com.tsjg.core.dao.MagCommentMapper;
import com.tsjg.core.dao.MagJgMapper;
import com.tsjg.core.dao.MagMapper;
import com.tsjg.core.dao.MagUserdefinedMapper;
import com.tsjg.core.dao.MyBookMapper;
import com.tsjg.core.dao.MyBookPurchaseMapper;
import com.tsjg.core.dao.MyBookUdMapper;
import com.tsjg.core.dao.MyMagMapper;
import com.tsjg.core.dao.MyMagPurchaseMapper;
import com.tsjg.core.dao.MyMagUdMapper;

@Service
@Transactional
public class BookServiceImpl implements BookService {
	@Resource
	private ExcelUtil excelUtil;
	@Resource
	private BookMapper bookMapper;
	@Resource
	private MagMapper magMapper;
	@Resource
	private MyBookMapper myBookMapper;
	@Resource
	private MyMagMapper myMagMapper;
	@Resource 
	private MyBookPurchaseMapper myBookPurchaseMapper;
	@Resource
	private MyMagPurchaseMapper myMagPurchaseMapper;
	@Resource
	private BookCommentMapper bookCommentMapper;
	@Resource
	private MagCommentMapper magCommentMapper;
	@Resource
	private BookUserdefinedMapper bookUserdefinedMapper;
	@Resource
	private MagUserdefinedMapper magUserdefinedMapper;
	@Resource
	private BookJgMapper bookJgMapper;
	@Resource
	private MagJgMapper magJgMapper;
	@Resource
	private MyBookUdMapper myBookUdMapper;
	@Resource
	private MyMagUdMapper myMagUdMapper;
	
	public boolean batchImportBook(MultipartFile file) throws Exception {
		boolean b = false;
		List<Book> bookList = excelUtil.readExcelBook(file);
		
		if(bookList != null){
			b = true;
		}
		
		for (Book book : bookList) {
			book.setBookAddtime(new Date());
			bookMapper.insertSelective(book);
		}
		return b;
	}

	public Pagination findAllBook(Book book) {
		Pagination pagination = new Pagination(book.getPageNo(), book.getPageSize(), myBookMapper.findCountBook());
		pagination.setList(myBookMapper.findAllBook(book));
		return pagination;
	}

	public boolean batchImportMag(MultipartFile file) throws Exception {
		boolean b = false;
		
		List<Mag> magList = excelUtil.readExcelMag(file);
		
		if(magList != null){
			b = true;
		}
		
		for (Mag mag : magList) {
			mag.setMagAddtime(new Date());
			magMapper.insertSelective(mag);
		}
		
		return b;
	}

	public Pagination findAllMag(Mag mag) {
		Pagination pagination = new Pagination(mag.getPageNo(), mag.getPageSize(),myMagMapper.findCountMag());
		pagination.setList(myMagMapper.findAllMag(mag));
		return pagination;
	}

	public void deleteBatchBook(String[] isbns) {
		myBookMapper.deleteBatch(isbns);
	}

	public void deleteBatchMag(String[] magIssn) {
		myMagMapper.deleteBatch(magIssn);
	}

	public Pagination selectPurchaseBookList(MyBookPurchase mybookPurchase) {
		Pagination pagination = new Pagination(mybookPurchase.getPageNo(), mybookPurchase.getPageSize(), myBookPurchaseMapper.selectPurchaseBookCount());
		pagination.setList(myBookPurchaseMapper.selectPurchaseBookList(mybookPurchase));
		return pagination;
	}

	public Pagination selectPurchaseMagList(MagPurchase magPurchase) {
		Pagination pagination = new Pagination(magPurchase.getPageNo(), magPurchase.getPageSize(), myMagPurchaseMapper.selectPurchaseMagCount());
		pagination.setList(myMagPurchaseMapper.selectPurchaseMagList(magPurchase));
		return pagination;
	}

	public void deleteBooks(String[] isbn) {
		myBookPurchaseMapper.deleteBooks(isbn);
	}

	public void deleteMags(String[] issn) {
		myMagPurchaseMapper.deleteMags(issn);
	}

	public String exportBooks() throws Exception {
		List<MyBookPurchase> booklist = myBookPurchaseMapper.selectPurchaseBookAll();
		if(booklist == null || booklist.size() == 0){
			return "荐购书目为空";
		}else{		
			return "导出成功!保存在"+ excelUtil.writeExcelBook(booklist);
		}
	}

	public String exportMags() throws Exception {
		List<MagPurchase> maglist = myMagPurchaseMapper.selectPurchaseMagAll();
		if(maglist == null || maglist.size() == 0){
			return "荐购书目为空";
		}else{
			return "导出成功!保存在"+ excelUtil.writeExcelMag(maglist);
		}
	}


	public String exportBooksZj() throws Exception {
		List<BookUserdefined> booklists = myBookUdMapper.findBooksZjAll();
		if(booklists == null || booklists.size() == 0){
			return "用户自荐书目为空";
		}else{
			return "导出成功!保存在"+ excelUtil.writeExcelBookZj(booklists);
		}
	}

	public String exportMagsZj() throws Exception {
		List<MagUserdefined> maglists = myMagUdMapper.findMagsZjAll();
		if(maglists == null || maglists.size() == 0){
			return "用户自荐书目为空";
		}else{
			return "导出成功!保存在"+ excelUtil.writeExcelMagZj(maglists);
		}
	}
	
	public Pagination findBookSubject(Book book) {
		Pagination pagination = new Pagination(book.getPageNo(), book.getPageSize(), myBookMapper.findBookSubjectCount(book.getBookSubjectId()));
		pagination.setList(myBookMapper.findBookSubject(book));
		return pagination;
	}

	public Pagination findBookCategory(Book book) {
		Pagination pagination = new Pagination(book.getPageNo(), book.getPageSize(), myBookMapper.findBookCategoryCount(book.getBookCategoryId()));
		pagination.setList(myBookMapper.findBookCategory(book));
		return pagination;
	}

	public Book findBookInfo(String isbn) {
		return myBookMapper.findBookInfo(isbn);
	}

	public Pagination findMagCategory(Mag mag) {
		Pagination pagination = new Pagination(mag.getPageNo(), mag.getPageSize(), myMagMapper.findMagCategoryCount(Integer.parseInt(mag.getMagCategoryId())));
		pagination.setList(myMagMapper.findMagCategory(mag));
		return pagination;
	}

	public Mag findMagInfo(String magIssn) {
		return myMagMapper.findMagInfo(magIssn);
	}

	public Pagination findBookRank(Book book) {
		Pagination pagination = new Pagination(book.getPageNo(), book.getPageSize(), myBookMapper.findBookRankCount());
		pagination.setList(myBookMapper.findBookRank(book));
		return pagination;
	}

	public Pagination findMagRank(Mag mag) {
		Pagination pagination = new Pagination(mag.getPageNo(), mag.getPageSize(), myMagMapper.findMagRankCount());
		pagination.setList(myMagMapper.findMagRank(mag));
		return pagination;
	}

	public Pagination findBookSearch(Book book) {
		Pagination pagination = new Pagination(book.getPageNo(), book.getPageSize(), myBookMapper.findBookSearchCount(book));
		pagination.setList(myBookMapper.findBookSearch(book));
		return pagination;
	}

	public Pagination findMultiBookSearch(Book book) {
		Pagination pagination = new Pagination(book.getPageNo(), book.getPageSize(), myBookMapper.findMultiBookSearchCount(book));
		pagination.setList(myBookMapper.findMultiBookSearch(book));
		return pagination;
	}

	public Pagination findMagSearch(Mag mag) {
		Pagination pagination = new Pagination(mag.getPageNo(), mag.getPageSize(), myMagMapper.findMagSearchCount(mag));
		pagination.setList(myMagMapper.findMagSearch(mag));
		return pagination;
	}

	public List<BookComment> findBookComment(Integer bookId) {
		return bookCommentMapper.findBookComment(bookId);
	}

	public List<MagComment> findMagComment(Integer magId) {
		return magCommentMapper.findMagComment(magId);
	}

	public void updateBookNum(String isbn) {
		myBookMapper.updateBookNum(isbn);
	}

	public void updateMagNum(String magIssn) {
		myMagMapper.updateMagNum(magIssn);
	}

	public Pagination findReaderBook(Book book,Integer userId) {
		Pagination pagination = new Pagination(book.getPageNo(), book.getPageSize(), myBookMapper.findReaderBookCount(userId));
		pagination.setList(myBookMapper.findReaderBook(book));
		return pagination;
	}

	public Pagination findReaderMag(Mag mag, Integer userId) {
		Pagination pagination = new Pagination(mag.getPageNo(), mag.getPageSize(), myMagMapper.findReaderMagCount(userId));
		pagination.setList(myMagMapper.findReaderMag(mag));
		return pagination;
	}

	public Pagination findUserBookJg(BookUserdefined bookUserdefined,
			Integer userId) {
		Pagination pagination = new Pagination(bookUserdefined.getPageNo(), bookUserdefined.getPageSize(), bookUserdefinedMapper.findUserBookJgCount(userId));
		pagination.setList(bookUserdefinedMapper.findUserBookJg(bookUserdefined));
		return pagination;
	}

	public Pagination findUserMagJg(MagUserdefined magUserdefined,
			Integer userId) {
		Pagination pagination = new Pagination(magUserdefined.getPageNo(), magUserdefined.getPageSize(), magUserdefinedMapper.findUserMagJgCount(userId));
		pagination.setList(magUserdefinedMapper.findUserMagJg(magUserdefined));
		return pagination;
	}

	public void updateBookJgIsget(String[] isbn) {
		bookJgMapper.updateBookIsget(isbn);
	}

	public void updateMagJgIsget(String[] magIssn) {
		magJgMapper.updateMagIsget(magIssn);
	}

	public void updateMagIsget(String[] magIssn) {
		myMagMapper.updateMagIsget(magIssn);
	}

	public void updateBookIsget(String[] isbn) {
		myBookMapper.updateBookIsget(isbn);
	}

	public Pagination findNewBooks(Book book) {
		Pagination pagination = new Pagination(book.getPageNo(), book.getPageSize(),myBookMapper.findNewBooksCount());
		pagination.setList(myBookMapper.findNewBooks(book));
		return pagination;
	}

	public Pagination findNewMags(Mag mag) {
		Pagination pagination = new Pagination(mag.getPageNo(), mag.getPageSize(),myMagMapper.findNewMagsCount());
		pagination.setList(myMagMapper.findNewMags(mag));
		return pagination;
	}

	public Pagination findBookCnclass(Book book) {
		Pagination pagination = new Pagination(book.getPageNo(), book.getPageSize(), myBookMapper.findBookCnclassCount(book.getBookCnclassLetter()));
		pagination.setList(myBookMapper.findBookCnclass(book));
		return pagination;
	}
	
}
