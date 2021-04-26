package com.amt.servicefeign.controller;

import com.amt.servicefeign.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description: hello
 * @Date: 2019/7/8 15:25
 * @Author ckx
 */
@RestController
public class HelloController {

    @Autowired
    HelloService helloService;

    @GetMapping(value = "/hi")
    public String sayHi(@RequestParam String name) {
        return helloService.sayHiFromClientOne(name);
    }


}
