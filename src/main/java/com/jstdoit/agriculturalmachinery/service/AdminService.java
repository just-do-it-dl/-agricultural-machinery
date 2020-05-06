package com.jstdoit.agriculturalmachinery.service;

import com.jstdoit.agriculturalmachinery.advice.*;
import com.jstdoit.agriculturalmachinery.dao.ApplyInfoEntityMapper;
import com.jstdoit.agriculturalmachinery.dao.DeviceInfoEntityMapper;
import com.jstdoit.agriculturalmachinery.dao.RepairInfoEntityMapper;
import com.jstdoit.agriculturalmachinery.dao.UserEntityMapper;
import com.jstdoit.agriculturalmachinery.entity.*;
import com.jstdoit.agriculturalmachinery.model.CodeEnum;
import com.jstdoit.agriculturalmachinery.model.LoginModel;
import com.jstdoit.agriculturalmachinery.model.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

/**
 * @Description: 管理员操作
 * @Date: 2020/3/7 21:22
 * @Author: qiaochangyu
 */
@Slf4j
@Service
public class AdminService {
    @Autowired
    DeviceInfoEntityMapper deviceInfoEntityMapper;
    @Autowired
    UserEntityMapper userEntityMapper;
    @Autowired
    ApplyInfoEntityMapper applyInfoEntityMapper;
    @Autowired
    RepairInfoEntityMapper repairInfoEntityMapper;


    /**
     * 用户注册
     * @param userEntity
     */
    public void register(UserEntity userEntity){
        int count1  = userEntityMapper.selectCountAccount(userEntity.getAcountNo());
        //账号重复
        if(count1 > 0){
            throw new RegisterException1(String.valueOf(CodeEnum.REPEAT_ACOUNT));
        }
        int count2 = userEntityMapper.selectCountName(userEntity.getName());
        //姓名重复
        if(count2 > 0){
            throw new RegisterException(String.valueOf(CodeEnum.REPEAT_NAME));
        }
        userEntity.setCreatedAt(new Date());
        userEntityMapper.insertSelective(userEntity);
   }

    /**
     * 用户登录
     * @param loginModel
     */
   public void login(LoginModel loginModel){

        UserEntity userEntity = userEntityMapper.selectByAccount(loginModel.getAcountNo());
        if(Objects.isNull(userEntity)){
            throw new LoginException1(String.valueOf(CodeEnum.NOT_EXIST));
        }else if(!userEntity.getPassword().equals(loginModel.getPassWord())){
            throw new LoginException(String.valueOf(CodeEnum.PASSWORD_ERROR));
        }
   }
    /**
     * 添加设备
     * @param deviceInfoEntity
     */
    public Result addDevice(DeviceInfoEntity deviceInfoEntity) throws Exception {

            String roleId = deviceInfoEntityMapper.selectRole(deviceInfoEntity.getAcountNo());
            if(!"1".equals(roleId)){
                //只有管理人员才能添加设备
                throw new MyException(String.valueOf(CodeEnum.NO_LIMIT_ADD));
            }
            //创建时间
            deviceInfoEntity.setCreatedAt(new Date());
            deviceInfoEntity.setUpdatedAt(new Date());
            deviceInfoEntityMapper.insertSelective(deviceInfoEntity);
            return Result.getSuccessResult(true);
    }

    /**
     * 删除设备
     * @param deviceDeleteBean
     * @throws Exception
     */
    public void deleteDevice(DeviceDeleteBean deviceDeleteBean) throws Exception {
        if(!Objects.isNull(deviceDeleteBean)){
            //只有管理人员才能添加设备
            String roleId = deviceInfoEntityMapper.selectRole(deviceDeleteBean.getAcountNo());
            if(!"1".equals(roleId)){
                throw new MyException(String.valueOf(CodeEnum.NO_LIMIT_ADD));
            }
            DeviceInfoEntity entity = deviceInfoEntityMapper.selectByPrimaryKey(deviceDeleteBean.getId());
            //设备正在维修中，无法删除
            if(!"1".equals(entity.getRepairStatus().toString())){
                throw new DeleteDeviceRepairException(String.valueOf(CodeEnum.DELETE_REPAIRE));
            }
            //设备正在使用中，无法删除
            if(!"1".equals(entity.getUsageStatus().toString())){
                throw new DeleteDeviceUseException(String.valueOf(CodeEnum.DELETE_USE));
            }

            deviceInfoEntityMapper.deleteByPrimaryKey(deviceDeleteBean.getId());
        }
    }

    /**
     * 设备信息列表查询
     * @param reqBean
     * @return
     */
    public Result queryList(QueryListReqBean reqBean){
        QueryListRetBean retBean = new QueryListRetBean();
        int start = (reqBean.getPageIndex()-1)*10;
        int end = reqBean.getPageNum();
        reqBean.setPageIndex(start);
        reqBean.setPageNum(end);
        List<QueryListBean> retList =  deviceInfoEntityMapper.selectList(reqBean);
        retBean.setRetList(retList);
        return Result.getSuccessResult(retBean);
    }

    /**
     * 设备详情查询
     * @param reqBean
     * @return
     */
    public Result queryDetail(QueryListReqBean reqBean){
        DetailBean retBean = new DetailBean();
        retBean = deviceInfoEntityMapper.selectDetail(reqBean);
        return Result.getSuccessResult(retBean);
    }

