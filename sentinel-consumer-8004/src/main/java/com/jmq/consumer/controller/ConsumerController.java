package com.jmq.consumer.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.spring.cloud.config.ResultConfig;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
public class ConsumerController {
    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/consumer/getSentinel/{id}")
    public ResultConfig getSentinel(@PathVariable("id") int id  ){
         return  restTemplate.getForObject("http://sentinel-prodoce/getSentinel?id="+id,ResultConfig.class);
    }

}
