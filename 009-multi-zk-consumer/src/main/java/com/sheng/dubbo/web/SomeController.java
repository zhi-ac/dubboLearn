package com.sheng.dubbo.web;

import com.sheng.dubbo.service.SomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SomeController {

    /*
     * 同一个接口有不同实现类
     */
    @Autowired
    SomeService someService;
    @Autowired
    SomeService newSomeService;

    @RequestMapping("/hello")
    public String hello(Model model) {
        //调用远程接口服务
        String hello = someService.hello();
        model.addAttribute("hello", hello);
        String hello1 = newSomeService.hello();
        model.addAttribute("hello1", hello1);
        return "hello";
    }

}
