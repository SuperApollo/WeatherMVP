package com.apollo.weathermvp.presenter;

/**
 * presenter层
 * Created by Apollo on 2017/2/20.
 */

public interface WeatherPresenter {
    /**
     * 获取天气的逻辑
     */
    void getWeather(String cityNO);
}
