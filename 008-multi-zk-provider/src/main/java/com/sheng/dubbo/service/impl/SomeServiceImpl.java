package com.sheng.dubbo.service.impl;

import com.sheng.dubbo.model.User;
import com.sheng.dubbo.service.SomeService;

public class SomeServiceImpl implements SomeService {
    @Override
    public String hello() {
        return "hello multi dubbo zookeeper";
    }

    @Override
    public User queryUserById(Integer id) {
        User user = new User();
        user.setId(id);
        user.setUsername("zzs-" + id);
        return user;
    }
}
