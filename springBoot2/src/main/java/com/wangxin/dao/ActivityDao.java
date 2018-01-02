package com.wangxin.dao;

import com.wangxin.entity.Activity;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ActivityDao {

    /**
     * 获取活动秘钥
     *
     * @param activityId
     * @return
     */
    String getActivityKey(@Param(value = "activityId") String activityId);

    /**
     * 获取活动列表
     *
     * @return
     */
    Activity searchActivityList(@Param(value = "activityId") String activityId);

    List<Activity> searchActivityList();

}
