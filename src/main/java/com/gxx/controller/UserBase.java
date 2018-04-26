package com.gxx.controller;


/**
 * 
 * @author wy
 * @date 2017年3月1日
 */
public class UserBase {

	private Long id;
	private Long userId;
	private String nick;
	private String headImage;
	private String height;
	private String weight;
	private String livingAddress;
	private String maritalStatus;
	private Integer age;
	private String sex;
	private String race;
	/**
	 * 手机型号
	 */
	private String phoneModel;
	/**
	 * 星座
	 */
	private String constellation;
	private String homeAddress;
	private String marryPlan;
	private String hasChild;
	/**
	 * 家中排行
	 * 老大、老二、中间、老幺
	 */
	private String familyRange;
	/**
	 * 信仰
	 */
	private String faith;
	private String smoke;
	private String drink;
	/**
	 * 个人介绍
	 */
	private String selfIntroduction;
	private String targetSex;
	
	/**
	 * 用户类型:1(注册用户);2(导入推荐用户,展示给未登录用户浏览)
	 */
	private Integer userType;
	
	/**
	 * 冗余字段：from user_conf
	 */
	private Integer showMe;
	/**
	 * 冗余字段：from user_conf
	 */
	private Integer infoFillinOk;
	private String advantage;
	private String model;
	/**
	 * 身份认证状态：默认为0(未通过),认证通过时,值设为1(通过认证)
	 */
	private Integer identityAuthStatus;

	private String IDnum;
	private String birth;
	private String trueName;
	/**
	 * 标签：逗号分隔
	 */
	private String labels;
	/**
	 * 类型-值,类型-值  如：运动-游泳,音乐-摇滚
	 */
	private String hobby;
	
	/**
	 * 账号状态:1-启用;0-已禁用
	 */
	private Integer accountStatus;
	
	/**
	 * 微信号
	 */
	private String weixinId;
	
	private String advantageEdit;

	public UserBase(){
		
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
	public String getNick() {
		return nick;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}
	public String getHeadImage() {
		return headImage;
	}
	public void setHeadImage(String headImage) {
		this.headImage = headImage;
	}
	public String getHeight() {
		return height;
	}
	public void setHeight(String height) {
		this.height = height;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	public String getLivingAddress() {
		return livingAddress;
	}
	public void setLivingAddress(String livingAddress) {
		this.livingAddress = livingAddress;
	}
	public String getMaritalStatus() {
		return maritalStatus;
	}
	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getPhoneModel() {
		return phoneModel;
	}
	public void setPhoneModel(String phoneModel) {
		this.phoneModel = phoneModel;
	}
	public String getConstellation() {
		return constellation;
	}
	public void setConstellation(String constellation) {
		this.constellation = constellation;
	}
	public String getHomeAddress() {
		return homeAddress;
	}
	public void setHomeAddress(String homeAddress) {
		this.homeAddress = homeAddress;
	}
	public String getMarryPlan() {
		return marryPlan;
	}
	public void setMarryPlan(String marryPlay) {
		this.marryPlan = marryPlay;
	}
	public String getFamilyRange() {
		return familyRange;
	}
	public void setFamilyRange(String familyRange) {
		this.familyRange = familyRange;
	}
	public String getFaith() {
		return faith;
	}
	public void setFaith(String faith) {
		this.faith = faith;
	}
	public String getDrink() {
		return drink;
	}
	public void setDrink(String drink) {
		this.drink = drink;
	}
	public String getSelfIntroduction() {
		return selfIntroduction;
	}
	public void setSelfIntroduction(String selfIntroduction) {
		this.selfIntroduction = selfIntroduction;
	}

	public String getHasChild()
	{
		return hasChild;
	}

	public void setHasChild(String hasChild)
	{
		this.hasChild = hasChild;
	}

	public String getSmoke()
	{
		return smoke;
	}

	public void setSmoke(String smoke)
	{
		this.smoke = smoke;
	}

	public String getRace()
	{
		return race;
	}

	public void setRace(String race)
	{
		this.race = race;
	}

	public String getTargetSex() {
		return targetSex;
	}

	public void setTargetSex(String targetSex) {
		this.targetSex = targetSex;
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
	
	public String getAdvantage()
	{
		return advantage;
	}

	public void setAdvantage(String advantage)
	{
		this.advantage = advantage;
	}

	public String getModel()
	{
		return model;
	}

	public void setModel(String model)
	{
		this.model = model;
	}

	public Integer getUserType() {
		return userType;
	}

	public void setUserType(Integer userType) {
		this.userType = userType;
	}

	public Integer getIdentityAuthStatus() {
		return identityAuthStatus;
	}

	public void setIdentityAuthStatus(Integer identityAuthStatus) {
		this.identityAuthStatus = identityAuthStatus;
	}

	public String getIDnum()
	{
		return IDnum;
	}

	public void setIDnum(String IDnum)
	{
		this.IDnum = IDnum;
	}

	public String getBirth()
	{
		return birth;
	}

	public void setBirth(String birth)
	{
		this.birth = birth;
	}

	public String getTrueName()
	{
		return trueName;
	}

	public void setTrueName(String trueName)
	{
		this.trueName = trueName;
	}

	public String getLabels() {
		return labels;
	}

	public void setLabels(String labels) {
		this.labels = labels;
	}

	public String getHobby()
	{
		return hobby;
	}

	public void setHobby(String hobby)
	{
		this.hobby = hobby;
	}

	public Integer getAccountStatus() {
		return accountStatus;
	}

	public void setAccountStatus(Integer accountStatus) {
		this.accountStatus = accountStatus;
	}

	public String getWeixinId() {
		return weixinId;
	}

	public void setWeixinId(String weixinId) {
		this.weixinId = weixinId;
	}

	public String getAdvantageEdit() {
		return advantageEdit;
	}

	public void setAdvantageEdit(String advantageEdit) {
		this.advantageEdit = advantageEdit;
	}
}
