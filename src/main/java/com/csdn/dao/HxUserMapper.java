package com.csdn.dao;

import com.csdn.entity.HxUser;

public interface HxUserMapper {
    int deleteByPrimaryKey(String id);

    int insert(HxUser record);

    int insertSelective(HxUser record);

    HxUser selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(HxUser record);

    int updateByPrimaryKey(HxUser record);
}