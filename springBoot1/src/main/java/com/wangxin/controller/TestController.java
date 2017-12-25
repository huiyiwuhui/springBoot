package com.wangxin.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: 王鑫
 * @Date: 2017/12/25
 * @Time: 12:21
 * Description:
 */
@RestController
public class TestController {

    @RequestMapping("/refreshRunParams.do")
    public String refreshRunParams() {
        return "hello";
    }
}