    /**
     * 设备使用申请
     * @param reqBean
     * @return
     * @throws Exception
     */
    public Result applySubmit(ApplyInfoEntity reqBean) throws Exception {
        int delayTimes = userEntityMapper.selectDelay(reqBean.getAcountNo());
        if(delayTimes >= 3){
            //延期使用设备超过3次，暂停使用此功能
            throw new DelayException(String.valueOf(CodeEnum.CHECK_INFO));
        }
        //获取申请时长 单位：天
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date startDay = sdf.parse(reqBean.getApplyStartDate().toString());
        Date endDay = sdf.parse(reqBean.getApplyEndDate().toString());
        reqBean.setApplyLenth((int)((endDay.getTime()-startDay.getTime())/(3600*24*1000)));
        reqBean.setCreatedAt(new Date());
        reqBean.setUpdatedAt(new Date());
        //插入申请表
        reqBean.setApplyStatus(1);
        applyInfoEntityMapper.insertSelective(reqBean);
        return Result.getSuccessResult(true);
    }

    /**
     * 审批列表查询
     * @param reqBean
     * @return
     */
    public Result applyList(ApplyInfoEntity reqBean){
        List<ApplyInfoEntity> retList = new ArrayList<>();
        int start = (reqBean.getPageIndex()-1)*10;
        reqBean.setPageIndex(start);
        retList = applyInfoEntityMapper.selectList(reqBean);
        return Result.getSuccessResult(retList);
    }

    /**
     * 申请审批
     * @param reqBean
     * @return
     */
    public Result applyApprove(ApplyInfoEntity reqBean){
        //更新申请表中的状态
        reqBean.setApprovalDate(new Date());
        applyInfoEntityMapper.updateByPrimaryKeySelective(reqBean);
        ApplyInfoEntity bean = applyInfoEntityMapper.selectByPrimaryKey(reqBean.getId());
        String id = bean.getDeviceInfoId().toString();
        //提交申请人姓名
        String name = bean.getName();
        //审批通过
        if("2".equals(reqBean.getApplyType().toString()) ){
            //更新设备使用次数
            deviceInfoEntityMapper.updateUseTime(id);
            if( "2".equals(reqBean.getApplyStatus().toString())){
                //延期申请，更新用户表的延期使用次数
                userEntityMapper.updateDelay(name);
            }
        }
        //短信提醒

        return Result.getSuccessResult(true);

    }

    /**
     * 我的设备列表
     * @param applyBean
     * @return
     */
    public Result myList(ApplyBean applyBean){
        List<ApplyInfoEntity> retList = new ArrayList<>();
        retList = applyInfoEntityMapper.selectApplyList(applyBean.getName());
        return Result.getSuccessResult(retList);
    }

    /**
     * 用户归还设备
     * @param applyBean
     * @return
     */
    public Result deviceReturn(ApplyBean applyBean){
        int id = Integer.parseInt(applyBean.getId());
        ApplyInfoEntity bean = applyInfoEntityMapper.selectByPrimaryKey(id);
        Date date = new Date();
        String flag = "1";
        Date applyEndDate = strToDateLong(bean.getApplyEndDate());
        if(applyEndDate.before(date)){
            //延期申请
            userEntityMapper.updateDelay(applyBean.getName());
            flag = "2";
        }
        //把设备状态设为空闲
        deviceInfoEntityMapper.updateState(bean.getDeviceInfoId());
        return Result.getSuccessResult(flag);


    }

    /**
     * 设备维修分配
     * @param repairInfoEntity
     * @return
     */
    public Result bugDistribution(RepairInfoEntity repairInfoEntity){
        repairInfoEntity.setRepairStatus(1);
        repairInfoEntity.setIsDeleted(1);
        //插入维修表
        repairInfoEntityMapper.insertSelective(repairInfoEntity);
        //更新设备状态
        deviceInfoEntityMapper.updateRepairState(repairInfoEntity.getDeviceInfoId());
        //短信提醒

        return Result.getSuccessResult(true);
    }

    /**
     * 设备维修列表
     * @param applyBean
     * @return
     */
    public Result repairList(ApplyBean applyBean){
        List<RepairInfoEntity> retList = new ArrayList<>();
        retList = repairInfoEntityMapper.repairList(applyBean);
        return Result.getSuccessResult(retList);
    }

    /**
     * 设备维修结果反馈
     * @param repairInfoEntity
     * @return
     */
    public Result bugResult(RepairInfoEntity repairInfoEntity){
        //更新设备信息表
        deviceInfoEntityMapper.updateRepairState1(repairInfoEntity.getDeviceInfoId());
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        repairInfoEntity.setRepairEndDate(sdf.format(new Date()));
        repairInfoEntity.setIsDeleted(2);
        //更新维修表中的状态
        repairInfoEntityMapper.updateByPrimaryKeySelective(repairInfoEntity);
        //短信提醒


        return Result.getSuccessResult(true);
    }

    /**
     * String -> date
     * @param strDate
     * @return
     */
    public static Date strToDateLong(String strDate) {
          SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
          ParsePosition pos = new ParsePosition(0);
          Date strtodate = formatter.parse(strDate, pos);
           return strtodate;
        }

}
