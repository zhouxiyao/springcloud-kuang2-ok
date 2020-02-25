package com.xiyao.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @author 28591227@qq.com
 * @create 2020-02-24 11:56
 **/
@SpringBootApplication
@EnableHystrixDashboard //开启
public class DeptConsumer_9001 {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer_9001.class, args);
    }
}
