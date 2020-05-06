package com.jstdoit.agriculturalmachinery.entity;

import java.util.Date;

public class DeviceInfoEntity {
    private String name;
    private String deviceName;
    private String deviceType;

    private String acountNo;
    private Integer id;

    private Integer deviceMapperId;

    private Date purchasDate;

    private Integer purchasPrice;

    private String addr;

    private Integer usageStatus;

    private Integer repairStatus;

    private Date createdAt;

    private Date updatedAt;

    private Boolean isDeleted;

    private Integer useTime;

    private Integer repairTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDeviceMapperId() {
        return deviceMapperId;
    }

    public void setDeviceMapperId(Integer deviceMapperId) {
        this.deviceMapperId = deviceMapperId;
    }

    public Date getPurchasDate() {
        return purchasDate;
    }

    public void setPurchasDate(Date purchasDate) {
        this.purchasDate = purchasDate;
    }

    public Integer getPurchasPrice() {
        return purchasPrice;
    }

    public void setPurchasPrice(Integer purchasPrice) {
        this.purchasPrice = purchasPrice;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public Integer getUsageStatus() {
        return usageStatus;
    }

    public void setUsageStatus(Integer usageStatus) {
        this.usageStatus = usageStatus;
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

    public Integer getUseTime() {
        return useTime;
    }

    public void setUseTime(Integer useTime) {
        this.useTime = useTime;
    }

    public Integer getRepairTime() {
        return repairTime;
    }

    public void setRepairTime(Integer repairTime) {
        this.repairTime = repairTime;
    }

    public String getAcountNo() {
        return acountNo;
    }

    public void setAcountNo(String acountNo) {
        this.acountNo = acountNo;
    }

    public Boolean getDeleted() {
        return isDeleted;
    }

    public void setDeleted(Boolean deleted) {
        isDeleted = deleted;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }
}