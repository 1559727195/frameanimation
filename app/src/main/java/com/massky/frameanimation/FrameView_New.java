package com.massky.frameanimation;


import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;

/**
 * Created by zhu on 2018/6/26.
 */

public class FrameView_New extends View {

    private Drawable birdItem;
    private Context mContext;
    private AnimationDrawable frameAnamation = null;


    @SuppressLint("ResourceType")
    public FrameView_New(Context context) {
        super(context);
        mContext = context;

        ImageView img = new ImageView(mContext);
        img.setBackgroundResource(R.anim.fram);

        frameAnamation = (AnimationDrawable) img.getBackground();



//
////        frameAnamation = new AnimationDrawable();
//        for (int i = 0; i < 9; i++) {
//            int id = getResources().getIdentifier("bird" + i, "drawable",
//                    mContext.getPackageName());
//            birdItem = getResources().getDrawable(id);
//            frameAnamation.addFrame(birdItem, 300 / i);
//        }
//
//        frameAnamation.setOneShot(false);

        this.setBackgroundDrawable(frameAnamation);
    }

    public FrameView_New(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public FrameView_New(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {

        if (event.getPointerCount() == 1) {
            frameAnamation.start();
        } else if (event.getPointerCount() == 2) {
            frameAnamation.stop();
        }

        return true;
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            frameAnamation.stop();
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }
}
