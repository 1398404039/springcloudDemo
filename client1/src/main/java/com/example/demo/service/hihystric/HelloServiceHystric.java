package com.example.demo.service.hihystric;

import com.example.demo.service.HelloService;
import org.springframework.stereotype.Component;

@Component
public class HelloServiceHystric implements HelloService {
    @Override
    public String sayHello() {
        return "hello error";
    }
}
