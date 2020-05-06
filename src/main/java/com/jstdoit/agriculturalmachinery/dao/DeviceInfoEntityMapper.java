package com.jstdoit.agriculturalmachinery.dao;

import com.jstdoit.agriculturalmachinery.entity.DetailBean;
import com.jstdoit.agriculturalmachinery.entity.DeviceInfoEntity;
import com.jstdoit.agriculturalmachinery.entity.QueryListBean;
import com.jstdoit.agriculturalmachinery.entity.QueryListReqBean;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface DeviceInfoEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(DeviceInfoEntity record);

    int insertSelective(DeviceInfoEntity record);

    DeviceInfoEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DeviceInfoEntity record);

    int updateByPrimaryKey(DeviceInfoEntity record);
    //查询用户类型
    String selectRole(String acountNo);
    //列表查询
    List<QueryListBean> selectList(QueryListReqBean reqBean);
    //详情查询
    DetailBean selectDetail(QueryListReqBean reqBean);
    //更新设备使用次数
    int updateUseTime(String id);
    //更新设备状态
    int updateState(Integer id);
    //更新设备维修状态
    int updateRepairState(Integer id);
    //更新设备维修状态
    int updateRepairState1(Integer id);

}