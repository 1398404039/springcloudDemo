package com.example.demo.controller;

import com.example.demo.service.HelloService;
import com.example.demo.service.HiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HController {

    @Autowired
    HiService hiService;
    @Autowired
    HelloService helloService;

    @RequestMapping(value = "/hi")
    public String sayHi(@RequestParam String name){
        return name + hiService.sayHi();
    }

    @RequestMapping(value = "/hello")
    public String sayHello(@RequestParam String name){
        return name + helloService.sayHello();
    }
}
