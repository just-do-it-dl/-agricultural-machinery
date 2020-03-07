package com.jstdoit.agriculturalmachinery.dao;

import com.jstdoit.agriculturalmachinery.entity.DeviceMapperEntity;

public interface DeviceMapperEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(DeviceMapperEntity record);

    int insertSelective(DeviceMapperEntity record);

    DeviceMapperEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DeviceMapperEntity record);

    int updateByPrimaryKey(DeviceMapperEntity record);
}