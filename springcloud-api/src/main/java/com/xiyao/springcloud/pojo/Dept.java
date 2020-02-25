package com.xiyao.springcloud.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * @author 28591227@qq.com
 * @create 2020-02-21 16:40
 **/

@Data
@NoArgsConstructor  //无参构造函数
@Accessors(chain=true)
public class Dept {

    private long deptno;

    private String dname;
    private String db_source;

    public Dept(String dname) {
        this.dname = dname;
    }
}
