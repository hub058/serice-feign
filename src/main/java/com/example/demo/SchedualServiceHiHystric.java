package com.example.demo;

import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2018/6/23.
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry,"+name;
    }
}
