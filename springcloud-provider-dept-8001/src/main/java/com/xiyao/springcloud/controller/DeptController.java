package com.xiyao.springcloud.controller;

import com.xiyao.springcloud.pojo.Dept;
import com.xiyao.springcloud.service.DeptService;
import lombok.experimental.var;
import org.apache.ibatis.scripting.xmltags.ForEachSqlNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;
import sun.security.jca.ServiceId;

import java.util.List;

/**
 * @author 28591227@qq.com
 * @create 2020-02-21 17:22
 **/

@RestController
public class DeptController {

    @Autowired
    private DeptService deptService;

    @Autowired
    private DiscoveryClient discoveryClient;

    @PostMapping("/dept/add")
    public boolean addDept(@RequestBody Dept dept) {
        return deptService.addDept(dept);
    }

    @GetMapping("/dept/get/{id}")
    public Dept get(@PathVariable("id") long id) {
        Dept dept = deptService.queryId(id);
        if (dept == null) {
            throw new RuntimeException("Fail");
        }
        return dept;
    }

    @GetMapping("/dept/list")
    public List<Dept> queryAll() {
        System.out.println("aaaa");
        System.out.println(deptService.queryAll());
        return deptService.queryAll();
    }

    @GetMapping("/dept/discovery")
    public Object discovery() {
        List<String> services = discoveryClient.getServices();
        System.out.println("discovery=>services:" + services);

        List<ServiceInstance> instances = discoveryClient.getInstances("SPRINGCLOUD-PROVIDER-DEPT");
        for (ServiceInstance item : instances) {
            System.out.println(
                    item.getHost() + "\t" +
                            item.getHost() + "\t" +
                            item.getPort() + "\t" +
                            item.getUri() + "\t" +
                            item.getServiceId()
            );
        }

        return this.discoveryClient;
    }


}
