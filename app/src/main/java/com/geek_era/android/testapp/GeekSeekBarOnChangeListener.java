package com.geek_era.android.testapp;

import android.view.View;

/**
 * GeekSeekbar的监听方法接口
 * Created by Ray on 2017/8/25.
 * Website: http://www.geek-era.com
 * Email:nuoone@163.com
 */

public interface GeekSeekBarOnChangeListener {
    void onProgressChanged(View view, int progress, boolean fromUser);
    void onStartTrackingTouch(View view);
    void onStopTrackingTouch(View view);
}