package com.tyy.atcrowdfunding.manager.service.impl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tyy.atcrowdfunding.bean.User;
import com.tyy.atcrowdfunding.manager.dao.UserMapper;
import com.tyy.atcrowdfunding.manager.service.UserService;
import com.tyy.atcrowdfunding.potal.exception.LoginFailException;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserMapper userMapper;

	@Override
	public User findUserByPswdAndAcct(Map map) {
		User user = userMapper.getUserByPswdAndAcct(map);
		if(user == null){
			throw new LoginFailException("用户名或密码错误!!");
		}
		return user;
	}

}
