package com.gxx.controller;

import java.util.Date;

/**
 * 
 * @author wy
 * @date 2017年2月27日
 */
public class UserConf {
	
	private Long id;
	private Long userId;
	private String phone;
	private String weixinToken;
	private String password;
	private String model;
	private Integer showMe;
	private String hideMeReason;
	private Integer infoFillinOk;
	private Date createTime;
	private String imei;
	private String version;
	private String downPlatform;
	private String mac;
	private String uuid;
	private String area;
	
	private Integer pushMessage;
	private Integer smsNotification;
	private Integer shakenFeedback;
	/**
	 * 用户等级 0未身份认证 1 未缴费认证 2已缴费认证3已购买红娘服务
	 */
	private Integer level;

	private Integer hongservice;

	private Integer heartservice;
	/**
	 * 聊天消息通知显示详情,默认开启
	 */
	private Integer chatDetail;
	
	public UserConf(){
		
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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getShowMe() {
		return showMe;
	}

	public void setShowMe(Integer showMe) {
		this.showMe = showMe;
	}

	public Integer getInfoFillinOk() {
		return infoFillinOk;
	}

	public void setInfoFillinOk(Integer infoFillinOk) {
		this.infoFillinOk = infoFillinOk;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getWeixinToken() {
		return weixinToken;
	}

	public void setWeixinToken(String weixinToken) {
		this.weixinToken = weixinToken;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getImei() {
		return imei;
	}

	public void setImei(String imei) {
		this.imei = imei;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getDownPlatform() {
		return downPlatform;
	}

	public void setDownPlatform(String downPlatform) {
		this.downPlatform = downPlatform;
	}

	public String getMac() {
		return mac;
	}

	public void setMac(String mac) {
		this.mac = mac;
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getHideMeReason() {
		return hideMeReason;
	}

	public void setHideMeReason(String hideMeReason) {
		this.hideMeReason = hideMeReason;
	}

	public Integer getPushMessage() {
		return pushMessage;
	}

	public void setPushMessage(Integer pushMessage) {
		this.pushMessage = pushMessage;
	}

	public Integer getSmsNotification() {
		return smsNotification;
	}

	public void setSmsNotification(Integer smsNotification) {
		this.smsNotification = smsNotification;
	}

	public Integer getShakenFeedback() {
		return shakenFeedback;
	}

	public void setShakenFeedback(Integer shakenFeedback) {
		this.shakenFeedback = shakenFeedback;
	}

	public Integer getLevel()
	{
		return level;
	}

	public void setLevel(Integer level)
	{
		this.level = level;
	}

	public Integer getHongservice()
	{
		return hongservice;
	}

	public void setHongservice(Integer hongservice)
	{
		this.hongservice = hongservice;
	}

	public Integer getHeartservice()
	{
		return heartservice;
	}

	public void setHeartservice(Integer heartservice)
	{
		this.heartservice = heartservice;
	}

	public Integer getChatDetail() {
		return chatDetail;
	}

	public void setChatDetail(Integer chatDetail) {
		this.chatDetail = chatDetail;
	}
}
