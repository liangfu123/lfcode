package com.tsjg.core.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tsjg.common.encode.Md5Pwd;
import com.tsjg.common.web.json.ResponseUtils;
import com.tsjg.common.web.session.SessionProvider;
import com.tsjg.core.bean.User;
import com.tsjg.core.bean.UserExample;
import com.tsjg.core.bean.UserMessage;
import com.tsjg.core.bean.UserMessageExample;
import com.tsjg.core.dao.UserMapper;
import com.tsjg.core.dao.UserMessageMapper;
import com.tsjg.core.service.UserService;
import com.tsjg.core.web.Constans;

@Controller
public class UserController {
	@Autowired
	private UserMapper userMapper;
	@Autowired
	private SessionProvider sessionProvider;
	@Autowired
	private Md5Pwd md5Pwd;
	@Autowired
	private UserService userService;
	@Autowired
	private UserMessageMapper userMessageMapper;
	
	/**
	 * 清空
	 * @param request
	 * @param response
	 */
	@RequestMapping(value = "deleteAll.shtml")
	public void deleteAll(HttpServletRequest request,HttpServletResponse response){
		User user = (User)sessionProvider.getAttribute(request, Constans.USER_SESSION);
		
		UserMessageExample userMessageExample = new UserMessageExample();
		userMessageExample.createCriteria().andUserIdEqualTo(user.getUserId());
		
		userMessageMapper.deleteByExample(userMessageExample);
		
		JSONObject jo = new JSONObject();
		jo.put("msg", "请刷新页面");
		ResponseUtils.renderJson(response, jo.toString());
	}
	
	/**
	 * 标为已读
	 * @param request
	 * @param response
	 */
	@RequestMapping(value = "readAll.shtml")
	public void readAll(HttpServletRequest request,HttpServletResponse response){
		User user = (User)sessionProvider.getAttribute(request, Constans.USER_SESSION);
		
		UserMessageExample userMessageExample = new UserMessageExample();
		userMessageExample.createCriteria().andUserIdEqualTo(user.getUserId());
		
		UserMessage userMessage = new UserMessage();
		userMessage.setIsread(1);
		
		userMessageMapper.updateByExampleSelective(userMessage, userMessageExample);
		
		JSONObject jo = new JSONObject();
		jo.put("msg", "请刷新页面");
		ResponseUtils.renderJson(response, jo.toString());
	}
	
	/**
	 * 跳转到系统消息
	 * @return
	 */
	@RequestMapping(value = "/toMsg.shtml")
	public String toMsg(HttpServletRequest request,ModelMap model){
		User user = (User)sessionProvider.getAttribute(request, Constans.USER_SESSION);
		int count = userService.findCountMsg(user.getUserId());
		
		List<UserMessage> msglist = userService.findUserAllMsg(user.getUserId());
		
		model.addAttribute("msglist", msglist);
		model.addAttribute("count", count);
		return "msg";
	}
	
	@RequestMapping(value = "/updatepwd.shtml")
	public String updatepwd(String oldPwd,String newPwd,String password,HttpServletRequest request,ModelMap model){
		User user = (User) sessionProvider.getAttribute(request, Constans.USER_SESSION);
		if(oldPwd != null && StringUtils.isNotBlank(oldPwd) && newPwd != null && StringUtils.isNotBlank(newPwd) && password != null && StringUtils.isNotBlank(password)){
			UserExample userExample = new UserExample();
			userExample.createCriteria().andUsernameEqualTo(user.getUsername());
			User u = userMapper.selectByExample(userExample).get(0);
			
			if(md5Pwd.encode(oldPwd).equals(u.getPassword())){
				if(newPwd.equals(password)){
					user.setPassword(md5Pwd.encode(password));
					userMapper.updateByExample(user, userExample);
					model.addAttribute("message", "修改成功");
				}else{
					model.addAttribute("message", "确认密码不一致，请重新输入");
					return "updatepwd";
				}
			}else{
				model.addAttribute("message", "密码错误");
				return "updatepwd";
			}
		}else{
			model.addAttribute("message", "密码不能为空");
			return "updatepwd";
		}
		
		return "updatepwd";
	}
	
	/**
	 * 跳转到修改密码
	 * @return
	 */
	@RequestMapping(value = "/toUpdatepwd.shtml")
	public String toUpdatepwd(HttpServletRequest request,ModelMap model){
		User user = (User)sessionProvider.getAttribute(request, Constans.USER_SESSION);
		int count = userService.findCountMsg(user.getUserId());
		model.addAttribute("count", count);
		return "updatepwd";
	}
	
	@RequestMapping(value = "/updatePersonal.shtml")
	public String updatePersonal(User user,ModelMap model,HttpServletRequest request){
		User u = (User) sessionProvider.getAttribute(request, Constans.USER_SESSION);
		UserExample userExample = new UserExample();
		userExample.createCriteria().andUsernameEqualTo(u.getUsername());
		userMapper.updateByExampleSelective(user, userExample);
		return "redirect:/toPersonal.shtml";
	}
	
