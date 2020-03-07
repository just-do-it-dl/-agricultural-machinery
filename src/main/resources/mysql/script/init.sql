CREATE DATABASE agricultural_machinery;
CREATE TABLE user (
  id INT(64) AUTO_INCREMENT PRIMARY KEY COMMENT '主键',
  acount_no VARCHAR(32) DEFAULT '' COMMENT '账户号',
  name VARCHAR(32) DEFAULT '' COMMENT '名称',
  password VARCHAR(32) DEFAULT '' COMMENT '密码',
  role_id TINYINT(1) DEFAULT -1 COMMENT '角色id，1-设备管理员、2-维修人员、3-使用人员'
);