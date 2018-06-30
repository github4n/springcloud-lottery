package com.mz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableDiscoveryClient
@EnableZuulProxy
@SpringBootApplication
public class LotteryGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(LotteryGatewayApplication.class, args);
    }
}
