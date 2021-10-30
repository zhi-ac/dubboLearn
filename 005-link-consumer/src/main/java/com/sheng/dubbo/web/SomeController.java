package com.sheng.dubbo.web;

import com.sheng.dubbo.model.User;
import com.sheng.dubbo.service.SomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SomeController {

    @Autowired
    SomeService someService;

    @RequestMapping("/hello")
    public String hello(Model model) {
        String hello = someService.hello();
        model.addAttribute("hello", hello);
        return "hello";
    }

    @RequestMapping(value = "user/detail")
    public String userDetail(Model model, Integer id) {
        User user = someService.queryUserById(id);
        model.addAttribute("user", user);
        return "userDetail";
    }
}
