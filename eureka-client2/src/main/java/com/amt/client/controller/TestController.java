package com.amt.client.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * TODO
 *
 * @author ckx
 * @date: 2021/4/27 14:45
 */
@Controller
@RequestMapping(value = "/test")
public class TestController {


    @ResponseBody
    @RequestMapping(value = "/hi")
    public String sayHi(@RequestParam("name") String name) {
        return "hi:" + name;
    }
}
