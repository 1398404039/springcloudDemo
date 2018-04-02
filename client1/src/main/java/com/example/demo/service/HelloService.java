package com.example.demo.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "server-zuul")
public interface HelloService {

    @RequestMapping(value = "/app2/hello")
    String sayHello();
}
