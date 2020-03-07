package com.jstdoit.agriculturalmachinery.dao;

import com.jstdoit.agriculturalmachinery.entity.deviceInfoEntity;

public interface deviceInfoEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(deviceInfoEntity record);

    int insertSelective(deviceInfoEntity record);

    deviceInfoEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(deviceInfoEntity record);

    int updateByPrimaryKey(deviceInfoEntity record);
}