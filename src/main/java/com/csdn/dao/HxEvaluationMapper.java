package com.csdn.dao;

import com.csdn.entity.HxEvaluation;

public interface HxEvaluationMapper {
    int deleteByPrimaryKey(String id);

    int insert(HxEvaluation record);

    int insertSelective(HxEvaluation record);

    HxEvaluation selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(HxEvaluation record);

    int updateByPrimaryKey(HxEvaluation record);
}