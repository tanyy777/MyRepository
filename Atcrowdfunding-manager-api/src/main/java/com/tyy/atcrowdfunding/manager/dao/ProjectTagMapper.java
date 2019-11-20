package com.tyy.atcrowdfunding.manager.dao;


import java.util.List;

import com.tyy.atcrowdfunding.bean.ProjectTag;

public interface ProjectTagMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ProjectTag record);

    ProjectTag selectByPrimaryKey(Integer id);

    List<ProjectTag> selectAll();

    int updateByPrimaryKey(ProjectTag record);
}