package com.jmq.openfeign.controller;

import com.jmq.openfeign.service.OpenfeignService;
import com.spring.cloud.config.ResultConfig;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class OpenFeignController {

    @Resource
    private OpenfeignService openfeignService;

    @GetMapping("/test")
    public ResultConfig test(){
        return  openfeignService.test();
    }
}
