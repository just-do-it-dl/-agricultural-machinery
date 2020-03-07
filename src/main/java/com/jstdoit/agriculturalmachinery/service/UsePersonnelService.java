package com.jstdoit.agriculturalmachinery.service;

import com.jstdoit.agriculturalmachinery.dao.ApplyInfoEntityMapper;
import com.jstdoit.agriculturalmachinery.dao.DeviceInfoEntityMapper;
import com.jstdoit.agriculturalmachinery.entity.ApplyInfoEntity;
import com.jstdoit.agriculturalmachinery.entity.DeviceInfoEntity;
import com.jstdoit.agriculturalmachinery.model.CodeEnum;
import com.jstdoit.agriculturalmachinery.model.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *  设备使用人员模块
 *
 *  @author caiyf
 *  @date 2020-03-07
 */
@Service
public class UsePersonnelService {

    @Autowired
    private ApplyInfoEntityMapper applyInfoDao;
    @Autowired
    private DeviceInfoEntityMapper deviceInfoDao;

    /**
     * 用户提交设备申请
     *
     * @param param
     * @return
     */
    public Result<Boolean> applySubmit(ApplyInfoEntity param) {
        // 查询设备信息
        DeviceInfoEntity deviceInfoEntity = deviceInfoDao.selectByPrimaryKey(Integer.valueOf(param.getDeviceInfoId()));
        if (1 != deviceInfoEntity.getUsageStatus()) {
            return Result.getExceptionResult(CodeEnum.DEVICE_USAGE);
        }
        if (1 != deviceInfoEntity.getRepairStatus()) {
            return Result.getExceptionResult(CodeEnum.DEVICE_REPAIR);
        }
        // 判断正常申请/延期申请
        if (1 == param.getApplyType()) {
            ApplyInfoEntity applyInfoEntity = new ApplyInfoEntity();
            applyInfoEntity.setApplyAcountNo(param.getApplyAcountNo());
            applyInfoEntity.setDeviceInfoId(param.getDeviceInfoId());
            applyInfoEntity.setApplyStartDate(param.getApplyStartDate());
            applyInfoEntity.setApplyEndDate(param.getApplyEndDate());
            applyInfoEntity.setApplyType(param.getApplyType());
            applyInfoEntity.setApplyStatus(2);
            applyInfoDao.insert(applyInfoEntity);
            deviceInfoEntity.setUsageStatus(2);
            deviceInfoDao.updateByPrimaryKey(deviceInfoEntity);
        } else {

        }
        return Result.getSuccessResult(true);
    }

}
