package com.metro.SuperMap.Presenter;

import android.util.Log;


import com.metro.SuperMap.Contract.MainContract;
import com.metro.SuperMap.Model.Bean.ApiBean;

import javax.inject.Inject;

import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by wing on 16/7/21.
 */
public class MainPresenterImpl implements MainContract.MainPresenter {
    private MainContract.MainView mMainView;
    private MainContract.MainModel mMainModel;

    @Inject
    public MainPresenterImpl(MainContract.MainView mainView, MainContract.MainModel mainModel) {
        mMainView = mainView;
        mMainModel = mainModel;
    }

    @Override
    public void getMainData() {
        mMainModel.loadMainData()
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe(new Subscriber<ApiBean>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onNext(ApiBean apiBean) {
                        mMainView.showData(apiBean.getRetData());
                        Log.e("wing","onNext");
                    }


                });
    }
}
