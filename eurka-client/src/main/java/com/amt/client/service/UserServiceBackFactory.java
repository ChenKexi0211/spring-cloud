package com.amt.client.service;

import com.amt.api.User;
import feign.FeignException;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * TODO
 *
 * @author ckx
 * @date: 2021/4/28 16:46
 */
@Component
public class UserServiceBackFactory implements FallbackFactory<HelloService> {

    /**
     * 包含本地和远程调用异常
     *
     * @param throwable
     * @return com.amt.client.service.HelloService
     * @author ckx
     * @date 2021/4/28 16:47
     */
    @Override
    public HelloService create(Throwable throwable) {
        return new HelloService() {
            @Override
            public String sayHiFromClientOne(String name) {
                return null;
            }

            @Override
            public Map<String, Object> getMap() {
                Map<String, Object> maps = new HashMap<>(2);
                System.out.println(throwable.getClass());
                if(throwable instanceof FeignException) {
                    maps.put("ckx", "i am sorry");
                }
//                throwable.printStackTrace();
//                System.out.println(ToStringBuilder.reflectionToString(throwable));
                return maps;
            }

            @Override
            public String getById(Integer id) {
                return null;
            }

            @Override
            public User postPserson(User person) {
                return null;
            }

            @Override
            public String getHelloWord() {
                return null;
            }
        };
    }
}
