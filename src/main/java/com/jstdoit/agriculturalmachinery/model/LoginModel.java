package com.jstdoit.agriculturalmachinery.model;

import lombok.Data;

/**
 * 登录请求参数
 *
 * @author caiyf
 * @date 2020-03-07
 */
@Data
public class LoginModel {
    private String acountNo;
    private String passWord;
}
