package com.jstdoit.agriculturalmachinery.advice;

import com.jstdoit.agriculturalmachinery.model.CodeEnum;
import com.jstdoit.agriculturalmachinery.model.Result;
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
public class ExceptionAdvice {

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Result handlerExceptipon(Exception e) {
        return Result.getExceptionResult(CodeEnum.UNKNOWN_ERROR);
    }

}
