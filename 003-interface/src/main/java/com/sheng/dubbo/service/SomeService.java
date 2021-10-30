package com.sheng.dubbo.service;

import com.sheng.dubbo.model.User;

public interface SomeService {

    String hello();

    User queryUserById(Integer id);
}
