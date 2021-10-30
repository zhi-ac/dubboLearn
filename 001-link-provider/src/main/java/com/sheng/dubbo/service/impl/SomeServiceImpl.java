package com.sheng.dubbo.service.impl;

import com.sheng.dubbo.service.SomeService;

public class SomeServiceImpl implements SomeService {
    @Override
    public String hello(String msg) {
        return "hello" + msg;
    }
}
