package com.vue.mapper;

import com.vue.model.BasDeliverystandard;

public interface BasDeliverystandardMapper {
    int deleteByPrimaryKey(Short id);

    int insert(BasDeliverystandard record);

    int insertSelective(BasDeliverystandard record);

    BasDeliverystandard selectByPrimaryKey(Short id);

    int updateByPrimaryKeySelective(BasDeliverystandard record);

    int updateByPrimaryKey(BasDeliverystandard record);
}