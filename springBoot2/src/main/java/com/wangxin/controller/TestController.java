package com.wangxin.controller;

import com.wangxin.dao.ActivityDao;
import com.wangxin.entity.Activity;
import org.springframework.beans.factory.annotation.Autowired;
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


    @RequestMapping("/hello.do")
    public String hello() {
        return "hello";
    }

    @RequestMapping("/searchActivityList.do")
    public Object searchActivityList() {
        List<Activity> activities = activityDao.searchActivityList();

        return activities;
    }
}
