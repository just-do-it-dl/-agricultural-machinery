/**
 * init table
 * @author caiyf
 * @date 2020-03-07
 */
CREATE DATABASE agricultural_machinery;
CREATE TABLE user (
  id INT(64) AUTO_INCREMENT PRIMARY KEY COMMENT '主键',
  acount_no VARCHAR(32) DEFAULT '' COMMENT '账户号',
  name VARCHAR(32) DEFAULT '' COMMENT '名称',
  password VARCHAR(32) DEFAULT '' COMMENT '密码',
  tel VARCHAR(32) DEFAULT '' COMMENT '手机号',
  role_id TINYINT(1) DEFAULT 0 COMMENT '角色id，1-设备管理员、2-维修人员、3-使用人员',
  created_at DATETIME DEFAULT '1970-01-01 00:00:00' COMMENT '创建时间',
  updated_at DATETIME DEFAULT '1970-01-01 00:00:00' COMMENT '更新时间',
  is_deleted TINYINT(1) DEFAULT 0 COMMENT '是否有效，1-有效、2-无效'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT '用户表';

CREATE TABLE device_mapper (
  id INT(64) AUTO_INCREMENT PRIMARY KEY COMMENT '主键',
  device_no INT(8) DEFAULT 0 COMMENT '设备编号',
  device_name VARCHAR(64) DEFAULT '' COMMENT '设备名称',
  device_param VARCHAR(64) DEFAULT '' COMMENT '设备参数',
  device_type INT(1) DEFAULT 0 COMMENT '设备类型',
  created_at DATETIME DEFAULT '1970-01-01 00:00:00' COMMENT '创建时间',
  updated_at DATETIME DEFAULT '1970-01-01 00:00:00' COMMENT '更新时间',
  is_deleted TINYINT(1) DEFAULT 0 COMMENT '是否有效，1-有效、2-无效'
)  ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT '设备映射表';

CREATE TABLE device_info (
  id INT(64) AUTO_INCREMENT PRIMARY KEY COMMENT '主键',
  device_mapper_id INT(8) DEFAULT 0 COMMENT '设备所属',
  purchas_date DATETIME DEFAULT '1970-01-01 00:00:00' COMMENT '购买时间',
  purchas_price INT(32) DEFAULT '-1' COMMENT '购买价格',
  addr VARCHAR(64) DEFAULT '' COMMENT '设备所在地址',
  usage_status INT(1) DEFAULT '0' COMMENT '使用状态，1-空闲、2-申请使用中、3-使用中',
  repair_status INT(1) DEFAULT '0' COMMENT '维修状态，1-正常、2-申请维修中、3-维修中',
  created_at DATETIME DEFAULT '1970-01-01 00:00:00' COMMENT '创建时间',
  updated_at DATETIME DEFAULT '1970-01-01 00:00:00' COMMENT '更新时间',
  is_deleted TINYINT(1) DEFAULT 0 COMMENT '是否有效，1-有效、2-无效'
)  ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT '设备信息表';

CREATE TABLE apply_info (
  id INT(64) AUTO_INCREMENT PRIMARY KEY COMMENT '主键',
  device_info_id INT(64) DEFAULT 0 COMMENT '设备id',
  apply_start_date DATETIME DEFAULT '1970-01-01 00:00:00' COMMENT '申请开始时间',
  apply_end_date DATETIME DEFAULT '1970-01-01 00:00:00' COMMENT '申请结束时间',
  apply_lenth INT(64) DEFAULT 0 COMMENT '使用时长',
  apply_acount_no INT(32) DEFAULT 0 COMMENT '申请人账户号',
  apply_status INT(1) DEFAULT '0' COMMENT '申请状态，1-申请中、2-审批中、3-审批成功、4-审批失败',
  approval_acount_no INT(32) DEFAULT 0 COMMENT '审批人账户号',
  approval_date DATETIME DEFAULT '1970-01-01 00:00:00' COMMENT '审批时间',
  apply_type INT(1) DEFAULT 0 DEFAULT '申请类型，1-正常申请、2-延期申请',
  relate_id INT(64) DEFAULT 0 DEFAULT '关联id，正常申请为0，延期申请为对应id',
  delay_date DATETIME DEFAULT '1970-01-01 00:00:00' COMMENT '延期时间',
  delay_times INT(1) COMMENT 0 COMMENT '延期次数',
  created_at DATETIME DEFAULT '1970-01-01 00:00:00' COMMENT '创建时间',
  updated_at DATETIME DEFAULT '1970-01-01 00:00:00' COMMENT '更新时间',
  is_deleted TINYINT(1) DEFAULT 0 COMMENT '是否有效，1-有效、2-无效'
)  ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT '设备申请表';

CREATE TABLE repair_info (
  id INT(64) AUTO_INCREMENT PRIMARY KEY COMMENT '主键',
  device_info_id INT(64) DEFAULT 0 COMMENT '设备id',
  repair_desc VARCHAR(128) DEFAULT '' COMMENT '故障描述',
  repair_cause VARCHAR(128) DEFAULT '' COMMENT '故障原因',
  repair_start_date DATETIME DEFAULT '1970-01-01 00:00:00' COMMENT '维修分配时间',
  repair_end_date DATETIME DEFAULT '1970-01-01 00:00:00' COMMENT '维修完成时间',
  repair_acount_no INT(32) DEFAULT 0 COMMENT '维修人账户号',
  approval_acount_no INT(32) DEFAULT 0 COMMENT '分配人账户号',
  repair_status INT(1) DEFAULT '0' COMMENT '维修状态，1-维修中、2-完成',
  created_at DATETIME DEFAULT '1970-01-01 00:00:00' COMMENT '创建时间',
  updated_at DATETIME DEFAULT '1970-01-01 00:00:00' COMMENT '更新时间',
  is_deleted TINYINT(1) DEFAULT 0 COMMENT '是否有效，1-有效、2-无效'
)  ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT '设备维修表';
