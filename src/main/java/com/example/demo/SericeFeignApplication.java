package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients

/**
 * 加上@EnableFeignClients注解开启Feign的功能
 */
public class SericeFeignApplication {

	public static void main(String[] args) {
		SpringApplication.run(SericeFeignApplication.class, args);
	}

	//todo 0
    /*第三篇: 服务消费者（Feign）
    上一篇文章，讲述了如何通过RestTemplate+Ribbon去消费服务，这篇文章主要讲述如何通过Feign去消费服务。
    一、Feign简介
    Feign是一个声明式的伪Http客户端，它使得写Http客户端变得更简单。使用Feign，只需要创建一个接口并注解。
    它具有可插拔的注解特性，可使用Feign 注解和JAX-RS注解。
    Feign支持可插拔的编码器和解码器。Feign默认集成了Ribbon，并和Eureka结合，默认实现了负载均衡的效果。
    简而言之：
    Feign 采用的是基于接口的注解
    Feign 整合了ribbon
    //todo 1
    二、准备工作
    继续用上一节的工程， 启动eureka-server，端口为8761; 启动service-hi 两次，端口分别为8762 、8773.
    //todo 2
    三、创建一个feign的服务
    新建一个spring-boot工程，取名为serice-feign，
    在它的pom文件引入Feign的起步依赖
    spring-cloud-starter-feign、
    Eureka的起步依赖spring-cloud-starter-eureka、
    Web的起步依赖spring-boot-starter-web*/


}
