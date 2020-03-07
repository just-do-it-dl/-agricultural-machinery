package com.jstdoit.agriculturalmachinery.controller;

import com.jstdoit.agriculturalmachinery.entity.ApplyInfoEntity;
import com.jstdoit.agriculturalmachinery.model.Result;
import com.jstdoit.agriculturalmachinery.service.UsePersonnelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 *  设备使用人员模块
 *
 *  @author caiyf
 *  @date 2020-03-07
 */
@RestController
public class UsePersonnelController {

    @Autowired
    private UsePersonnelService usePersonnelService;

    @PostMapping("/applySubmit")
    public Result applySubmit(@RequestBody ApplyInfoEntity param) {
        return usePersonnelService.applySubmit(param);
    }

}
