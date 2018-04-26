package com.gxx.controller;

import java.util.*;

/**
 * Created by gaoxx on 2018/4/26  0026.
 */
public class UserImportVo {

    private Long userId;

    private String phone;
    //国际区号，大陆:86
    private String area;
    private String phoneModel;
    private String avatar;
    private String photoList;
    private String nick;
    private String sex;
    private String realName;
    private Integer age;
    private String height;
    private String weight;
    private String livingAddress;
    private String familyRange;
    private String homeAddress;
    private String race;
    private String constellation;
    private String birth;
    private String selfIntroduction;
    private String industry;
    private String jobs;
    private Integer workYearsLevel;
    private Integer annualIncomeLevel;
    private String marryPlan;
    private Integer targetAnnualIncomeLevel;
    private String targetAge;
    private String targetHeight;
    private String targetWeight;

    private String maritalStatus;
    private String hasChild;
    private String faith;
    private String smoke;
    private String drink;
    private String labels;
    private String advantage;

    //学位认证
    private String degree;
    private String university;
    //房产认证
    private String houseStatus;
    private String houseAddress;
    //汽车认证
    private String carStatus;
    private String carBrand;
    //视频认证
    private String videoValue;
    //公司职位认证
    private String company;
    //特殊才艺认证
    private String talent;                    //特殊才艺:1-钢琴,2-篮球

    //择偶条件
    private String targetCons;                //对象星座
    private String targetLivingAddress;
    private String targetHomeAddress;
    private String targetMarryPlan;            //对象期望结婚时间
    private String targetRace;                //对象民族
    private String targetMarryStatus;        //对象婚姻状况
    private String targetHasChild;
    private String targetFaith;
    private String targetSmoke;
    private String targetDrink;

    private UserConf userConf;
    private UserBase userBase;

    /**
     * 1-身份认证；2-学历认证；3-房产认证；4-汽车认证；5-公司认证；6-芝麻信用认证；	<br/>
     * 目前只导入学历认证、房产认证、汽车认证、公司认证
     */
    private List<UserAuth> userAuthList;

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

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getPhoneModel() {
        return phoneModel;
    }

