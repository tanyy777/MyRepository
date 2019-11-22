package com.tyy.atcrowdfunding.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tyy.atcrowdfunding.bean.User;
import com.tyy.atcrowdfunding.manager.service.UserService;
import com.tyy.atcrowdfunding.potal.util.Const;
import com.tyy.atcrowdfunding.potal.util.MD5Util;
import com.tyy.atcrowdfunding.potal.util.Success;

@Controller
public class DispatcherController {

	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/index")
	public String indvex(){
		return "index";
	}
	
	@RequestMapping(value="/login")
	public String login(){
		
		return "login";
	}
	
	@ResponseBody
	@RequestMapping(value="/doLogin")
	public Success doLogin(String loginacct,String userpswd,String type,HttpSession session){
		Map map = new HashMap<String, Object>();
		map.put("loginacct", loginacct);
		map.put("userpswd", MD5Util.digest16(userpswd));
		map.put("type", type);
		
		User user = userService.findUserByPswdAndAcct(map);
		System.out.println(user);
		if(user == null){
			return Success.innit(false).addMessage("用户名或者密码不正确!!");
		}else{
			session.setAttribute(Const.LOGIN_USER, user);
			return Success.innit(true);
		}
		
	}
	@RequestMapping(value="main")
	public String toMain(){
		
		return "main";
	}
	
	@RequestMapping(value="/domain")
	public String domain(HttpSession session){
		return "redirect:/main.htm";
	}
	
	@RequestMapping(value="/loginout")
	public String loginout(HttpSession session){
		session.removeAttribute("user");
		return "redirect:/index.htm";
	}
}
