package com.jstdoit.agriculturalmachinery.advice;

/**
 * @Description: 用户注册
 * @Date: 2020/5/6 22:42
 * @Author: qiaochangyu
 */
public class RegisterException extends RuntimeException {
    public RegisterException(String message) {
        super(message);
    }
}
