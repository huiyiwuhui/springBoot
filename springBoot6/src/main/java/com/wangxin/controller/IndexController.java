package com.wangxin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by admin on 2018/1/4.
 */
@Controller
public class IndexController {

    @GetMapping("/index")
    public String index(){
        return "index";
    }

    @GetMapping("/test1")
    public void test1(){
        System.out.println("!11111");
    }


    @GetMapping("/test2")
    public ModelAndView test2(){
        ModelAndView modelAndView = new ModelAndView("/test2");
        return modelAndView;
    }
}
