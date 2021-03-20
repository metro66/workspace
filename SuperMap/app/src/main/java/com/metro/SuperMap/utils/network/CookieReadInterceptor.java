package com.metro.SuperMap.utils.network;



import com.metro.SuperMap.app.MyApp;
import com.metro.SuperMap.utils.SharePreferencesUtils;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/**
 * @author:
 * @date: 2018/7/27
 * @description: 读取cookie
 */

public class CookieReadInterceptor implements Interceptor {
    @Override
    public Response intercept(Chain chain) throws IOException {
        Request.Builder builder = chain.request().newBuilder();
        builder.addHeader("Cookie", SharePreferencesUtils.getString(MyApp.myApp, "cookiess", ""));
        return chain.proceed(builder.build());
    }
}
