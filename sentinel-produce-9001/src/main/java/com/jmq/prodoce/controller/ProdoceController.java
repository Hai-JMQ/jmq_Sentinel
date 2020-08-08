package com.jmq.prodoce.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.spring.cloud.config.ResultConfig;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProdoceController {
    @Value("${server.port}")
    private  String sercerPort;
    @GetMapping("/getSentinel/{id}")
    @SentinelResource(value = "getSentinel",blockHandler = "getSentinel_blockHandler",fallback = "getSentinel_fallback")
    public ResultConfig getSentinel(@PathVariable("id") int id){
        if(id>3) {
            throw new IllegalArgumentException();
        }
       return new ResultConfig(200,"pro9001端口："+sercerPort);
    }
    public ResultConfig getSentinel_blockHandler(int id,BlockException b){
        return  new ResultConfig(500,"getSentinel_blockHandler是getSentinel的客户端兜底异常");
    }
    public ResultConfig getSentinel_fallback(int id){
        return  new ResultConfig(500,"getSentinel_fallback是getSentinel的兜底运行时异常异常");
    }


    @GetMapping("/test")
    public ResultConfig test(){
        return new ResultConfig(200,"test---9001端口："+sercerPort);
    }
}
