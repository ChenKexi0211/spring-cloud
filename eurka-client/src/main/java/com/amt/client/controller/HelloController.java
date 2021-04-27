package com.amt.client.controller;

import com.amt.client.service.HelloService;
import com.netflix.discovery.EurekaClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Description: hello
 * @Date: 2019/7/8 15:25
 * @Author ckx
 */
@RestController
public class HelloController {


    @Autowired
    DiscoveryClient client;

    @Autowired
    HelloService helloService;

    @Autowired
    EurekaClient client2;


    @ResponseBody
    @RequestMapping("/hi")
    public String sayHi(@RequestParam(value = "name", defaultValue = "forezp") String name) {

        List<String> services = client.getServices();

        for (int i = 0; i < services.size(); i++) {
            System.out.println(services.get(i));
        }

        return helloService.sayHiFromClientOne(name);
    }

    @GetMapping("/client")
    public String client() {
        List<String> services = client.getServices();

        for (String str : services) {
            System.out.println(str);

        }
        return "Hi";
    }


    @GetMapping("/client2")
    public Object client2() {
        return client.getInstances("eurka-provider");
    }

}
