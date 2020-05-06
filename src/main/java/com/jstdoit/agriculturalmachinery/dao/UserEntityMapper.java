package com.jstdoit.agriculturalmachinery.dao;

import com.jstdoit.agriculturalmachinery.entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface UserEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserEntity record);

    int insertSelective(UserEntity record);

    UserEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserEntity record);

    int updateByPrimaryKey(UserEntity record);
    //查询该用户延期次数
    int selectDelay(String acountNo);
    //更新延期次使用次数
    int updateDelay(String name);
    //判断账号是否存在
    int selectCountAccount(String acount);
    //判断用户名称是否存在
    int selectCountName(String name);
    UserEntity selectByAccount(String acount);

}