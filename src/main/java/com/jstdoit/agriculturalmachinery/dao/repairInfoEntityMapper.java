package com.jstdoit.agriculturalmachinery.dao;

import com.jstdoit.agriculturalmachinery.entity.repairInfoEntity;

public interface repairInfoEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(repairInfoEntity record);

    int insertSelective(repairInfoEntity record);

    repairInfoEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(repairInfoEntity record);

    int updateByPrimaryKey(repairInfoEntity record);
}