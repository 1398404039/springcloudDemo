package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class HiController {

    @Value("${server.port}")
    String port;
    @Value("${author}")
    String author;@RequestMapping(value = "/hi",method = RequestMethod.GET)
    public String sayHi(){
        return "This is Hi Service,port: " + port + "  and author: " + author;
    }
}
