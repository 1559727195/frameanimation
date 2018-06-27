package com.massky.frameanimation;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by zhu on 2018/6/26.
 */

public class TweenActivity extends AppCompatActivity {
    private View mBicycleView;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBicycleView = new BicycleView(this);
        setContentView(mBicycleView);
    }

}
