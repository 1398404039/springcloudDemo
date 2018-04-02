package com.example.demo.service;

import com.example.demo.service.hihystric.HiServiceHystric;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "server-zuul",fallback = HiServiceHystric.class)
public interface HiService {

    @RequestMapping(value = "/app1/hi")
    String sayHi();
}
