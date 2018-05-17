package com.csdn.dao;

import com.csdn.entity.HxGoodWill;

public interface HxGoodWillMapper {
    int deleteByPrimaryKey(String id);

    int insert(HxGoodWill record);

    int insertSelective(HxGoodWill record);

    HxGoodWill selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(HxGoodWill record);

    int updateByPrimaryKey(HxGoodWill record);
}