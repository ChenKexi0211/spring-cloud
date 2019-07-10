package com.amt.servicefeign.service;

import com.amt.servicefeign.service.impl.HelloServiceImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Description: service
 * @Date: 2019/7/8 15:27
 * @Author ckx
 */
@FeignClient(value = "mini-api",fallback = HelloServiceImpl.class)
public interface  HelloService {

    /**
     * 打招呼
     *
     * @author ckx
     * @param name
     * @return java.lang.String
     * @date 2019/7/8 16:28
     */
    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "name") String name);
}

