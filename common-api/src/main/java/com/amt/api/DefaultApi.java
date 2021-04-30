package com.amt.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Map;

/**
 * TODO
 *
 * @author ckx
 * @date: 2021/4/27 18:46
 */
public interface DefaultApi {

    /**
     * 获取map信息
     *
     * @return
     */
    @GetMapping("/default/getMap")
    Map<String, Object> getMap();


    @GetMapping("/default/getById")
    String getById(Integer id);


    @PostMapping("/default/postUser")
    User postPserson(@RequestBody User person);

    @PostMapping("/default/getHelloWord")
    String getHelloWord();
}
