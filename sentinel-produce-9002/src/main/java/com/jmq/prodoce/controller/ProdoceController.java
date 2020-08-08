package com.jmq.prodoce.controller;

import com.spring.cloud.config.ResultConfig;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProdoceController {
    @Value("${server.port}")
    private  String sercerPort;
    @GetMapping("/getSentinel")
    public ResultConfig getSentinel( int id){
        if(id>3){
            int a  =10/0;
            return  new ResultConfig(500,"这是个非法参数端口："+sercerPort);
        }
        return new ResultConfig(200,"pro9002端口："+sercerPort);
    }
}
