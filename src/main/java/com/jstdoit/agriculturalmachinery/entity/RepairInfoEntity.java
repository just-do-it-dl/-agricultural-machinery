package com.jstdoit.agriculturalmachinery.entity;

import java.util.Date;

public class RepairInfoEntity {
    private Integer id;

    private Integer deviceInfoId;

    private String repairDesc;

    private String repairCause;

    private Date repairStartDate;

    private Date repairEndDate;

    private Integer repairAcountNo;

    private Integer approvalAcountNo;

    private Integer repairStatus;

    private Date createdAt;

    private Date updatedAt;

    private Boolean isDeleted;

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

    public Date getRepairStartDate() {
        return repairStartDate;
    }

    public void setRepairStartDate(Date repairStartDate) {
        this.repairStartDate = repairStartDate;
    }

    public Date getRepairEndDate() {
        return repairEndDate;
    }

    public void setRepairEndDate(Date repairEndDate) {
        this.repairEndDate = repairEndDate;
    }

    public Integer getRepairAcountNo() {
        return repairAcountNo;
    }

    public void setRepairAcountNo(Integer repairAcountNo) {
        this.repairAcountNo = repairAcountNo;
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

    public Boolean getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }
}