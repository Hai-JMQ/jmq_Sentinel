package com.jmq.openfeign.global;

import com.jmq.openfeign.service.OpenfeignService;
import com.spring.cloud.config.ResultConfig;
import org.springframework.stereotype.Component;

@Component
public class OpenfeignGlobal implements OpenfeignService {
    @Override
    public ResultConfig get(int id) {
        return new ResultConfig(500,"get--错误");
    }

    @Override
    public ResultConfig test() {
        return new ResultConfig(500,"test---错误");
    }
}
