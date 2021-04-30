package com.amt.client.service;

import com.amt.api.DefaultApi;
import com.amt.client.service.follback.UserServiceFallBack;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * TODO
 *
 * @author ckx
 * @date: 2021/4/28 14:18
 */
@FeignClient(name = "eurka-provider",fallback = UserServiceFallBack.class)
public interface UserService extends DefaultApi {

    @GetMapping("/user/haha")
    String haha();
}
