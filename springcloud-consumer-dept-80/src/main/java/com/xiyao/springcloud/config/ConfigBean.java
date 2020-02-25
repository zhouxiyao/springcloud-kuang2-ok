package com.xiyao.springcloud.config;


import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author 28591227@qq.com
 * @create 2020-02-21 18:23
 **/

/**
 * configuration  相当于 spring applicationContext.xml
 *
 * @author zhouxiyao
 */

@Configuration
public class ConfigBean {

    /**
     * //配置负载均衡实现RestTemplate ,Ribbon
     * IRule
     * AvailabilityFilteringRule:会先过滤掉 ，跳闸，访问故障的服务，对盛下的进行轮询
     * RandomRule:随机
     * RetryRule:先按照轮询，失败后再重试
     *
     * @return
     */
    @LoadBalanced
    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }


}
