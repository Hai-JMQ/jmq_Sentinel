package com.jmq.sentinel8001.global;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.spring.cloud.config.ResultConfig;

public class SentinelResourceGlobal {

    public static  ResultConfig getSentinel_error1(BlockException block){
        return  new ResultConfig(444,"这个是兜底的getSentinel_error1");
    }
    public static ResultConfig getSentinel_error2(BlockException block){
        return  new ResultConfig(444,"这个是兜底的getSentinel_error2");
    }
}
