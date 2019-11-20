package com.tyy.atcrowdfunding.manager.dao;


import java.util.List;
import java.util.Map;

import com.tyy.atcrowdfunding.bean.User;

public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    User selectByPrimaryKey(Integer id);

    List<User> selectAll();

    int updateByPrimaryKey(User record);

	User queryUserlogin(Map<String, Object> paramMap);

	User getUserByPswdAndAcct(Map map);
}