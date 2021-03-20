package com.metro.SuperMap.DI.module;


import com.metro.SuperMap.Contract.MainContract;
import com.metro.SuperMap.Model.MainModelImpl;
import com.metro.SuperMap.Presenter.MainPresenterImpl;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by wing on 16/7/21.
 */

@Module
public class MainModule {
    private MainContract.MainView mMainView;

    public MainModule(MainContract.MainView mMainView) {
        this.mMainView = mMainView;
    }
    @Provides
    public MainContract.MainView inject(){
        return mMainView;
    };

/*    @Provides
    public MainContract.MainPresenter mainPresenter() {
        return new MainPresenterImpl();
    }*/
    @Singleton
    @Provides
    MainContract.MainModel mainModel(){
        return new MainModelImpl();
    }
}
