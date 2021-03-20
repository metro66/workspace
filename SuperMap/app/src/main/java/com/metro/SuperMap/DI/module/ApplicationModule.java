package com.metro.SuperMap.DI.module;

import android.app.Application;
import android.content.Context;


import com.metro.SuperMap.Api.MainApi;
import com.metro.SuperMap.DI.scope.ApplicationContext;


import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by longer on 2017/7/30.
 */

@Module
public class ApplicationModule {

    protected final Application mApplication;

    public ApplicationModule(Application application) {
        mApplication = application;
    }

    @Provides
    public Application provideApplication() {
        return mApplication;
    }

    @Provides
    @ApplicationContext
    public Context provideContext() {
        return mApplication;
    }

/*    @Provides
    @Singleton
    public MainApi provideMainApi(DemoRetrofit retrofit) {
        return retrofit.get().create(MainApi.class);
    }*/
}
