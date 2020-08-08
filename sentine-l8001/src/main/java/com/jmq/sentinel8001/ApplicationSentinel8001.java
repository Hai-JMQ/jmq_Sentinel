package com.jmq.sentinel8001;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@EnableDiscoveryClient
public class ApplicationSentinel8001 {
    public static void main(String[] args) {
        System.out.println(SpringApplication.run(ApplicationSentinel8001.class,args));
    }
}
