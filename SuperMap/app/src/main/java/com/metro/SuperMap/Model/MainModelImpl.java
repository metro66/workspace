package com.metro.SuperMap.Model;



import com.metro.SuperMap.Api.DataApi;
import com.metro.SuperMap.Contract.MainContract;
import com.metro.SuperMap.Model.Bean.ApiBean;
import com.metro.SuperMap.Model.Entity.Constant;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import rx.Observable;

/**
 * Created by wing on 16/7/21.
 */
public class MainModelImpl implements MainContract.MainModel {

    private DataApi mApi;

    public MainModelImpl() {
        //创建Retrofit的  Observable
        mApi = new Retrofit.Builder().baseUrl(Constant.HOST).addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .build().create(DataApi.class);
    }

    @Override
    public Observable<ApiBean> loadMainData() {
        return mApi.getData();
    }
}
