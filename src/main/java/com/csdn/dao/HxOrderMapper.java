package com.csdn.dao;

import com.csdn.entity.HxOrder;

public interface HxOrderMapper {
    int deleteByPrimaryKey(String id);

    int insert(HxOrder record);

    int insertSelective(HxOrder record);

    HxOrder selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(HxOrder record);

    int updateByPrimaryKey(HxOrder record);
}