package com.amt.servicefeign.service.impl;

import com.amt.servicefeign.service.HelloService;
import org.springframework.stereotype.Component;

/**
 * @Description: hello实现类
 * @Date 2019/7/9 14:07
 * @Author ckx
 */
@Component
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}
