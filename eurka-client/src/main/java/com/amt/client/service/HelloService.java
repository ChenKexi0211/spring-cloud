package com.amt.client.service;

import com.amt.api.DefaultApi;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Description: service
 * @Date: 2019/7/8 15:27
 * @Author ckx
 */
@FeignClient(name = "eurka-provider",fallbackFactory = UserServiceBackFactory.class)
public interface HelloService extends DefaultApi {

    /**
     * 打招呼
     *
     * @param name
     * @return java.lang.String
     * @author ckx
     * @date 2019/7/8 16:28
     */
    @GetMapping("/hi")
    String sayHiFromClientOne(@RequestParam("name") String name);
}

