package com.apollo.weathermvp.presenter.impl;

import com.apollo.weathermvp.model.WeatherModel;
import com.apollo.weathermvp.model.entity.Weather;
import com.apollo.weathermvp.model.impl.WeatherModelImpl;
import com.apollo.weathermvp.presenter.OnWeatherListener;
import com.apollo.weathermvp.presenter.WeatherPresenter;
import com.apollo.weathermvp.view.WeatherView;

/**
 * presenter实现
 * Created by Apollo on 2017/2/20.
 */

public class WeatherPresenterImpl implements WeatherPresenter,OnWeatherListener {
    /*Presenter作为中间层，持有View和Model的引用*/
    private WeatherView weatherView;
    private WeatherModel weatherModel;

    public WeatherPresenterImpl(WeatherView weatherView) {
        this.weatherView = weatherView;
        weatherModel = new WeatherModelImpl();
    }

    @Override
    public void getWeather(String cityNO) {
        weatherView.showLoading();
        weatherModel.loadWeather(cityNO, this);
    }

    @Override
    public void onSuccess(Weather weather) {
        weatherView.hideLoading();
        weatherView.setWeatherInfo(weather);
    }

    @Override
    public void onError() {
        weatherView.hideLoading();
        weatherView.showError();
    }
}
