package com.amt.serverminiapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
/**
 * @Description: 启动类
 * @Date 2019/7/8 16:28
 * @Author ckx
 */
@EnableEurekaClient
@SpringBootApplication
public class ServerMiniApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServerMiniApiApplication.class, args);
    }

}
