package com.tsjg.core.service;

import java.util.List;

import com.tsjg.core.bean.BookUserdefined;
import com.tsjg.core.bean.User;
import com.tsjg.core.bean.UserMessage;

import cn.itcast.common.page.Pagination;

public interface UserService {
	Pagination findUserReview(User user);
	
	Pagination findUserBook(BookUserdefined bookUserdefined);
	
	List<UserMessage> findUserAllMsg(Integer userId);
	
	int findCountMsg(Integer userId);
	
	void insertPatch(UserMessage userMessage);
	
	Pagination findCollegePage(User user);
	
	Pagination findTypePage(User user);
	
	Pagination findSexPage(User user);
	
	Pagination findAllPage(User user);
}
