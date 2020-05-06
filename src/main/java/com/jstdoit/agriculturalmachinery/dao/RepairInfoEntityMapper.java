package com.jstdoit.agriculturalmachinery.dao;

import com.jstdoit.agriculturalmachinery.entity.ApplyBean;
import com.jstdoit.agriculturalmachinery.entity.RepairInfoEntity;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface RepairInfoEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(RepairInfoEntity record);

    int insertSelective(RepairInfoEntity record);

    RepairInfoEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RepairInfoEntity record);

    int updateByPrimaryKey(RepairInfoEntity record);
    //维修列表查询
    List<RepairInfoEntity> repairList(ApplyBean applyBean);
}