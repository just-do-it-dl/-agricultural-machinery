package com.jstdoit.agriculturalmachinery.advice;

/**
 * @Description: 用户登录
 * @Date: 2020/5/6 22:53
 * @Author: qiaochangyu
 */
public class LoginException extends RuntimeException {
    public LoginException(String message) {
        super(message);
    }
}
