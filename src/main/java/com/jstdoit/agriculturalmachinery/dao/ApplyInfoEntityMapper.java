package com.jstdoit.agriculturalmachinery.dao;

import com.jstdoit.agriculturalmachinery.entity.ApplyInfoEntity;

public interface ApplyInfoEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ApplyInfoEntity record);

    int insertSelective(ApplyInfoEntity record);

    ApplyInfoEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ApplyInfoEntity record);

    int updateByPrimaryKey(ApplyInfoEntity record);
}