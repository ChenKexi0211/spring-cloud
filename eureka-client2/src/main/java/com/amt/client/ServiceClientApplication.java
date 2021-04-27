package com.amt.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Description: 启动类
 * @Date 2019/7/8 16:28
 * @Author ckx
 */
@SpringBootApplication
//@EnableEurekaClient
////@EnableDiscoveryClient
////@EnableFeignClients
public class ServiceClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceClientApplication.class, args);
    }

}
