package com.massky.frameanimation;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;

/**
 * Created by zhu on 2018/6/26.
 */

public class BicycleView extends View {

    private Animation mAnimationAlpha = null;

    private Animation mAnimationScale = null;

    private Animation mAnimationTranslate = null;

    private Animation mAnimationRotate = null;

    private AnimationSet as = null;

    Bitmap mBicycle = null;


    public BicycleView(Context context) {
        super(context);
        mBicycle = ((BitmapDrawable) getResources().getDrawable(
                R.drawable.ic_launcher_background
        )).getBitmap();
        //

    }

    public BicycleView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public BicycleView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
}
