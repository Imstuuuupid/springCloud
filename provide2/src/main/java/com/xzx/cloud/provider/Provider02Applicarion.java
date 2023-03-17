package com.xzx.cloud.provider;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Provider02Applicarion {
    public static void main(String[] args) {
        SpringApplication.run(Provider02Applicarion.class, args);
    }
}
