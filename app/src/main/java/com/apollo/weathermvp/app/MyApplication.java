package com.apollo.weathermvp.app;

import android.app.Application;

import com.apollo.weathermvp.util.volley.VolleyRequest;

/**
 * Created by Apollo on 2017/2/20.
 */

public class MyApplication extends Application {
    private static MyApplication instance;

    public MyApplication() {
        instance = this;
    }

    public static Application getContext() {
        return instance;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        VolleyRequest.buildRequestQueue(this);
    }
}
