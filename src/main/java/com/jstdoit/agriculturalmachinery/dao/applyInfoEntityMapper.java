package com.jstdoit.agriculturalmachinery.dao;

import com.jstdoit.agriculturalmachinery.entity.applyInfoEntity;

public interface applyInfoEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(applyInfoEntity record);

    int insertSelective(applyInfoEntity record);

    applyInfoEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(applyInfoEntity record);

    int updateByPrimaryKey(applyInfoEntity record);
}