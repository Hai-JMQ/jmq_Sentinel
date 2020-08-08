package com.jmq.sentinel8001.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.concurrent.TimeUnit;

@RestController
@Slf4j
public class SentinelController {
    @GetMapping("/test1")
    public String test1(){
        return "this is test1";
    }
    @GetMapping("/test2")
    public String test2(){
        log.info("efhiwefie");
        return "this is test2";
    }

    @GetMapping("/test3")
    public String test3(){
        try{
            TimeUnit.SECONDS.sleep(1);
        }catch (Exception e){
            e.printStackTrace();
        }
        log.info("测试Sentinel降级中的rt");
        return "测试Sentinel降级中的rt";
    }

    @GetMapping("/test4")
    public String test4(){
    int age = 10/0;
        return "测试Sentinel异常数";
    }


    @GetMapping("/test5")
    //blockHandler 表示兜底方法 和hystrix一样
    @SentinelResource(value="test5",blockHandler="doudu_test6")
    public String test5(@RequestParam(value = "p1",required = false)String p1,
                        @RequestParam(value = "p2",required = false)String p2){

        return "测试Sentinel热点key";
    }
    public String doudu_test6(String p1, String p2, BlockException block){
        return "这是个兜底的方法 啊哈哈哈";
    }
}
