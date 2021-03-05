package com.gitdemo.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhengxinbin
 * @program: zhengxinbin
 * @description: 测试
 * @create 2021-03-04 13:21:17
 */
@RestController
@RequestMapping("/")
public class Test {
    @RequestMapping("/test")
    public String sample()
    {
        return "测试8888!!!";
    }

}
