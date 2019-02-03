package com.tsjg.core.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.itcast.common.page.Pagination;

import com.tsjg.core.bean.BookUserdefined;
import com.tsjg.core.bean.User;
import com.tsjg.core.bean.UserMessage;
import com.tsjg.core.dao.MyBookUdMapper;
import com.tsjg.core.dao.UserMapper;
import com.tsjg.core.dao.UserMessageMapper;

@Service
@Transactional
public class UserServiceImpl implements UserService {
	@Resource
	private UserMapper userMapper;
	@Resource
	private UserMessageMapper userMessageMapper;
	@Resource
	private MyBookUdMapper myBookUdMapper;
	
	public Pagination findAllPage(User user) {
		Pagination pagination = new Pagination(user.getPageNo(), user.getPageSize(), userMapper.findCountPage(user));
		pagination.setList(userMapper.findAllPage(user));
		return pagination;
	}

	public Pagination findSexPage(User user) {
		Pagination pagination = new Pagination(user.getPageNo(), user.getPageSize(), userMapper.findCountSex(user.getSex()));
		pagination.setList(userMapper.findSexPage(user));
		return pagination;
	}

	public Pagination findTypePage(User user) {
		Pagination pagination = new Pagination(user.getPageNo(), user.getPageSize(), userMapper.findCountType(user.getType()));
		pagination.setList(userMapper.findTypePage(user));
		return pagination;
	}

	public Pagination findCollegePage(User user) {
		Pagination pagination = new Pagination(user.getPageNo(), user.getPageSize(), userMapper.findCountCollege(user.getCollege()));
		pagination.setList(userMapper.findCollegePage(user));
		return pagination;
	}

	public void insertPatch(UserMessage userMessage) {
		userMessageMapper.insertPatch(userMessage);
	}

	public int findCountMsg(Integer userId) {
		return userMessageMapper.findCountMsg(userId);
	}

	public List<UserMessage> findUserAllMsg(Integer userId) {
		return userMessageMapper.findUserAllMsg(userId);
	}

	public Pagination findUserBook(BookUserdefined bookUserdefined) {
		Pagination pagination = new Pagination(bookUserdefined.getPageNo(), bookUserdefined.getPageSize(), myBookUdMapper.findUserBookCount());
		pagination.setList(myBookUdMapper.findUserBook(bookUserdefined));
		return pagination;
	}

	public Pagination findUserReview(User user) {
		Pagination pagination = new Pagination(user.getPageNo(), user.getPageSize(), userMapper.findCountUserReview(user));
		pagination.setList(userMapper.findUserReview(user));
		return pagination;
	}

}
