/**
 * @program: mystock
 * @description: 测试前后端跨域请求
 * @author: huangjie
 * @create: 2020-03-17 21:35
 **/

package com.hj.mystock.controller;

import ch.qos.logback.core.net.SyslogOutputStream;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

@CrossOrigin(origins = "*",maxAge = 3600)
@Controller
public class TestController {




    @RequestMapping("/")
    public void test(){

        System.out.println("test");



    }




}
