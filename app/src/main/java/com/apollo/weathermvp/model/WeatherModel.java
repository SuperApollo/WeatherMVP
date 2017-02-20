package com.apollo.weathermvp.model;

import com.apollo.weathermvp.presenter.OnWeatherListener;

/**
 * model数据操作接口
 * Created by Apollo on 2017/2/20.
 */

public interface WeatherModel {
    void loadWeather(String cityNO, OnWeatherListener listener);
}
