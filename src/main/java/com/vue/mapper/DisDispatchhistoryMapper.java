package com.vue.mapper;

import com.vue.model.DisDispatchhistory;

public interface DisDispatchhistoryMapper {
    int deleteByPrimaryKey(Short id);

    int insert(DisDispatchhistory record);

    int insertSelective(DisDispatchhistory record);

    DisDispatchhistory selectByPrimaryKey(Short id);

    int updateByPrimaryKeySelective(DisDispatchhistory record);

    int updateByPrimaryKey(DisDispatchhistory record);
}