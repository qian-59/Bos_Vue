package com.vue.mapper;

import com.vue.model.IaeExtract;

public interface IaeExtractMapper {
    int deleteByPrimaryKey(String id);

    int insert(IaeExtract record);

    int insertSelective(IaeExtract record);

    IaeExtract selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(IaeExtract record);

    int updateByPrimaryKey(IaeExtract record);
}