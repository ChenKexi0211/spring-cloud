package com.amt.provider.controller;

import com.amt.api.DefaultApi;
import com.amt.api.User;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.Map;

/**
 * @Description: 打招呼的接口
 * @Date: 2019/7/8 14:42
 * @Author ckx
 */

@RestController
public class HiController implements DefaultApi {

    @Value("${server.port}")
    String port;


    @RequestMapping("/hi")
    public String home(@RequestParam(value = "name", defaultValue = "forezp") String name) {
        return "hi " + name + " ,i am mini-api ,from port:" + port;
    }

    /**
     * 获取map信息
     *
     * @return
     */
    @Override
    public Map<String, Object> getMap() {
        return Collections.singletonMap("ckx", "i am " + port + ",i love you");
    }

    @Override
    public String getById(Integer id) {
        return "520";
    }

    @Override
    public User postPserson(User user) {
        System.out.println(ToStringBuilder.reflectionToString(user));
        return user;
    }

    @Override
    public String getHelloWord() {
        return "helloWrod";
    }

}
