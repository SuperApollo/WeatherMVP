package com.apollo.weathermvp.model.impl;

import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.apollo.weathermvp.model.WeatherModel;
import com.apollo.weathermvp.model.entity.Weather;
import com.apollo.weathermvp.presenter.OnWeatherListener;
import com.apollo.weathermvp.util.volley.VolleyRequest;

/**
 * 天气数据请求操作接口的实现
 * Created by Apollo on 2017/2/20.
 */

public class WeatherModelImpl implements WeatherModel{
    @Override
    public void loadWeather(String cityNO, final OnWeatherListener listener) {
        /*数据层操作*/
        VolleyRequest.newInstance().newGsonRequest("http://www.weather.com.cn/data/sk/" + cityNO + ".html",
                Weather.class, new Response.Listener<Weather>() {
                    @Override
                    public void onResponse(Weather weather) {
                        if (weather != null) {
                            listener.onSuccess(weather);
                        } else {
                            listener.onError();
                        }
                    }
                }, new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        listener.onError();
                    }
                });
    }
}
