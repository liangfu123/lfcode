package com.tsjg.core.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.itcast.common.page.Pagination;

import com.tsjg.core.bean.Book;
import com.tsjg.core.bean.Mag;
import com.tsjg.core.service.BookService;
import com.tsjg.core.web.Constans;

@Controller
public class RankController {
	@Autowired
	private BookService bookService;

	@RequestMapping(value = "/toRank.shtml")
	public String toRank(){
		return "rank";
	}
	
	@RequestMapping(value = "/toRankmag.shtml")
	public String toRankmag(Integer pageNo,ModelMap model){
		Mag mag = new Mag();
		mag.setPageNo(Pagination.cpn(pageNo));
		mag.setPageSize(8);
		
		Pagination pagination = bookService.findMagRank(mag);
		String url = "/"+ Constans.PROJECT_NAME +"/toRankmag.shtml";
		pagination.pageView(url, url);
		
		model.addAttribute("pagination", pagination);
		return "rankmag";
	}
	
	@RequestMapping(value = "/toRankbook.shtml")
	public String toRankbook(Integer pageNo,ModelMap model){
		Book book = new Book();
		book.setPageNo(Pagination.cpn(pageNo));
		book.setPageSize(15);
		
		Pagination pagination = bookService.findBookRank(book);
		String url = "/"+ Constans.PROJECT_NAME +"/toRankbook.shtml";
		pagination.pageView(url, url);
		
		model.addAttribute("pagination", pagination);
		return "rankbook";
	}
	
}
