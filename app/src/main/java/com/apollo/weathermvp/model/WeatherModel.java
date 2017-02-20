package com.apollo.weathermvp.model;

import com.apollo.weathermvp.presenter.OnWeatherListener;

/**
 * Created by Apollo on 2017/2/20.
 */

public interface WeatherModel {
    void loadWeather(String cityNO, OnWeatherListener listener);
}
