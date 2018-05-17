package com.csdn.dao;

import com.csdn.entity.HxServerItem;

public interface HxServerItemMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(HxServerItem record);

    int insertSelective(HxServerItem record);

    HxServerItem selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(HxServerItem record);

    int updateByPrimaryKey(HxServerItem record);
}