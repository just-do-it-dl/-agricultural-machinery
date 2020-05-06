package com.jstdoit.agriculturalmachinery.entity;

import java.util.Date;

public class RepairInfoEntity {
    private Integer id;

    private Integer deviceInfoId;

    private String repairDesc;

    private String repairCause;

    private String repairStartDate;

    private String repairEndDate;

    private String name;

    private Integer approvalAcountNo;

    private Integer repairStatus;

    private Date createdAt;

    private Date updatedAt;

    private Integer isDeleted;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDeviceInfoId() {
        return deviceInfoId;
    }

    public void setDeviceInfoId(Integer deviceInfoId) {
        this.deviceInfoId = deviceInfoId;
    }

    public String getRepairDesc() {
        return repairDesc;
    }

    public void setRepairDesc(String repairDesc) {
        this.repairDesc = repairDesc;
    }

    public String getRepairCause() {
        return repairCause;
    }

    public void setRepairCause(String repairCause) {
        this.repairCause = repairCause;
    }

    public String getRepairStartDate() {
        return repairStartDate;
    }

    public void setRepairStartDate(String repairStartDate) {
        this.repairStartDate = repairStartDate;
    }

    public String getRepairEndDate() {
        return repairEndDate;
    }

    public void setRepairEndDate(String repairEndDate) {
        this.repairEndDate = repairEndDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getApprovalAcountNo() {
        return approvalAcountNo;
    }

    public void setApprovalAcountNo(Integer approvalAcountNo) {
        this.approvalAcountNo = approvalAcountNo;
    }

    public Integer getRepairStatus() {
        return repairStatus;
    }

    public void setRepairStatus(Integer repairStatus) {
        this.repairStatus = repairStatus;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Integer getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
    }
}