package com.vue.mapper;

import com.vue.model.SorCheckbounddetails;

public interface SorCheckbounddetailsMapper {
    int deleteByPrimaryKey(Short id);

    int insert(SorCheckbounddetails record);

    int insertSelective(SorCheckbounddetails record);

    SorCheckbounddetails selectByPrimaryKey(Short id);

    int updateByPrimaryKeySelective(SorCheckbounddetails record);

    int updateByPrimaryKey(SorCheckbounddetails record);
}