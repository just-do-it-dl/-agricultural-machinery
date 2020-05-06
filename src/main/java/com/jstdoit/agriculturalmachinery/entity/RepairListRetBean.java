package com.jstdoit.agriculturalmachinery.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: 维修列表查询返回bean
 * @Date: 2020/4/18 15:39
 * @Author: qiaochangyu
 */
public class RepairListRetBean {
  private List<RepairInfoEntity> retList = new ArrayList<>();

    public List<RepairInfoEntity> getRetList() {
        return retList;
    }

    public void setRetList(List<RepairInfoEntity> retList) {
        this.retList = retList;
    }
}
