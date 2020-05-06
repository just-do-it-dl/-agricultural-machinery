package com.jstdoit.agriculturalmachinery.service;

import com.jstdoit.agriculturalmachinery.dao.UserEntityMapper;
import com.jstdoit.agriculturalmachinery.entity.UserEntity;
import com.jstdoit.agriculturalmachinery.model.CodeEnum;
import com.jstdoit.agriculturalmachinery.model.LoginModel;
import com.jstdoit.agriculturalmachinery.model.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

/**
 * 通用
 *
 * @author caiyf
 * @date 2020-03-07
 */
@Service
public class CommonService {

    @Autowired
    private UserEntityMapper userDao;

    /**
     * 登录
     * @param param
     * @return
     */
    public Result<UserEntity> login(LoginModel param) {
//        UserEntity user = userDao.selectByAccount(param.getAccountNo());
//        if (Objects.isNull(user)) {
//            return Result.getExceptionResult(CodeEnum.NULL_USER);
//        }
        return null;
    }

}
