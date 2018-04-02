package com.example.demo.service;

import com.example.demo.service.hihystric.HelloServiceHystric;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "server-zuul",fallback = HelloServiceHystric.class)
public interface HelloService {

    @RequestMapping(value = "/app2/hello")
    String sayHello();
}
