package com.vue.mapper;

import com.vue.model.LogTrack;

public interface LogTrackMapper {
    int deleteByPrimaryKey(Short id);

    int insert(LogTrack record);

    int insertSelective(LogTrack record);

    LogTrack selectByPrimaryKey(Short id);

    int updateByPrimaryKeySelective(LogTrack record);

    int updateByPrimaryKey(LogTrack record);
}