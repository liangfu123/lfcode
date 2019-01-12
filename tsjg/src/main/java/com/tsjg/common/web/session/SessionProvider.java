package com.tsjg.common.web.session;

import java.io.Serializable;

import javax.servlet.http.HttpServletRequest;

/**
 * session供应类
 * @author Administrator
 *
 */
public interface SessionProvider {
	//往session设置值
	//name Constants user_session
	//value 用户对象
	public void setAttribute(HttpServletRequest request,String name,Serializable value);
	
	//从session中取值
	public Serializable getAttribute(HttpServletRequest request,String name);
	
	//退出登录
	public void logout(HttpServletRequest request);
	
	//获取SessionId
	public String getSessionId(HttpServletRequest request);
}
