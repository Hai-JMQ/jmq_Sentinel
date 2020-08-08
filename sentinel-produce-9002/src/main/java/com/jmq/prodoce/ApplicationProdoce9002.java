package com.jmq.prodoce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ApplicationProdoce9002 {
    public static void main(String[] args) {
        System.out.println(SpringApplication.run(ApplicationProdoce9002.class,args));
    }
}
