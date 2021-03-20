package com.metro.SuperMap.app;

import android.app.Application;


import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;

/**
 * @author:
 * @date: 2018/7/25
 * @description: application
 */

public class MyApp extends Application {
    public static MyApp myApp;
    public static final int TIMEOUT = 60;
    private static OkHttpClient mOkHttpClient;

    @Override
    public void onCreate() {
        super.onCreate();
        myApp = this;
    }

    /**
     * 全局httpclient
     *
     * @return
     */
    public static OkHttpClient initOKHttp() {
        if (mOkHttpClient == null) {
            mOkHttpClient = new OkHttpClient.Builder()
                    .connectTimeout(TIMEOUT, TimeUnit.SECONDS)//设置连接超时时间
                    .readTimeout(TIMEOUT, TimeUnit.SECONDS)//设置读取超时时间
                    .writeTimeout(TIMEOUT, TimeUnit.SECONDS)//设置写入超时时间
                    .addInterceptor(com.metro.SuperMap.utils.InterceptorUtil.LogInterceptor())//添加日志拦截器
                    //cookie
                    .addInterceptor(new com.metro.SuperMap.utils.network.CookieReadInterceptor())
                    .addInterceptor(new com.metro.SuperMap.utils.network.CookiesSaveInterceptor())
                    .build();
        }
        return mOkHttpClient;
    }

}
