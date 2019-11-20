package com.tyy.atcrowdfunding.manager.service;

import java.util.Map;

import com.tyy.atcrowdfunding.bean.User;

public interface UserService {

	User findUserByPswdAndAcct(Map map);

}
