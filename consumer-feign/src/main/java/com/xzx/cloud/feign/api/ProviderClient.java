package com.xzx.cloud.feign.api;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "provide")
public interface ProviderClient {

    @RequestMapping(value = "/xzx/cloud/api/test/check")
    String consume(@RequestParam("str") String str);

}
