package com.jstdoit.agriculturalmachinery.entity;

import lombok.Data;

/**
 * @Description: 详情
 * @Date: 2020/4/11 20:59
 * @Author: qiaochangyu
 */
@Data
public class DetailBean {
    private String deviceName;
    private String id;
    private String usageStatus;
    private String repairStatus;
    private String name;
    private String repairName;
    private String deviceType;
    private Integer purchasPrice;
    private String purchasDate;
    private String addr;
    private Integer useTime;
    private Integer repairTime;
    private String repairDesc;
    private String repairCause;
}
