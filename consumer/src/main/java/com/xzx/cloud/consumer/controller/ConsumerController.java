package com.xzx.cloud.consumer.controller;


import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
@RequestMapping("/xzx/cloud/consumer")
public class ConsumerController {

    private static final String PROVIDER_URL = "PROVIDE";

    @Bean
    @LoadBalanced
    private RestTemplate restTemplate() {
        return new RestTemplate();
    }

    @Resource
    private RestTemplate restTemplate;


    @RequestMapping("/p1")
    public String consumeP1(String p) {
        String url = "http://" + PROVIDER_URL + "/xzx/cloud/api/test/check?str=" + p;
        System.out.println("consumer request provider 1 :" + url);
        return restTemplate.getForObject(url, String.class);
    }

    @RequestMapping("/p2")
    public String consumeP2(String p) {
        String url = "http://" + PROVIDER_URL + "/xzx/cloud/api/api2/update?ss=" + p;
        System.out.println("consumer request provider 2 :" + url);
        return restTemplate.getForObject(url, String.class);
    }
}
