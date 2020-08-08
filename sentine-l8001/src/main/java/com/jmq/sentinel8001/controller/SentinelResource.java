package com.jmq.sentinel8001.controller;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.jmq.sentinel8001.global.SentinelResourceGlobal;
import com.spring.cloud.config.ResultConfig;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SentinelResource {

    @GetMapping("/getSentinel_ok")
    @com.alibaba.csp.sentinel.annotation.SentinelResource(value = "getSentinel_ok",blockHandlerClass = SentinelResourceGlobal.class,blockHandler = "getSentinel_error1")
    public  ResultConfig getSentinel_ok(){
        return  new ResultConfig(200,"这个是成功的sentinel");
    }

    /**  @SentinelResource 注解中的几个参数意思大致为
     * value"访问资源名称
     * blockHandlerClass：全局的兜底类
     * blockHandler:兜底方法
     * 整体意思的是 当getSentinel_test方法发生错误
     * SentinelResourceGlobal类中的getSentinel_error2方法来兜底
     */
    @GetMapping("/getSentinel_test")
    @com.alibaba.csp.sentinel.annotation.SentinelResource(value = "getSentinel_test",blockHandlerClass = SentinelResourceGlobal.class,blockHandler = "getSentinel_error2")
    public ResultConfig getSentinel_test(){
        return  new ResultConfig(200,"getSentinel_test");
    }
}
