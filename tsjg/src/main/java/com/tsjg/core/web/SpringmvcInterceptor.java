package com.tsjg.core.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.tsjg.common.web.session.SessionProvider;
import com.tsjg.core.bean.User;
import com.tsjg.core.dao.UserMapper;

public class SpringmvcInterceptor implements HandlerInterceptor {
	@Autowired
	private SessionProvider sessionProvider;
	@Autowired
	private UserMapper userMapper;
	
	//方法前
	public boolean preHandle(HttpServletRequest request, HttpServletResponse arg1,
			Object arg2) throws Exception {
		boolean flag = false;
		
		User u = (User) sessionProvider.getAttribute(request, Constans.USER_SESSION);
		User user = userMapper.selectByPrimaryKey(u.getUserId());
		
		if(user.getRealname() == null || user.getRealname().isEmpty() 
				|| user.getSex() == null || user.getSex().isEmpty()
				|| user.getPhone() == null || user.getPhone().isEmpty()
				|| user.getEmail() == null || user.getEmail().isEmpty()
				|| user.getQq() == null || user.getQq().isEmpty()){
			flag = true;
		}
		request.setAttribute("flag", flag);
		
		System.out.println("pre");
		return true;
	}
	
	//页面渲染后
	public void afterCompletion(HttpServletRequest arg0,
			HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		// TODO Auto-generated method stub
		System.out.println("after");
	}
	//方法后
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1,
			Object arg2, ModelAndView arg3) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("post");
	}


}
