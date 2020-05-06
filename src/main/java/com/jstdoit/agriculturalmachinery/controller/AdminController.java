package com.jstdoit.agriculturalmachinery.controller;

import com.jstdoit.agriculturalmachinery.entity.*;
import com.jstdoit.agriculturalmachinery.model.LoginModel;
import com.jstdoit.agriculturalmachinery.model.Result;
import com.jstdoit.agriculturalmachinery.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


/**
 * @Description: 管理员操作
 * @Date: 2020/3/7 21:28
 * @Author: qiaochangyu
 */
@RestController
@RequestMapping("/manage")
public class AdminController {
    @Autowired
    private AdminService adminService;



    /**
     * 用户注册
     * @param userEntity
     * @return
     */
    @RequestMapping(value = "/register",method = RequestMethod.POST)
    public Result register(@RequestBody UserEntity userEntity){
        adminService.register(userEntity);
        return Result.getSuccessResult(true);
    }

    /**
     * 用户登录
     * @param loginModel
     * @return
     */
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public Result login(@RequestBody LoginModel loginModel){
        adminService.login(loginModel);
        return Result.getSuccessResult(true);
    }

    /**
     * 添加设备
     * @param deviceInfoEntity
     * @param
     * @return/10
     * @throws Exception
     */
    @RequestMapping(value = "/addDevice",method = RequestMethod.POST)
    public Result addDevice(@RequestBody DeviceInfoEntity deviceInfoEntity) throws Exception {
        adminService.addDevice(deviceInfoEntity);
        return Result.getSuccessResult(true);
    }

    /**
     * 删除设备
     * @param deleteBean
     * @return
     */
    @RequestMapping(value = "deleteDevice",method = RequestMethod.POST)
    public Result deleteDevice(@RequestBody DeviceDeleteBean deleteBean) throws Exception {
        adminService.deleteDevice(deleteBean);
        return Result.getSuccessResult(true);
    }

    /**
     * 设备信息列表查询
     * @param reqBean
     * @return
     */
    @RequestMapping(value = "queryList",method = RequestMethod.POST)
    public Result queryList(@RequestBody QueryListReqBean reqBean){
        return adminService.queryList(reqBean);
    }

    /**
     * 设备详情查询
     * @param reqBean
     * @return
     */
    @RequestMapping(value = "queryDetail",method = RequestMethod.POST)
    public Result queryDetail(@RequestBody QueryListReqBean reqBean){
        return adminService.queryDetail(reqBean);
    }

    /**
     * 设备使用申请
     * @param reqBean
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "applySubmit",method = RequestMethod.POST)
    public Result applySubmit(@RequestBody ApplyInfoEntity reqBean) throws Exception {
        return adminService.applySubmit(reqBean);
    }

    /**
     * 审批列表查询
     * @param reqBean
     * @return
     */
    @RequestMapping(value = "applyList",method = RequestMethod.POST)
    public Result applyList(@RequestBody ApplyInfoEntity reqBean){
        return adminService.applyList(reqBean);
    }

    /**
     * 申请审批
     * @param reqBean
     * @return
     */
    @RequestMapping(value = "applyApprove",method = RequestMethod.POST)
    public Result applyApprove(@RequestBody ApplyInfoEntity reqBean){
        return adminService.applyApprove(reqBean);
    }

    /**
     * 我的设备列表
     * @param applyBean
     * @return
     */
    @RequestMapping(value = "myList",method = RequestMethod.POST)
    public Result myList(@RequestBody ApplyBean applyBean){
        return adminService.myList(applyBean);
    }

    /**
     * 用户归还设备
     * @param applyBean
     * @return
     */
    @RequestMapping(value = "deviceReturn",method = RequestMethod.POST)
    public Result deviceReturn(@RequestBody ApplyBean applyBean){
        return adminService.deviceReturn(applyBean);
    }

    /**
     * 设备维修分配
     * @param repairInfoEntity
     * @return
     */
    @RequestMapping(value = "bugDistribution",method = RequestMethod.POST)
    public Result bugDistribution(@RequestBody RepairInfoEntity repairInfoEntity){
        return adminService.bugDistribution(repairInfoEntity);
    }

    /**
     * 设备维修列表查询
     * @param applyBean
     * @return
     */
    @RequestMapping(value = "repairList",method = RequestMethod.POST)
    public Result repairList(@RequestBody ApplyBean applyBean){
        return adminService.repairList(applyBean);
    }

    /**
     * 设备维修结果反馈
     * @param repairInfoEntity
     * @return
     */
    @RequestMapping(value = "bugResult",method = RequestMethod.POST)
    public Result bugResult(@RequestBody RepairInfoEntity repairInfoEntity){
        return adminService.bugResult(repairInfoEntity);
    }

}
