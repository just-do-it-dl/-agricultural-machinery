package com.jstdoit.agriculturalmachinery.dao;

import com.jstdoit.agriculturalmachinery.entity.RepairInfoEntity;

public interface RepairInfoEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(RepairInfoEntity record);

    int insertSelective(RepairInfoEntity record);

    RepairInfoEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RepairInfoEntity record);

    int updateByPrimaryKey(RepairInfoEntity record);
}