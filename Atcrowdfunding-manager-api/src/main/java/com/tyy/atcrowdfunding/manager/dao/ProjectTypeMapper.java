package com.tyy.atcrowdfunding.manager.dao;


import java.util.List;

import com.tyy.atcrowdfunding.bean.ProjectType;

public interface ProjectTypeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ProjectType record);

    ProjectType selectByPrimaryKey(Integer id);

    List<ProjectType> selectAll();

    int updateByPrimaryKey(ProjectType record);
}