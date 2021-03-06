package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2018/6/23.
 */

@RestController
public class HiController {

    @Autowired
    SchedualServiceHi schedualServiceHi;

    /*
     * 启动程序，多次访问http://localhost:8765/hi?name=forezp,浏览器交替显示：
     * hi forezp,i am from port:8762
     * hi forezp,i am from port:8763
     */

    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    public String sayHi(@RequestParam String name){
        return schedualServiceHi.sayHiFromClientOne(name);
    }
}
