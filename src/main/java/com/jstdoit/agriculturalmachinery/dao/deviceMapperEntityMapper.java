package com.jstdoit.agriculturalmachinery.dao;

import com.jstdoit.agriculturalmachinery.entity.deviceMapperEntity;

public interface deviceMapperEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(deviceMapperEntity record);

    int insertSelective(deviceMapperEntity record);

    deviceMapperEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(deviceMapperEntity record);

    int updateByPrimaryKey(deviceMapperEntity record);
}