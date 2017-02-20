package com.apollo.weathermvp.presenter;

import com.apollo.weathermvp.model.entity.Weather;

/**
 * Created by Apollo on 2017/2/20.
 */

public interface OnWeatherListener {
    /**
     * 成功时回调
     *
     * @param weather
     */
    void onSuccess(Weather weather);
    /**
     * 失败时回调，简单处理，没做什么
     */
    void onError();
}
