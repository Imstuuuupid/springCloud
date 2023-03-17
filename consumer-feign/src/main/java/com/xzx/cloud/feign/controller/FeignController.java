package com.xzx.cloud.feign.controller;


import com.xzx.cloud.feign.api.ProviderClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/xzx/cloud/feign")
public class FeignController {

    @Resource
    private ProviderClient providerClient;


    @RequestMapping("/api/cc")
    public String getCC(String p) {
        return providerClient.consume(p);
    }
}
