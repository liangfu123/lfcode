package com.tsjg.core.service;


import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import cn.itcast.common.page.Pagination;

import com.tsjg.core.bean.Book;
import com.tsjg.core.bean.BookComment;
import com.tsjg.core.bean.BookUserdefined;
import com.tsjg.core.bean.Mag;
import com.tsjg.core.bean.MagComment;
import com.tsjg.core.bean.MagPurchase;
import com.tsjg.core.bean.MagUserdefined;
import com.tsjg.core.bean.MyBookPurchase;

public interface BookService {
	Pagination findNewBooks(Book book);
	
	Pagination findNewMags(Mag mag);
	
	void updateMagIsget(String[] magIssn);
	
	void updateMagJgIsget(String[] magIssn);
	
	void updateBookIsget(String[] isbn);
	
	void updateBookJgIsget(String[] isbn);
	
	Pagination findUserMagJg(MagUserdefined magUserdefined, Integer userId);
	
	Pagination findUserBookJg(BookUserdefined bookUserdefined,Integer userId);
	
	Pagination findReaderMag(Mag mag,Integer userId);
	
	Pagination findReaderBook(Book book,Integer userId);
	
	void updateMagNum(String magIssn);
	
	void updateBookNum(String isbn);
	
	List<MagComment> findMagComment(Integer magId);
	
	List<BookComment> findBookComment(Integer bookId);
	
	Pagination findMagSearch(Mag mag);
	
	Pagination findMultiBookSearch(Book book);
	
	Pagination findBookSearch(Book book);
	
	Pagination findMagRank(Mag mag);
	
	Pagination findBookRank(Book book);
	
	Mag findMagInfo(String magIssn);
	
	Pagination findMagCategory(Mag mag);
	
	Book findBookInfo(String isbn);
	
	Pagination findBookCnclass(Book book);
	
	Pagination findBookCategory(Book book);
	
	Pagination findBookSubject(Book book);
	
	String exportMags() throws Exception;
	
	String exportBooks() throws Exception;
	
	boolean batchImportBook(MultipartFile file) throws Exception;
	
	boolean batchImportMag(MultipartFile file) throws Exception;
	
	Pagination findAllBook(Book book);
	
	Pagination findAllMag(Mag mag);
	
	void deleteBatchBook(String[] isbns);
	
	void deleteBatchMag(String[] magIssn);
	
	Pagination selectPurchaseBookList(MyBookPurchase mybookPurchase);
	
	Pagination selectPurchaseMagList(MagPurchase magPurchase);
	
	void deleteBooks(String[] isbn);
	
	void deleteMags(String[] issn);

}
