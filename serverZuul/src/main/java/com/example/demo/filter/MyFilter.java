package com.example.demo.filter;

import com.netflix.zuul.ZuulFilter;

public class MyFilter extends ZuulFilter {
    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return false;
    }

    @Override
    public Object run() {
        System.out.println("Zuul pre Deal");
        return null;
    }
}
