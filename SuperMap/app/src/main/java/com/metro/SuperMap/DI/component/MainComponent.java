package com.metro.SuperMap.DI.component;

import com.metro.SuperMap.DI.module.MainModule;
import com.metro.SuperMap.View.Activity.MainActivity;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by wing on 16/7/21.
 */
@Singleton
@Component(modules = MainModule.class)
public interface MainComponent {
    void inject(MainActivity activity);
  //  void inject(MainPresenterImpl presenter);
}
