package com.vue.mapper;

import com.vue.model.SyMenus;

public interface SyMenusMapper {
    int deleteByPrimaryKey(Short id);

    int insert(SyMenus record);

    int insertSelective(SyMenus record);

    SyMenus selectByPrimaryKey(Short id);

    int updateByPrimaryKeySelective(SyMenus record);

    int updateByPrimaryKey(SyMenus record);
}