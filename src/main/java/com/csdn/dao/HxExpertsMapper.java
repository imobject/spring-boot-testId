package com.csdn.dao;

import com.csdn.entity.HxExperts;

public interface HxExpertsMapper {
    int deleteByPrimaryKey(String id);

    int insert(HxExperts record);

    int insertSelective(HxExperts record);

    HxExperts selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(HxExperts record);

    int updateByPrimaryKey(HxExperts record);
}