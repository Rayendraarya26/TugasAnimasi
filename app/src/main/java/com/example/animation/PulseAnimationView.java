package com.example.animation;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;

import androidx.annotation.Nullable;
import androidx.interpolator.view.animation.LinearOutSlowInInterpolator;

public class PulseAnimationView extends View {
    
    private float mRadius;
    private final Paint mPaint = new Paint();
    private static final int COLOR_ADJUSTER = 5;
    private float mX, mY;
    private static final int ANIMATION_DURATION = 4000;
    private static final long ANIMATION_DELAY = 1000;

    private AnimatorSet mPulseAnimatorSet = new AnimatorSet();

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);

        // growing dari kecil ke besar
        ObjectAnimator growAnimator = ObjectAnimator.ofFloat(this, "radius", 0, getWidth());
        growAnimator.setDuration(ANIMATION_DURATION);
        growAnimator.setInterpolator(new LinearInterpolator());

        // growing dari besar ke kecil
        ObjectAnimator shrinkAnimator = ObjectAnimator.ofFloat(this, "radius", getWidth(), 0);
        shrinkAnimator.setDuration(ANIMATION_DURATION);
        shrinkAnimator.setInterpolator(new LinearOutSlowInInterpolator());
        shrinkAnimator.setStartDelay(ANIMATION_DELAY);

        // repeat animation dari kecil ke besar
        ObjectAnimator repeatAnimator = ObjectAnimator.ofFloat(this, "radius", 0, getWidth());
        repeatAnimator.setStartDelay(ANIMATION_DELAY);
        repeatAnimator.setDuration(ANIMATION_DURATION);
        repeatAnimator.setRepeatCount(4);
        repeatAnimator.setRepeatMode(ObjectAnimator.RESTART);

//        mPulseAnimatorSet.play(growAnimator).before(shrinkAnimator);
//        mPulseAnimatorSet.play(repeatAnimator).after(shrinkAnimator);
        mPulseAnimatorSet.play(repeatAnimator);

        super.onSizeChanged(w, h, oldw, oldh);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawCircle(mX, mY, mRadius, mPaint);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        if (event.getActionMasked() == MotionEvent.ACTION_DOWN){
            mX = event.getX();
            mY = event.getY();

            if (mPulseAnimatorSet != null && mPulseAnimatorSet.isRunning()){
                mPulseAnimatorSet.cancel();
            }
            mPulseAnimatorSet.start();
        }
        return super.onTouchEvent(event);
    }

    public void setRadius(float radius){
        mRadius = radius;
        mPaint.setColor(Color.GREEN + (int) radius/COLOR_ADJUSTER);
        invalidate();
    }

    public PulseAnimationView(Context context) {
        super(context);
    }

    public PulseAnimationView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }
}