	/**
	 * 跳转到完善资料
	 * @return
	 */
	@RequestMapping(value = "/toPersonal.shtml")
	public String toPersonal(HttpServletRequest request,ModelMap model){
		User u = (User) sessionProvider.getAttribute(request, Constans.USER_SESSION);
		UserExample userExample = new UserExample();
		userExample.createCriteria().andUsernameEqualTo(u.getUsername());
		User user = userMapper.selectByExample(userExample).get(0);
		
		int count = userService.findCountMsg(u.getUserId());
		
		model.addAttribute("count", count);
		model.addAttribute("user", user);
		return "personal";
	}
	
	/**
	 * 退出登录
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/logout.shtml")
	public String logout(HttpServletRequest request){
		sessionProvider.logout(request);
		return "login";
	}
	
	/**
	 * 跳转到登录页面
	 * @return
	 */
	@RequestMapping(value = "/toLogin.shtml")
	public String toLogin(){
		return "login";
	}
	
	/**
	 * 跳转到前台主页
	 * @return
	 */
	@RequestMapping(value = "/toMainFront.shtml")
	public String toMainFront(){
		return "main";
	}
	
	/**
	 * 跳转到后台主页
	 * @return
	 */
	@RequestMapping(value = "/backpage/toMain.do")
	public String toMain(){
		return "main";
	}
	
	/**
	 * 登录
	 * @return
	 */
	@RequestMapping(value = "/login.shtml")
	public String login(String username,String password,String verifycode,HttpServletRequest request,ModelMap model){
		if(username != null && StringUtils.isNotBlank(username) 
				&& password != null && StringUtils.isNotBlank(password)
				&& verifycode != null && StringUtils.isNotBlank(verifycode)){
			UserExample userExample = new UserExample();
			userExample.createCriteria().andUsernameEqualTo(username);
			List<User> u = userMapper.selectByExample(userExample);
			if(u.size() > 0 && !u.isEmpty()){
				for(User user : u){
					if(md5Pwd.encode(password).equals(user.getPassword())){
						if(sessionProvider.getAttribute(request, "key").equals(verifycode)){
							sessionProvider.setAttribute(request, Constans.USER_SESSION, user);
							if(user.getIsadministrator() == 0){
								return "main";
							}else{
								return "redirect:/backpage/toMain.do";
							}
						}else{
							model.addAttribute("msg", "验证码错误");
							return "login";
						}
					}else{
						model.addAttribute("msg", "密码错误");
						return "login";
					}
				}
			}else{
				model.addAttribute("msg", "该用户不存在");
				return "login";
			}	
		}else{
			model.addAttribute("msg", "不能为空");
			return "login";
		}
		return "login";	
	}
	
	/**
	 * 跳转到注册页面
	 * @return
	 */
	@RequestMapping(value = "/toRegister.shtml")
	public String toRegister(){
		return "register";
	}
	
	/**
	 * 注册
	 * @return
	 */
	@RequestMapping(value = "/register.shtml")
	public String register(String username,String password,String verifypwd,String verifycode,ModelMap model,HttpServletRequest request){
		if(username != null && StringUtils.isNotBlank(username) 
				&& password != null && StringUtils.isNotBlank(password) 
				&& verifypwd != null && StringUtils.isNotBlank(verifypwd) 
				&& verifycode != null && StringUtils.isNotBlank(verifycode)){
			UserExample userExample = new UserExample();
			userExample.createCriteria().andUsernameEqualTo(username);
			List<User> u = userMapper.selectByExample(userExample);
			if( u.size() == 0 && u.isEmpty()){
				if(password.equals(verifypwd) ){
					if(sessionProvider.getAttribute(request, "key").equals(verifycode)){
							User user = new User();
							user.setUsername(username);
							user.setPassword(md5Pwd.encode(password));
							userMapper.insertSelective(user);
							model.addAttribute("msg", "注册成功，请登录");
							return "register";
					}else{
						model.addAttribute("msg", "验证码错误");
						return "register";
					}
				}else{
					model.addAttribute("msg", "两次密码不一致");
					return "register";
				}
			}else{
				model.addAttribute("msg", "该账号已存在，请直接登录");
				return "register";
			}
		}else{
			model.addAttribute("msg", "不能为空");
			return "register";
		}
	}
	
	@RequestMapping(value = "/toTop.shtml")
	public String toTop(HttpServletRequest request,ModelMap model){
		User user = (User)sessionProvider.getAttribute(request, Constans.USER_SESSION);
		int count = userService.findCountMsg(user.getUserId());
		model.addAttribute("count", count);
		return "top";
	}
	
	@RequestMapping(value = "/toLeft.shtml")
	public String toLeft(){
		return "left";
	}
	
	@RequestMapping(value = "/toRight.shtml")
	public String toRight(){
		return "right";
	}
	
	@RequestMapping(value = "/toSearch.shtml")
	public String toSearch(){
		return "search";
	}
	
}
