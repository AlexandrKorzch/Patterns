package com.alex.patterns.flyweight.java;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class ViewJava extends View {

    private PaintFactoryJava mPaintFactory = new PaintFactoryJava();
    private List<GraphPointJava> mPoints = new ArrayList<>();
    private Random mRandom = new Random();

    public ViewJava(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        initPoints();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        for (GraphPointJava point : mPoints) {
            canvas.drawPoint(point.x, point.y, point.getPaint());
        }

        postDelayed(new Runnable() {
            @Override
            public void run() {
                initPoints();
                invalidate();
            }
        },300);
    }

    private void initPoints() {
        if(mPoints.isEmpty()){
            for (int i = 0; i < 1000; i++) {
                mPoints.add(createNewPoint());
            }
        }else{
            for(Point point: mPoints){
                point.x = mRandom.nextInt(getWidth());
                point.y = mRandom.nextInt(getHeight());
            }
        }
    }

    private GraphPointJava createNewPoint() {
        return new GraphPointJava(
                mRandom.nextInt(getWidth()),
                mRandom.nextInt(getHeight()),
                mPaintFactory.getPaint());
    }
}