package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiController {

    @Value("${server.port}")
    String port;
    @Value("${author}")
    String author;
}
