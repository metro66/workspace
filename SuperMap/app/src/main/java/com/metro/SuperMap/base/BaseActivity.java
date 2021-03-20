package com.metro.SuperMap.base;


import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;
import android.view.WindowManager;


import butterknife.ButterKnife;

/**
 * Created by ganyao on 2016/10/26.
 */
public abstract class BaseActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //设置竖屏
        //setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags( WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN );
        setContentView(getContentLayout());
        ButterKnife.bind(this);

        initView();
        initData();
    }

    protected abstract @LayoutRes int getContentLayout();

    protected abstract void initView();

    protected abstract void initData();


}
