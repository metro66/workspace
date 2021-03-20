package com.metro.SuperMap.Api;



import com.metro.SuperMap.Model.Bean.ApiBean;

import retrofit2.http.GET;
import rx.Observable;

/**
 * Created by wing on 16/7/21.
 */
    public interface DataApi {
    @GET("api.php")
    Observable<ApiBean> getData();

}
