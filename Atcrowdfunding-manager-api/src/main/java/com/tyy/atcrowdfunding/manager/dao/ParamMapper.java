package com.tyy.atcrowdfunding.manager.dao;


import java.util.List;

import com.tyy.atcrowdfunding.bean.Param;

public interface ParamMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Param record);

    Param selectByPrimaryKey(Integer id);

    List<Param> selectAll();

    int updateByPrimaryKey(Param record);
}