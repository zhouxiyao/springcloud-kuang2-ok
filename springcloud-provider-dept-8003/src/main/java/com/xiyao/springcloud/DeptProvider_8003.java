package com.xiyao.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author 28591227@qq.com
 * @create 2020-02-21 17:37
 **/

@SpringBootApplication
@EnableEurekaClient  //自动注册到服务中
@EnableDiscoveryClient    //服务发现
public class DeptProvider_8003 {

    public static void main(String[] args) {
        SpringApplication.run(DeptProvider_8003.class, args);
    }

}
