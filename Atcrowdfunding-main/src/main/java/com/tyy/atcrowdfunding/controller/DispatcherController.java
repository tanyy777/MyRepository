package com.tyy.atcrowdfunding.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tyy.atcrowdfunding.bean.User;
import com.tyy.atcrowdfunding.manager.service.UserService;
import com.tyy.atcrowdfunding.potal.util.Const;

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
	
	@RequestMapping(value="/doLogin")
	public String doLogin(String loginacct,String userpswd,String type,HttpSession session){
		Map map = new HashMap<String, Object>();
		map.put("loginacct", loginacct);
		map.put("userpswd", userpswd);
		map.put("type", type);
		
		User user = userService.findUserByPswdAndAcct(map);
		
		session.setAttribute(Const.LOGIN_USER, user);
		return "redirect:main.htm";
	}
	@RequestMapping(value="main")
	public String toMain(){
		
		return "main";
	}
}
