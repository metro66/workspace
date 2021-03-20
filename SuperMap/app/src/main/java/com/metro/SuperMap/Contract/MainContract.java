package com.metro.SuperMap.Contract;


import com.metro.SuperMap.Model.Bean.ApiBean;

import rx.Observable;

/**
 * Created by wing on 16/7/21.
 */
public interface MainContract {
    interface MainView{
        void showData(ApiBean.RetDataBean retDataBean);
        void showProgressBar();
    }



    interface MainPresenter{
        void getMainData();
    }

    interface MainModel{
        Observable loadMainData();
    }

}
