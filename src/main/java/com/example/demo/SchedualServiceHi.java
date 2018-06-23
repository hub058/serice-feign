package com.example.demo;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Administrator on 2018/6/23.
 * 定义一个feign接口，通过@ FeignClient（“服务名”），
 * 来指定调用哪个服务。比如在代码中调用了service-hi服务的“/hi”接口
 */

@FeignClient(value = "service-hi",fallback = SchedualServiceHiHystric.class)
@Service
public interface SchedualServiceHi {

    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam("name") String name);

}
