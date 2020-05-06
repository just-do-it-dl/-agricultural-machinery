package com.jstdoit.agriculturalmachinery.entity;


import lombok.Data;

/**
 * @Description: 设备申请bean
 * @Date: 2020/4/11 21:37
 * @Author: qiaochangyu
 */
@Data
public class ApplyBean {
    private String id;
    private String applyStartDate;
    private String applyEndDate;
    private String applyType;
    private String delayDate;
    private String acountNo;
    private String name;
    private String tel;
}
