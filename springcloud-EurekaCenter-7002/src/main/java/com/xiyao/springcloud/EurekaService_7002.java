package com.xiyao.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author 28591227@qq.com
 * @create 2020-02-21 21:28
 **/

/**
 * 启动后访问: http://localhost:7002
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaService_7002 {

    public static void main(String[] args) {
        SpringApplication.run(EurekaService_7002.class, args);
    }

}
