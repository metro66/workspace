package com.metro.SuperMap.Model.Bean;

/**
 * @author:
 * @date: 2018/3/8
 * @description: 所有接口地址集
 */

public class ApiAddress {

    public final static String scoreUrl = "http://www.188bifen.com/";

    //生成环境
    public final static String api = "http://www.tv188.com/";


    /***********************首页*******************************/
    //banner
    public final static String getBannerList = "mobile/listSlides.do";
    //获取直播数据
    public final static String getLivesList = "mobile/listLives.do";
    //最新资讯
    public final static String getZixunList = "mobile/listArticles.do";



    /**************************************个人中心************************************************/
    //忘记密码
    public final static String forgetPwd = "mbforgetPwd.do";
    //登录
    public final static String userLogin = "mblogin.do";
    //注册
    public final static String userRegister = "mbregister.do";
    //发送验证码
    public final static String sendVerifyCode = "mbsend";

    //获取图片验证码
    public final static String getVerifyCode = "getVerityCode.do";




}
