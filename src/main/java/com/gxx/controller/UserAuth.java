package com.gxx.controller;

import java.util.Date;

/**
 * 
 * @author wy
 * @date 2017年3月1日
 */
public class UserAuth {

	private Long id;
	private Long userId;
	/**
	 * 1-身份认证；2-学历认证；3-房产认证；4-汽车认证；5-公司认证；6-芝麻信用认证；7才艺认证; 8视频认证
	 */
	private Integer authType;
	private String authMessage;
	/**
	 * 认证状态：0-未认证；1-已认证；2-待审核；3-审核未通过
	 */
	private Integer status=0;
	private String image;
	private Date createTime;
	private Date updateTime;
	private String operator;



	
	public UserAuth(){
		
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public Integer getAuthType() {
		return authType;
	}
	public void setAuthType(Integer authType) {
		this.authType = authType;
	}
	public String getAuthMessage() {
		return authMessage;
	}
	public void setAuthMessage(String authMessage) {
		this.authMessage = authMessage;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getImage()
	{
		return image;
	}

	public void setImage(String image)
	{
		this.image = image;
	}

	public String getOperator()
	{
		return operator;
	}

	public void setOperator(String operator)
	{
		this.operator = operator;
	}

	public Date getUpdateTime()
	{
		return updateTime;
	}

	public void setUpdateTime(Date updateTime)
	{
		this.updateTime = updateTime;
	}

	@Override
	public String toString()
	{
		return "UserAuth{" +
			"id=" + id +
			", userId=" + userId +
			", authType=" + authType +
			", authMessage='" + authMessage + '\'' +
			", status=" + status +
			", image='" + image + '\'' +
			", createTime=" + createTime +
			", updateTime=" + updateTime +
			", operator='" + operator + '\'' +
			'}';
	}
}
