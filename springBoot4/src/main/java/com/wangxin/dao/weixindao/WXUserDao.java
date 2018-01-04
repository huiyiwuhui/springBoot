package com.wangxin.dao.weixindao;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface WXUserDao {
     Integer checkWXUser(String openId);
}
