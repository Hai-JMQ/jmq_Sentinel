package com.jmq.consumer.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTempalteConfig {
    @Bean
    @LoadBalanced //负载均衡
    public RestTemplate create(){
        return  new RestTemplate();
    }
}
