package com.jstdoit.agriculturalmachinery.controller;

import com.jstdoit.agriculturalmachinery.entity.UserEntity;
import com.jstdoit.agriculturalmachinery.model.LoginModel;
import com.jstdoit.agriculturalmachinery.model.Result;
import com.jstdoit.agriculturalmachinery.service.CommonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *  公用
 *
 *  @author caiyf
 *  @date 2020-03-07
 */
@RestController
@RequestMapping("/api/v1.0/common")
public class CommonController {

    @Autowired
    private CommonService commonService;

    @PostMapping("login")
    public Result<UserEntity> login(@RequestBody LoginModel param) {
        return commonService.login(param);
    }

}
