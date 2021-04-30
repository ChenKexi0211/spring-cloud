package com.amt.client.controller;


import com.amt.client.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * TODO
 *
 * @author ckx
 * @date: 2021/4/27 14:45
 */
@RestController
public class TestController {


    @Value("${server.port}")
    String port;


    @Autowired
    UserService userServer;

    @ResponseBody
    @RequestMapping(value = "/hi")
    public String sayHi(@RequestParam(value = "name", defaultValue = "forezp") String name) {
        return "hi:" + name;
    }

    @ResponseBody
    @RequestMapping(value = "/map")
    public String getMap() {
        return "i am " + port + "  " + userServer.getMap().toString();
    }

    @ResponseBody
    @RequestMapping(value = "/hello")
    public String getHelloWord() {
        return userServer.getHelloWord();
    }
}
