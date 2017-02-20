package com.apollo.weathermvp.view;

import com.apollo.weathermvp.model.entity.Weather;

/**
 * Created by Apollo on 2017/2/20.
 */

public interface WeatherView {
    void showLoading();

    void hideLoading();

    void showError();

    void setWeatherInfo(Weather weather);
}
