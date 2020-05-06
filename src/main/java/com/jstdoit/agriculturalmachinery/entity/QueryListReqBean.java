package com.jstdoit.agriculturalmachinery.entity;

import lombok.Data;

/**
 * @Description: 列表查询请求bean
 * @Date: 2020/4/11 19:54
 * @Author: qiaochangyu
 */
@Data
public class QueryListReqBean {
  private String deviceName;
  private String id;
  private String repairStatus;
  private String usageStatus;
  private int pageIndex;
  private int pageNum;
  private int name;

}
