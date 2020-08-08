package com.jmq.openfeign.service;

import com.jmq.openfeign.global.OpenfeignGlobal;
import com.spring.cloud.config.ResultConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value="sentinel-prodoce",fallback = OpenfeignGlobal.class)
public interface OpenfeignService {
    @GetMapping("/getSentinel/{id}")
    public ResultConfig get(@PathVariable("id") int id);
    @GetMapping("/test")
    public ResultConfig test();
}
