package com.xzx.cloud.provider.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/xzx/cloud/api")
public class Provider2ApiController {


    @RequestMapping("/api2/update")
    public String update(String ss) {
        return ss + " provider 2 ok";
    }

    @RequestMapping("/test/check")
    public String checkTest(String str) {
        return str + str +"provide 22222";
    }

}
