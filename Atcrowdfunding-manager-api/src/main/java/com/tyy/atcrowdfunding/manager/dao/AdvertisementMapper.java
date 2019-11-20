package com.tyy.atcrowdfunding.manager.dao;


import java.util.List;

import com.tyy.atcrowdfunding.bean.Advertisement;

public interface AdvertisementMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Advertisement record);

    Advertisement selectByPrimaryKey(Integer id);

    List<Advertisement> selectAll();

    int updateByPrimaryKey(Advertisement record);
}