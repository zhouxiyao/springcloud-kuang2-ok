package com.xiyao.springcloud.controller;

import com.xiyao.springcloud.pojo.Dept;
import lombok.experimental.var;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author 28591227@qq.com
 * @create 2020-02-21 18:21
 **/

@RestController
public class DeptController {

    //Restful风格,RestTemplate... 供我们直接调用,注册到spring中

    @Autowired
    private RestTemplate restTemplate;

    //通过ribbon，我们这里应该是一个变量，通过服务名来访问
    private static final String REST_URL_PREFIX = "http://SPRINGCLOUD-PROVIDER-DEPT";
    //单机
    // private static final String REST_URL_PREFIX = "http://localhost:8001";

    @RequestMapping("/consumer/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id) {
        String url = REST_URL_PREFIX + "/dept/get/" + id;
        System.out.println(url);
        return restTemplate.getForObject(REST_URL_PREFIX + "/dept/get/" + id, Dept.class);
    }

    @RequestMapping("/consumer/dept/add")
    public boolean add(Dept dept) {
        return restTemplate.postForObject(REST_URL_PREFIX + "/dept/add", dept, boolean.class);
    }

    @RequestMapping("/consumer/dept/list")
    public List<Dept> list() {
        return restTemplate.getForObject(REST_URL_PREFIX + "/dept/list", List.class);
    }


}














