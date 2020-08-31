package com.spring.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
public class ApplicationOrder8801 {
    public static void main(String[] args) {
        System.out.println(SpringApplication.run(ApplicationOrder8801.class,args));
    }
}
