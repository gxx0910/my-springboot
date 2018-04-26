package com.gxx.common;

/**
 * Created by gaoxx on 2018/4/26  0026.
 */
public enum FemaleEnum {
    talent(1, "多才多艺的女子", "gerenzhuye_youshi_caiyi@2x.png"),
    income_10_15(2, "收入稳定", "gerenzhuye_youshi_shouru@2x.png"),
    income_15_20(3, "白领精英", "gerenzhuye_youshi_shouru@2x.png"),
    income_20_30(4, "高薪白领", "gerenzhuye_youshi_shouru@2x.png"),
    income_30_50(5, "经济独立", "gerenzhuye_youshi_shouru@2x.png"),

    education(10, "才高八斗的高材生", "gerenzhuye_youshi_xueli@2x.png"),
    age_0_24(14, "小软妹", "gerenzhuye_youshi_gaoshouru@2x.png"),
    age_24_30(15, "轻熟女", "gerenzhuye_youshi_gaoshouru@2x.png"),
    age_30_40(16, "御姐", "gerenzhuye_youshi_gaoshouru@2x.png"),

    body(21, "身材比例佳", "gerenzhuye_youshi_shencai@2x.png"),
    stature_160(22, "娇小玲珑", "gerenzhuye_youshi_gaoshouru@2x.png"),
    stature_160_165(23, "梦幻身高", "gerenzhuye_youshi_gaoshouru@2x.png"),
    stature_165_170(24, "长腿美女", "gerenzhuye_youshi_gaoshouru@2x.png"),
    stature_170_175(25, "模特身材", "gerenzhuye_youshi_gaoshouru@2x.png"),

    foreign_school(31, "海外留学生", "gerenzhuye_youshi_biye@2x.png"),
    vocation_1(32, "互联网行业", "gerenzhuye_youshi_youche.png"),
    vocation_2(33, "计算机通信行业", "gerenzhuye_youshi_youche.png"),
    vocation_3(34, "会计金融银行保险行业", "gerenzhuye_youshi_youche.png"),
    vocation_4(35, "生活服务行业", "gerenzhuye_youshi_youche.png"),
    vocation_5(36, "人力行政行业", "gerenzhuye_youshi_youche.png"),
    vocation_6(37, "销售客户采购行业", "gerenzhuye_youshi_youche.png"),
    vocation_7(38, "酒店行业", "gerenzhuye_youshi_youche.png"),
    vocation_8(39, "市场／媒介／广告／设计", "gerenzhuye_youshi_youche.png"),
    vocation_9(40, "生产／物流／指控／汽车", "gerenzhuye_youshi_youche.png"),
    vocation_10(42, "法律／教育／翻译／出版", "gerenzhuye_youshi_youche.png"),
    vocation_11(43, "医疗／制药／环保", "gerenzhuye_youshi_youche.png"),
    vocation_12(44, "建筑／物业／农业", "gerenzhuye_youshi_youche.png"),

    _985school(41, "985重点院校毕业", "gerenzhuye_youshi_985.png"),
    get_married_time_0(42, "时刻准备好结婚", "gerenzhuye_youshi_che@2x.png"),
    get_married_time_1(43, "准备一年内结婚", "gerenzhuye_youshi_che@2x.png"),
    get_married_time_2(44, "两年内考虑结婚", "gerenzhuye_youshi_che@2x.png"),
    get_married_time_3(45, "三年内考虑结婚", "gerenzhuye_youshi_che@2x.png"),

    _211school(51, "211重点院校毕业", "gerenzhuye_youshi_211.png"),

    fendou(61, "努力在一线城市奋斗的年轻人", "gerenzhuye_youshi_fendou.png"),

    habit(71, "生活习惯好", "gerenzhuye_youshi_jiankang@2x.png"),

    huayangnianhua(81, "正值花样年华", "gerenzhuye_youshi_qingchun.png"),

    height(91, "身材高挑", "gerenzhuye_youshi_gaotiao.png"),

    zhimagood(100, "芝麻信用优秀", "gerenzhuye_youshi_xinyong@2x.png"),
    zhima(101, "芝麻信用认证通过", "gerenzhuye_youshi_xinyong@2x.png"),


    defaultAd(1001, "个人资料填写较全", "gerenzhuye_youshi_zhenshi@2x.png");

    public int type;
    public String desc;
    public String icon;

    private FemaleEnum(int type, String desc, String icon) {
        this.type = type;
        this.desc = desc;
        this.icon = icon;
    }

    public static FemaleEnum find(int type) {
        for (FemaleEnum e : FemaleEnum.values()) {
            if (e.type == type) {
                return e;
            }
        }
        return null;
    }
}
