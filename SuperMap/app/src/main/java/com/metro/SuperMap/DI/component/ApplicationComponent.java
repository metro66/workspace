package com.metro.SuperMap.DI.component;

import android.app.Application;
import android.content.Context;



import com.metro.SuperMap.DI.module.ApplicationModule;
import com.metro.SuperMap.DI.scope.ApplicationContext;


import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by longer on 2017/7/30.
 */
@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {
    @ApplicationContext
    Context context();

    Application application();

   // MainApi accountAccountApi();
}
