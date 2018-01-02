package com.wangxin.entity;

/**
 * 活动中心
 */
public class Activity {
	
	private String activityId;
	private String title;//	varchar2(100)	y	活动标题
	private String imgUrl;//	varchar2(300)	y	图片地址
	private String content;//	varchar2(100)	y	活动内容
	private String custType;//	varchar2(20)	n	客户类型 多种类型用|分割
	private String activityType;//活动类型 1：跳转到原生 2：跳转到H5Url的页面上
	private String explain;//说明以
	private String prizeFlag;//领奖标识
	private String url;//兼容版本   强制升级后  可以干掉h5Url
	private String h5Url;//H5页面跳转链接
	private String status;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getActivityId() {
		return activityId;
	}

	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getCustType() {
		return custType;
	}

	public void setCustType(String custType) {
		this.custType = custType;
	}

	public String getActivityType() {
		return activityType;
	}

	public void setActivityType(String activityType) {
		this.activityType = activityType;
	}

	public String getExplain() {
		return explain;
	}

	public void setExplain(String explain) {
		this.explain = explain;
	}

	public String getPrizeFlag() {
		return prizeFlag;
	}

	public void setPrizeFlag(String prizeFlag) {
		this.prizeFlag = prizeFlag;
	}

	public String getH5Url() {
		return h5Url;
	}

	public void setH5Url(String h5Url) {
		this.h5Url = h5Url;
		this.url = h5Url;
	}
}
