package com.jstdoit.agriculturalmachinery.entity;

import lombok.Data;

import java.util.Date;
@Data
public class ApplyInfoEntity {
    private Integer id;

    private Integer deviceInfoId;

    private String applyStartDate;

    private String applyEndDate;

    private Integer applyLenth;

    private String name;

    private Integer applyStatus;

    private Integer approvalAcountNo;

    private Date approvalDate;

    private Integer applyType;

    private Integer relateId;

    private Date delayDate;

    private Date createdAt;

    private Date updatedAt;

    private Boolean isDeleted;
    private String acountNo;
    private Integer pageIndex;
    private Integer pageNum;

}