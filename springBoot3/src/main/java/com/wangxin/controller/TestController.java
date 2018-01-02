package com.wangxin.controller;

import com.wangxin.dao.appdao.ActivityDao;
import com.wangxin.dao.weixindao.WXUserDao;
import com.wangxin.entity.Activity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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
    @Autowired
    private ActivityDao activityDao;
    @Autowired
    private WXUserDao wxUserDao;


    @RequestMapping("/hello.do")
    public String hello() {
        return "hello";
    }

    @RequestMapping("/searchActivityList.do")
    public Object searchActivityList() {
        List<Activity> activities = activityDao.searchActivityList();
        return activities;
    }

    @RequestMapping("/test.do")
    public Object test() {
        Integer integer = wxUserDao.checkWXUser("111111111");
        return integer;
    }

    @GetMapping("/get")
    public Object get() {
        Integer integer = wxUserDao.checkWXUser("111111111");
        return integer;
    }
    @PostMapping("/post")
    public Object post() {
        Integer integer = wxUserDao.checkWXUser("111111111");
        return integer;
    }
}
