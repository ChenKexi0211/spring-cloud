package com.amt.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * TODO
 *
 * @author ckx
 * @date: 2021/4/27 18:46
 */
@RequestMapping("/default")
public interface DefaultApi {

    /**
     * 获取map信息
     *
     * @return
     */
    @GetMapping("/getMap")
    Map<String, Object> getMap();


    @GetMapping("/getById")
    String getById(Integer id);


    @PostMapping("/postUser")
    User postPserson(@RequestBody User person);

}
