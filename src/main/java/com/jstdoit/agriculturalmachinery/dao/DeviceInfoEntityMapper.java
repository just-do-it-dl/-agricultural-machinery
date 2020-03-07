package com.jstdoit.agriculturalmachinery.dao;

import com.jstdoit.agriculturalmachinery.entity.DeviceInfoEntity;

public interface DeviceInfoEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(DeviceInfoEntity record);

    int insertSelective(DeviceInfoEntity record);

    DeviceInfoEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DeviceInfoEntity record);

    int updateByPrimaryKey(DeviceInfoEntity record);
}