package com.tsjg.core.controller;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.itcast.common.page.Pagination;

import com.tsjg.core.bean.Mag;
import com.tsjg.core.service.BookService;
import com.tsjg.core.web.Constans;

@Controller
public class MagController {
	@Autowired
	private BookService bookService;
	
	@RequestMapping(value = "/toMag.shtml")
	public String toMag(){
		return "mag";
	}
	
	@RequestMapping(value = "/searchMag.shtml")
	public String searchMag(Integer pageNo,Integer choiseType,String inputValue,ModelMap model){
		if(inputValue != null && StringUtils.isNotBlank(inputValue)){
			Mag mag = new Mag();
			mag.setPageNo(Pagination.cpn(pageNo));
			mag.setPageSize(10);
			if(choiseType == 1){
				mag.setMagTitle(inputValue);
			}else if(choiseType == 2){
				mag.setMagIssn(inputValue);
			}else if(choiseType == 3){
				mag.setMagCn(inputValue);
			}else if(choiseType == 4){
				mag.setMagPubcycle(inputValue);
			}
			Pagination pagination = bookService.findMagSearch(mag);
			String url = "/"+ Constans.PROJECT_NAME +"/searchMag.shtml";
			String params = "&choiseType=" + choiseType + "&inputValue=" + inputValue;
			pagination.pageView(url, params);
			
			model.addAttribute("inputValue", inputValue);
			model.addAttribute("pagination", pagination);
		}else{
			model.addAttribute("msg", "请输入检索内容");
		}
		return "magsearch";
	}
	
	@RequestMapping(value = "/toMagsearch.shtml")
	public String toMagsearch(){
		return "magsearch";
	}
	
	@RequestMapping(value = "/toMagCategory.shtml")
	public String toMagCategory(Integer pageNo,ModelMap model){
		Mag mag = new Mag();
		mag.setPageNo(Pagination.cpn(pageNo));
		mag.setPageSize(8);
		mag.setMagCategoryId("1");
		
		Pagination pagination = bookService.findMagCategory(mag);
		String url = "/"+ Constans.PROJECT_NAME +"/toMagCategory.shtml";
		pagination.pageView(url, url);
		
		model.addAttribute("pagination", pagination);
		return "magcategory";
	}
	
	@RequestMapping(value = "/magCategory.shtml")
	public String magCategory(String categoryId,Integer pageNo,ModelMap model){
		Mag mag = new Mag();
		mag.setPageNo(Pagination.cpn(pageNo));
		mag.setPageSize(8);
		mag.setMagCategoryId(categoryId);
		
		Pagination pagination = bookService.findMagCategory(mag);
		String url = "/"+ Constans.PROJECT_NAME +"/magCategory.shtml";
		pagination.pageView(url, url);
		
		model.addAttribute("pagination", pagination);
		
		return "magcategory";
	}
	
	@RequestMapping(value = "/toNewMaglist.shtml")
	public String  toNewMaglist(Integer pageNo,ModelMap model){
		Mag mag = new Mag();
		
		mag.setPageNo(Pagination.cpn(pageNo));
		mag.setPageSize(12);
		
		Pagination pagination = bookService.findNewMags(mag);
		
		String url = "/"+ Constans.PROJECT_NAME +"/toNewMaglist.shtml";
		pagination.pageView(url, null);
		model.addAttribute("pagination", pagination);
		
		return "newmaglist";
	}
	
}
