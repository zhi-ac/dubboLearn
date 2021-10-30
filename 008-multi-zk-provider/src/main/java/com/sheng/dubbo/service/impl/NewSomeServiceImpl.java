package com.sheng.dubbo.service.impl;

import com.sheng.dubbo.model.User;
import com.sheng.dubbo.service.SomeService;

public class NewSomeServiceImpl implements SomeService {
    @Override
    public String hello() {
        return "hello dubbo project 222";
    }

    @Override
    public User queryUserById(Integer id) {
        User user = new User();
        user.setId(id);
        user.setUsername("lisi-" + id);
        return user;
    }
}
