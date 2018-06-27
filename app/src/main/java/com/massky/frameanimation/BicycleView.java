package com.massky.frameanimation;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;

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
                R.drawable.qq
        )).getBitmap();
        //
        mAnimationAlpha = new AlphaAnimation(
                0.1f, 1.0f
        );
        mAnimationAlpha.setDuration(1000 * 4);

        mAnimationScale = new ScaleAnimation(
                0.0f, 1.0f, 0.0f, 1.0f,
                Animation.RELATIVE_TO_SELF, 0.7f,
                Animation.RELATIVE_TO_SELF, 0.7f
        );

        mAnimationScale.setDuration(1000 * 4);

        mAnimationTranslate = new TranslateAnimation(
                5, 200, 4, 150
        );

        mAnimationTranslate.setDuration(1000 * 6);

        mAnimationRotate = new RotateAnimation(
                0.0f, +360.0f,
                Animation.RELATIVE_TO_SELF, 0.3f,
                Animation.RELATIVE_TO_SELF, 0.3f
        );

        mAnimationRotate.setDuration(1000 * 4);

        as = new AnimationSet(true);
        as.addAnimation(mAnimationAlpha);
        as.addAnimation(mAnimationScale);
        as.addAnimation(mAnimationTranslate);
        as.addAnimation(mAnimationRotate);
        as.setDuration(1000 * 4);

    }

    public BicycleView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public BicycleView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawBitmap(mBicycle, 0, 0, null);
    }

    @Override
    public boolean onKeyUp(int keyCode, KeyEvent event) {

        switch (keyCode) {
            case KeyEvent.KEYCODE_DPAD_UP:
                startAnimation(mAnimationScale);
                break;
            case KeyEvent.KEYCODE_DPAD_DOWN:
                startAnimation(mAnimationTranslate);
                break;
            case KeyEvent.KEYCODE_DPAD_LEFT:
                startAnimation(mAnimationAlpha);
                break;
            case KeyEvent.KEYCODE_DPAD_RIGHT:
                startAnimation(mAnimationRotate);
                break;
            case KeyEvent.KEYCODE_DPAD_CENTER:
                startAnimation(as);
                break;

        }

        return true;
    }
}
