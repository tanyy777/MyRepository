package com.tyy.atcrowdfunding.manager.dao;


import java.util.List;

import com.tyy.atcrowdfunding.bean.Dictionary;

public interface DictionaryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Dictionary record);

    Dictionary selectByPrimaryKey(Integer id);

    List<Dictionary> selectAll();

    int updateByPrimaryKey(Dictionary record);
}