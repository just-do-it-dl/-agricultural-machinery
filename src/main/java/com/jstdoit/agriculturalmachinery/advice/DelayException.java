package com.jstdoit.agriculturalmachinery.advice;

/**
 * @Description: 异常信息
 * @Date: 2020/5/4 17:17
 * @Author: qiaochangyu
 */
public class DelayException extends RuntimeException {
    public DelayException(String message) {
        super(message);
    }
}
