package com.xiyao.springcloud.service;

import com.xiyao.springcloud.pojo.Dept;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

/**
 * @author 28591227@qq.com
 * @create 2020-02-22 20:12
 *
 **/

@Component
@FeignClient(value = "SPRINGCLOUD-PROVIDER-DEPT",fallbackFactory =DeptClientServiceFallbackFactory.class )
public interface DeptClientService {

    @GetMapping("/det/get/{id}")
    Dept queryById(long id);


    @GetMapping("/dept/list")
    List<Dept> queryAll();


    @PostMapping("/deptadd")
    boolean addDept(Dept dept);

}
