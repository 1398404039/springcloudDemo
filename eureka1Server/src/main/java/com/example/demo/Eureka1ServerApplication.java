package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
//添加@EnableEurekaServer，声明此为注册中心服务
@EnableEurekaServer
public class Eureka1ServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Eureka1ServerApplication.class, args);
	}
}
