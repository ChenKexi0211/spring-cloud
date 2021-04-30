package com.amt.configserver.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RestController;

/**
 * TODO
 *
 * @author ckx
 * @date: 2021/4/30 14:16
 */
@RestController
public class ConfigTestController {

    @Value("${ribbon.NFLoadBalancerRuleClassName}")
    String ribbonType;

}
