package com.tsjg.core.controller;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.itcast.common.page.Pagination;

import com.tsjg.core.bean.Book;
import com.tsjg.core.service.BookService;

@Controller
public class BookController {
	@Autowired
	private BookService bookService;

	
	@RequestMapping(value = "/toBook.shtml")
	public String  toBook(){
		return "book";
	}
	
	@RequestMapping(value = "/searchBook.shtml")
	public String searchBook(Integer pageNo,Integer choiseType,String inputValue,ModelMap model){
		if(inputValue != null && StringUtils.isNotBlank(inputValue)){
			Book book = new Book();
			book.setPageNo(Pagination.cpn(pageNo));
			book.setPageSize(16);
			if(choiseType == 1){
				book.setBookName(inputValue);
			}else if(choiseType == 2){
				book.setBookAuthor(inputValue);
			}else if(choiseType == 3){
				book.setIsbn(inputValue);
			}else if(choiseType == 4){
				book.setBookPublish(inputValue);
			}
			Pagination pagination = bookService.findBookSearch(book);
			String url = "/tsjg/searchBook.shtml";
			String params = "&choiseType=" + choiseType + "&inputValue=" + inputValue;
			pagination.pageView(url, params);
			
			model.addAttribute("inputValue", inputValue);
			model.addAttribute("pagination", pagination);
		}else{
			model.addAttribute("msg", "请输入检索内容");
		}
		return "right";
	}
	
	@RequestMapping(value = "/multiSearchBook.shtml")
	public String multiSearchBook(String bookName,String bookAuthor,
			String bookPublish,String isbn,
			Integer pageNo,ModelMap model){
		
		if(StringUtils.isBlank(bookName) 
		&& StringUtils.isBlank(bookAuthor)
		&& StringUtils.isBlank(bookPublish) 
		&& StringUtils.isBlank(isbn)){
			model.addAttribute("msg", "至少输入一个搜索内容");
			return "search";
		}
		Book book = new Book();
		book.setPageNo(Pagination.cpn(pageNo));
		book.setPageSize(14);
		StringBuilder params = new StringBuilder();
		
		if(bookName != null && StringUtils.isNotBlank(bookName)){
			book.setBookName(bookName);
			params.append("&bookName="+bookName);
			model.addAttribute("bookName", bookName);
		}
		if(bookAuthor != null && StringUtils.isNotBlank(bookAuthor)){
			book.setBookAuthor(bookAuthor);
			params.append("&bookAuthor="+bookAuthor);
			model.addAttribute("bookAuthor", bookAuthor);
		}
		if(bookPublish != null && StringUtils.isNotBlank(bookPublish)){
			book.setBookPublish(bookPublish);
			params.append("&bookPublish="+bookPublish);
			model.addAttribute("bookPublish", bookPublish);
		}
		if(isbn != null && StringUtils.isNotBlank(isbn)){
			book.setIsbn(isbn);
			params.append("&isbn="+isbn);
			model.addAttribute("isbn", isbn);
		}
		
		Pagination pagination = bookService.findMultiBookSearch(book);
		String url = "/tsjg/multiSearchBook.shtml";
		pagination.pageView(url, params.toString());
		
		model.addAttribute("pagination", pagination);
		return "search";
	}
	
	@RequestMapping(value = "/toBookCnclass.shtml")
	public String toBookCnclass(Integer pageNo,ModelMap model){
		Book book = new Book();
		book.setPageNo(Pagination.cpn(pageNo));
		book.setPageSize(15);
		book.setBookCnclassLetter("A");
		
		String url = "/tsjg/bookCnclass.shtml";
		Pagination pagination = bookService.findBookCnclass(book);
		pagination.pageView(url, null);
		
		model.addAttribute("pagination", pagination);
		
		return "bookcnclass";
	}
	
	@RequestMapping(value = "/bookCnclass.shtml")
	public String bookCnclass(String bookCnclassLetter,Integer pageNo,ModelMap model){
		Book book = new Book();
		book.setPageNo(Pagination.cpn(pageNo));
		book.setPageSize(15);
		book.setBookCnclassLetter(bookCnclassLetter);
		
		String url = "/tsjg/bookCnclass.shtml";
		Pagination pagination = bookService.findBookCnclass(book);
		pagination.pageView(url, null);
		
		model.addAttribute("pagination", pagination);
		
		return "bookcnclass";
	}
	
	@RequestMapping(value = "/toBooksubject.shtml")
	public String toBooksubject(Integer pageNo,ModelMap model){
		Book book = new Book();
		book.setPageNo(Pagination.cpn(pageNo));
		book.setPageSize(15);
		book.setBookSubjectId(1);
		
		String url = "/tsjg/toBooksubject.shtml";
		Pagination pagination = bookService.findBookSubject(book);
		pagination.pageView(url, null);
		
		model.addAttribute("pagination", pagination);
		return "booksubject";
	}
	
	@RequestMapping(value = "/booksubject.shtml")
	public String booksubject(Integer subjectId,Integer pageNo,ModelMap model){
		Book book = new Book();
		book.setPageNo(Pagination.cpn(pageNo));
		book.setPageSize(15);
		book.setBookSubjectId(subjectId);
		
		String url = "/tsjg/booksubject.shtml";
		Pagination pagination = bookService.findBookSubject(book);
		pagination.pageView(url, null);
		
		model.addAttribute("pagination", pagination);
		return "booksubject";
	}
	
	@RequestMapping(value = "/toBookcategory.shtml")
	public String toBookcategory(Integer pageNo,ModelMap model){
		Book book = new Book();
		book.setPageNo(Pagination.cpn(pageNo));
		book.setPageSize(14);
		book.setBookCategoryId(1);
		
		String url = "/tsjg/toBookcategory.shtml";
		Pagination pagination = bookService.findBookCategory(book);
		pagination.pageView(url, null);
		
		model.addAttribute("pagination", pagination);
		return "bookcategory";
	}
	
	@RequestMapping(value = "/bookcategory.shtml")
	public String bookcategory(Integer categoryId,Integer pageNo,ModelMap model){
		Book book = new Book();
		book.setPageNo(Pagination.cpn(pageNo));
		book.setPageSize(14);
		book.setBookCategoryId(categoryId);;
		
		String url = "/tsjg/bookcategory.shtml";
		Pagination pagination = bookService.findBookCategory(book);
		pagination.pageView(url, null);
		
		model.addAttribute("pagination", pagination);
		return "bookcategory";
	}
	
	@RequestMapping(value = "/toNewbook.shtml")
	public String  toNewbook(){
		return "newbook";
	}
	
	@RequestMapping(value = "/toNewbooklist.shtml")
	public String  toNewbooklist(Integer pageNo,ModelMap model){
		Book book = new Book();
		book.setPageNo(Pagination.cpn(pageNo));
		book.setPageSize(12);
		
		Pagination pagination = bookService.findNewBooks(book);
		
		String url = "/tsjg/toNewbooklist.shtml";
		pagination.pageView(url, null);
		model.addAttribute("pagination", pagination);
		
		return "newbooklist";
	}
	
}
