package com.amt.client.service.follback;

import com.amt.api.User;
import com.amt.client.service.UserService;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.Map;

/**
 * TODO
 *
 * @author ckx
 * @date: 2021/4/28 14:20
 */
@Component
public class UserServiceFallBack implements UserService {
    /**
     * 获取map信息
     *
     * @return
     */
    @Override
    public Map<String, Object> getMap() {
        return  Collections.singletonMap("ckx","i am sorry");
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

    @Override
    public String haha() {
        return null;
    }
}
