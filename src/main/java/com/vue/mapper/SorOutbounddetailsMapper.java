package com.vue.mapper;

import com.vue.model.SorOutbounddetails;

public interface SorOutbounddetailsMapper {
    int deleteByPrimaryKey(Short id);

    int insert(SorOutbounddetails record);

    int insertSelective(SorOutbounddetails record);

    SorOutbounddetails selectByPrimaryKey(Short id);

    int updateByPrimaryKeySelective(SorOutbounddetails record);

    int updateByPrimaryKey(SorOutbounddetails record);
}