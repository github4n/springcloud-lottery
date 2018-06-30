package com.mz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class LotteryDiscoveryApplication {

    public static void main(String[] args) {
        SpringApplication.run(LotteryDiscoveryApplication.class, args);
    }
}
