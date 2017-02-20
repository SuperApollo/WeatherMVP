package com.apollo.weathermvp.ui.activity;

import android.support.v7.app.ActionBarActivity;
import android.view.View;

/**
 * Created by Apollo on 2017/2/20.
 */

public class BaseActivity extends ActionBarActivity {
    protected  <T extends View> T findView(int id) {
        return (T) findViewById(id);
    }
}
