package com.xzx.cloud.provider.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/xzx/cloud/api")
public class ApiController {

    @RequestMapping("/test/check")
    public String checkTest(@RequestParam("str") String str) {
        return str + str+"provide 111111";
    }
}
