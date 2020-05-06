package com.jstdoit.agriculturalmachinery.dao;

import com.jstdoit.agriculturalmachinery.entity.ApplyInfoEntity;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
@Mapper
public interface ApplyInfoEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ApplyInfoEntity record);

    int insertSelective(ApplyInfoEntity record);

    ApplyInfoEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ApplyInfoEntity record);

    int updateByPrimaryKey(ApplyInfoEntity record);
    //审批列表查询
    List<ApplyInfoEntity> selectList(ApplyInfoEntity applyInfoEntity);
    //我的设备列表
    List<ApplyInfoEntity> selectApplyList(String name);
}