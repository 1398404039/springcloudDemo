package com.example.demo.controller;

import com.example.demo.common.HttpTool;
import com.example.demo.service.HelloService;
import com.example.demo.service.HiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

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

    @RequestMapping(value = "/refresh")
    public void refresh() throws IOException {
        HttpTool.post("http://localhost:8862/bus/refresh");
    }
}
