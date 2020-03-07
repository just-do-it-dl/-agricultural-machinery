package com.jstdoit.agriculturalmachinery.entity;

import java.util.Date;

public class ApplyInfoEntity {
    private Integer id;

    private Integer deviceInfoId;

    private Date applyStartDate;

    private Date applyEndDate;

    private Integer applyLenth;

    private Integer applyAcountNo;

    private Integer applyStatus;

    private Integer approvalAcountNo;

    private Date approvalDate;

    private Integer applyType;

    private Integer relateId;

    private Date delayDate;

    private Integer delayTimes;

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

    public Date getApplyStartDate() {
        return applyStartDate;
    }

    public void setApplyStartDate(Date applyStartDate) {
        this.applyStartDate = applyStartDate;
    }

    public Date getApplyEndDate() {
        return applyEndDate;
    }

    public void setApplyEndDate(Date applyEndDate) {
        this.applyEndDate = applyEndDate;
    }

    public Integer getApplyLenth() {
        return applyLenth;
    }

    public void setApplyLenth(Integer applyLenth) {
        this.applyLenth = applyLenth;
    }

    public Integer getApplyAcountNo() {
        return applyAcountNo;
    }

    public void setApplyAcountNo(Integer applyAcountNo) {
        this.applyAcountNo = applyAcountNo;
    }

    public Integer getApplyStatus() {
        return applyStatus;
    }

    public void setApplyStatus(Integer applyStatus) {
        this.applyStatus = applyStatus;
    }

    public Integer getApprovalAcountNo() {
        return approvalAcountNo;
    }

    public void setApprovalAcountNo(Integer approvalAcountNo) {
        this.approvalAcountNo = approvalAcountNo;
    }

    public Date getApprovalDate() {
        return approvalDate;
    }

    public void setApprovalDate(Date approvalDate) {
        this.approvalDate = approvalDate;
    }

    public Integer getApplyType() {
        return applyType;
    }

    public void setApplyType(Integer applyType) {
        this.applyType = applyType;
    }

    public Integer getRelateId() {
        return relateId;
    }

    public void setRelateId(Integer relateId) {
        this.relateId = relateId;
    }

    public Date getDelayDate() {
        return delayDate;
    }

    public void setDelayDate(Date delayDate) {
        this.delayDate = delayDate;
    }

    public Integer getDelayTimes() {
        return delayTimes;
    }

    public void setDelayTimes(Integer delayTimes) {
        this.delayTimes = delayTimes;
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