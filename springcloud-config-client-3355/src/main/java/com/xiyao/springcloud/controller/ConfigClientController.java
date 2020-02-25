package com.xiyao.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 28591227@qq.com
 * @create 2020-02-24 21:18
 **/
@RestController
public class ConfigClientController {

    @Value("${spring.application.name}")
    private String applicationName;

    @Value("${eureka.client.service-url.defaultZone}")
    private String eurekaServer;

    @Value("${server.port}")
    private String port;


    @RequestMapping("/config")
    public String getconfig() {
        return "applicationName:" + applicationName +
                "eurekaServer:" + eurekaServer +
                "port:" + port;
    }

}
