package com.xiyao.myrole;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author 28591227@qq.com
 * @create 2020-02-22 19:36
 **/

@Configuration
public class XiyaoRule {

    /**
     * 随机
     * @return
     */
    @Bean
    public IRule myRule() {
        return new RandomRule();
    }

}
