package com.csdn.dao;

import com.csdn.entity.HxGoodWillItem;

public interface HxGoodWillItemMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(HxGoodWillItem record);

    int insertSelective(HxGoodWillItem record);

    HxGoodWillItem selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(HxGoodWillItem record);

    int updateByPrimaryKey(HxGoodWillItem record);
}