package com.jstdoit.agriculturalmachinery.advice;

/**
 * @Description: 设备删除
 * @Date: 2020/5/6 21:58
 * @Author: qiaochangyu
 */
public class DeleteDeviceRepairException extends RuntimeException {
    public DeleteDeviceRepairException(String message) {
        super(message);
    }
}
