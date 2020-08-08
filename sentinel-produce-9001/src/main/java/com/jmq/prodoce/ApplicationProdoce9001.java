package com.jmq.prodoce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ApplicationProdoce9001 {
    public static void main(String[] args) {
        System.out.println(SpringApplication.run(ApplicationProdoce9001.class,args));
    }
}
