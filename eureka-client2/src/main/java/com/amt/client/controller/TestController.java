package com.amt.client.controller;

import com.amt.client.controller.services.UserServer;
import org.springframework.beans.factory.annotation.Autowired;
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
@RequestMapping(value = "/test")
public class TestController {


    @Autowired
    UserServer userServer;

    @ResponseBody
    @RequestMapping(value = "/hi")
    public String sayHi(@RequestParam(value = "name", defaultValue = "forezp") String name) {
        return "hi:" + name;
    }

    @ResponseBody
    @RequestMapping(value = "/map")
    public String getMap() {
        return userServer.getMap().toString();
    }
}
