package com.xiyao.springcloud.service;

import com.xiyao.springcloud.pojo.Dept;
import feign.hystrix.FallbackFactory;
import lombok.experimental.var;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author 28591227@qq.com
 * @create 2020-02-24 9:52
 * 降级
 **/
@Component
public class DeptClientServiceFallbackFactory implements FallbackFactory {

    @Override
    public DeptClientService create(Throwable throwable) {

        return new DeptClientService() {
            @Override
            public Dept queryById(long id) {
                return new Dept()
                        .setDeptno(id)
                        .setDb_source("id=>" + id + "没有对应的信息！；客户端提供了降级，这个服务现在关闭")
                        .setDb_source("no database ... 无数据；客户端提供了降级，这个服务现在关闭");
            }

            @Override
            public List<Dept> queryAll() {
                return null;
            }

            @Override
            public boolean addDept(Dept dept) {
                return false;
            }
        };
    }
}
