package com.xiyao.springcloud;

import com.xiyao.myrole.XiyaoRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @author 28591227@qq.com
 * @create 2020-02-21 18:37
 * Ribbon 和Eureka整合以后，客户端可以直接调用，不用关心IP地址和端口号
 **/
@SpringBootApplication
@EnableEurekaClient
//在微务启动时候就能去加载我们自己定义Ribbon类,不用这个的话，默认是轮询访问
//@RibbonClient(name="SPRINGCLOUD-PROVIDER-DEPT",configuration = XiyaoRule.class)
public class DeptConsumer_80 {

    public static void main(String[]  args) {
        SpringApplication.run(DeptConsumer_80.class,args);
    }
}
