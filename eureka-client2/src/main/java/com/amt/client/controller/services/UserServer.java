package com.amt.client.controller.services;

import com.amt.api.DefaultApi;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @Description: TODO
 * @Date: 2021/4/27 19:08
 * @Author ckx
 */
@FeignClient(name = "eurka-provider")
public interface UserServer extends DefaultApi {
}
