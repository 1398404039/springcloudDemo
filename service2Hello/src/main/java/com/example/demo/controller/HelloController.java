package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Value("${server.port}")
    String port;
    @Value("${author}")
    String author;@RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String sayHi(){
        return "This is Hello Service,port: " + port + "  and author: " + author;
    }
}
