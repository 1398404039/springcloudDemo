package com.example.demo.service.hihystric;

import com.example.demo.service.HiService;
import org.springframework.stereotype.Component;

@Component
public class HiServiceHystric implements HiService {
    @Override
    public String sayHi() {
        return "hi error";
    }
}
