package com.jstdoit.agriculturalmachinery.entity;

import lombok.Data;

/**
 * @Description: 设备列表查询返回bean
 * @Date: 2020/4/11 19:57
 * @Author: qiaochangyu
 */
@Data
public class QueryListBean {
    private String deviceName;
    private Integer id;
    private String usageStatus;
    private String name;
    private String repairStatus;
}
