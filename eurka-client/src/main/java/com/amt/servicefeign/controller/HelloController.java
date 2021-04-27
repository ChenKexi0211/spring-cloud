package com.amt.servicefeign.controller;

import com.amt.servicefeign.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Description: hello
 * @Date: 2019/7/8 15:25
 * @Author ckx
 */
@Controller
public class HelloController {

    @Autowired
    DiscoveryClient discoveryClient;

    @Autowired
    HelloService helloService;

    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    @ResponseBody
    public String sayHi(@RequestParam String name) {

        List<String> services = discoveryClient.getServices();

        for (int i = 0; i < services.size(); i++) {
            System.out.println(services.get(i));
        }

        return helloService.sayHiFromClientOne(name);
    }


}
