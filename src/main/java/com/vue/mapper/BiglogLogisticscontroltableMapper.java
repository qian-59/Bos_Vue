package com.vue.mapper;

import com.vue.model.BiglogLogisticscontroltable;

public interface BiglogLogisticscontroltableMapper {
    int deleteByPrimaryKey(Short id);

    int insert(BiglogLogisticscontroltable record);

    int insertSelective(BiglogLogisticscontroltable record);

    BiglogLogisticscontroltable selectByPrimaryKey(Short id);

    int updateByPrimaryKeySelective(BiglogLogisticscontroltable record);

    int updateByPrimaryKey(BiglogLogisticscontroltable record);
}