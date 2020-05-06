package com.jstdoit.agriculturalmachinery.advice;

import com.jstdoit.agriculturalmachinery.model.CodeEnum;
import com.jstdoit.agriculturalmachinery.model.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 全局异常处理
 *
 * @author caiyf
 * @date 2020-03-07
 */
@ControllerAdvice
@Slf4j
public class ExceptionAdvice {

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Result handlerExceptipon(Exception e) {
        log.error(e.getMessage());
        return Result.getExceptionResult(CodeEnum.UNKNOWN_ERROR);
    }


    @ExceptionHandler(value = MyException.class)
    @ResponseBody
    public Result NoLimitExceptipon(MyException e) {
        return Result.getExceptionResult(CodeEnum.NO_LIMIT_ADD);
    }

    @ExceptionHandler(value = DelayException.class)
    @ResponseBody
    public Result DelayException(DelayException e){
        return Result.getExceptionResult(CodeEnum.CHECK_INFO);
    }

    @ExceptionHandler(value = DeleteDeviceUseException.class)
    @ResponseBody
    public Result DeleteDeviceUseException(DeleteDeviceUseException e){
        return Result.getExceptionResult(CodeEnum.DELETE_USE);
    }

    @ExceptionHandler(value = DeleteDeviceRepairException.class)
    @ResponseBody
    public Result DeleteDeviceRepairException(DeleteDeviceRepairException e){
        return Result.getExceptionResult(CodeEnum.DELETE_REPAIRE);
    }

    @ExceptionHandler(value = RegisterException.class)
    @ResponseBody
    public Result RegisterException(RegisterException e){
        return Result.getExceptionResult(CodeEnum.REPEAT_NAME);
    }

    @ExceptionHandler(value = RegisterException1.class)
    @ResponseBody
    public Result RegisterException1(RegisterException1 e){
        return Result.getExceptionResult(CodeEnum.REPEAT_ACOUNT);
    }

    @ExceptionHandler(value = LoginException.class)
    @ResponseBody
    public Result PassErrException(LoginException e){
        return Result.getExceptionResult(CodeEnum.PASSWORD_ERROR);
    }

    @ExceptionHandler(value = LoginException1.class)
    @ResponseBody
    public Result NotExistException(LoginException1 e){
        return Result.getExceptionResult(CodeEnum.NOT_EXIST);
    }



}