    public void setPhoneModel(String phoneModel) {
        this.phoneModel = phoneModel;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getPhotoList() {
        return photoList;
    }

    public void setPhotoList(String photoList) {
        this.photoList = photoList;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
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

    public String getFamilyRange() {
        return familyRange;
    }

    public void setFamilyRange(String familyRange) {
        this.familyRange = familyRange;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getConstellation() {
        return constellation;
    }

    public void setConstellation(String constellation) {
        this.constellation = constellation;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public String getSelfIntroduction() {
        return selfIntroduction;
    }

    public void setSelfIntroduction(String selfIntroduction) {
        this.selfIntroduction = selfIntroduction;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public String getJobs() {
        return jobs;
    }

    public void setJobs(String jobs) {
        this.jobs = jobs;
    }

    public Integer getWorkYearsLevel() {
        return workYearsLevel;
    }

    public void setWorkYearsLevel(Integer workYearsLevel) {
        this.workYearsLevel = workYearsLevel;
    }

    public Integer getAnnualIncomeLevel() {
        return annualIncomeLevel;
    }

    public void setAnnualIncomeLevel(Integer annualIncomeLevel) {
        this.annualIncomeLevel = annualIncomeLevel;
    }

    public String getMarryPlan() {
        return marryPlan;
    }

    public void setMarryPlan(String marryPlan) {
        this.marryPlan = marryPlan;
    }

    public Integer getTargetAnnualIncomeLevel() {
        return targetAnnualIncomeLevel;
    }

    public void setTargetAnnualIncomeLevel(Integer targetAnnualIncomeLevel) {
        this.targetAnnualIncomeLevel = targetAnnualIncomeLevel;
    }

    public String getTargetAge() {
        return targetAge;
    }

    public void setTargetAge(String targetAge) {
        this.targetAge = targetAge;
    }

    public String getTargetHeight() {
        return targetHeight;
    }

    public void setTargetHeight(String targetHeight) {
        this.targetHeight = targetHeight;
    }

    public String getTargetWeight() {
        return targetWeight;
    }

    public void setTargetWeight(String targetWeight) {
        this.targetWeight = targetWeight;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getHasChild() {
        return hasChild;
    }

    public void setHasChild(String hasChild) {
        this.hasChild = hasChild;
    }

    public String getFaith() {
        return faith;
    }

    public void setFaith(String faith) {
        this.faith = faith;
    }

    public String getSmoke() {
        return smoke;
    }

    public void setSmoke(String smoke) {
        this.smoke = smoke;
    }

    public String getDrink() {
        return drink;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }

    public String getLabels() {
        return labels;
    }

    public void setLabels(String labels) {
        this.labels = labels;
    }

    public String getAdvantage() {
        return advantage;
    }

    public void setAdvantage(String advantage) {
        this.advantage = advantage;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getHouseStatus() {
        return houseStatus;
    }

    public void setHouseStatus(String houseStatus) {
        this.houseStatus = houseStatus;
    }

    public String getHouseAddress() {
        return houseAddress;
    }

    public void setHouseAddress(String houseAddress) {
        this.houseAddress = houseAddress;
    }

    public String getCarStatus() {
        return carStatus;
    }

    public void setCarStatus(String carStatus) {
        this.carStatus = carStatus;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public String getVideoValue() {
        return videoValue;
    }

    public void setVideoValue(String videoValue) {
        this.videoValue = videoValue;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getTalent() {
        return talent;
    }

    public void setTalent(String talent) {
        this.talent = talent;
    }

    public String getTargetCons() {
        return targetCons;
    }

    public void setTargetCons(String targetCons) {
        this.targetCons = targetCons;
    }

    public String getTargetLivingAddress() {
        return targetLivingAddress;
    }

    public void setTargetLivingAddress(String targetLivingAddress) {
        this.targetLivingAddress = targetLivingAddress;
    }

    public String getTargetHomeAddress() {
        return targetHomeAddress;
    }

    public void setTargetHomeAddress(String targetHomeAddress) {
        this.targetHomeAddress = targetHomeAddress;
    }

    public String getTargetMarryPlan() {
        return targetMarryPlan;
    }

    public void setTargetMarryPlan(String targetMarryPlan) {
        this.targetMarryPlan = targetMarryPlan;
    }

    public String getTargetRace() {
        return targetRace;
    }

    public void setTargetRace(String targetRace) {
        this.targetRace = targetRace;
    }

    public String getTargetMarryStatus() {
        return targetMarryStatus;
    }

    public void setTargetMarryStatus(String targetMarryStatus) {
        this.targetMarryStatus = targetMarryStatus;
    }

    public String getTargetHasChild() {
        return targetHasChild;
    }

    public void setTargetHasChild(String targetHasChild) {
        this.targetHasChild = targetHasChild;
    }

    public String getTargetFaith() {
        return targetFaith;
    }

    public void setTargetFaith(String targetFaith) {
        this.targetFaith = targetFaith;
    }

    public String getTargetSmoke() {
        return targetSmoke;
    }

    public void setTargetSmoke(String targetSmoke) {
        this.targetSmoke = targetSmoke;
    }

    public String getTargetDrink() {
        return targetDrink;
    }

    public void setTargetDrink(String targetDrink) {
        this.targetDrink = targetDrink;
    }

    public UserConf getUserConf() {
        return userConf;
    }

    public void setUserConf(UserConf userConf) {
        this.userConf = userConf;
    }

    public UserBase getUserBase() {
        return userBase;
    }

    public void setUserBase(UserBase userBase) {
        this.userBase = userBase;
    }

    public List<UserAuth> getUserAuthList() {
        return userAuthList;
    }

    public void setUserAuthList(List<UserAuth> userAuthList) {
        this.userAuthList = userAuthList;
    }

    private void initConf() {
        if (userConf == null) {
            userConf = new UserConf();
            userConf.setUserId(this.userId);
            userConf.setPhone(this.phone);
            userConf.setArea(this.area);
            userConf.setModel(this.phoneModel);
            userConf.setImei(UUID.randomUUID().toString());
            //default pass:loovee666
//			userConf.setPassword(DESCBC.encrypt_password("loovee666", encryptKey));
            userConf.setInfoFillinOk(1);
            userConf.setLevel(3);
            userConf.setShowMe(1);
        }
    }

    private void initBase() {
        if (userBase == null) {
            userBase = new UserBase();
            userBase.setUserId(this.userId);
            userBase.setUserType(2);            //导入用户
            userBase.setShowMe(1);
            userBase.setHeadImage(this.avatar);
            userBase.setPhoneModel(this.phoneModel);
            userBase.setNick(this.nick);
            userBase.setAge(this.age);
            userBase.setMaritalStatus(this.maritalStatus);
            userBase.setInfoFillinOk(1);
            userBase.setIdentityAuthStatus(1);
            userBase.setSmoke(this.smoke);
            userBase.setDrink(this.drink);
            userBase.setFamilyRange(this.familyRange);
            userBase.setSex(this.sex);
            userBase.setHeight(this.height);
            userBase.setWeight(this.weight);
            userBase.setTargetSex("女");
            userBase.setLivingAddress(this.livingAddress);
            userBase.setHomeAddress(this.homeAddress);
            userBase.setRace(this.race);
            userBase.setConstellation(this.constellation);
            userBase.setSelfIntroduction(this.selfIntroduction);
            userBase.setMarryPlan(this.marryPlan);
            userBase.setHasChild(this.hasChild);
            userBase.setFaith(this.faith);
            userBase.setLabels(this.labels);
            userBase.setAdvantage(this.advantage);
            userBase.setTrueName(this.realName);
            userBase.setBirth(this.birth);
        }
    }
}
