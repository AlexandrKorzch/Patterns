package com.alex.patterns.flyweight.java;

import android.graphics.Color;
import android.graphics.Paint;

import java.util.Random;

class PaintFactoryJava {

    private Paint firstPaint;
    private Paint secondPaint;
    private Paint thirdPaint;

    private Random mRandom = new Random();

    PaintFactoryJava() {
        firstPaint = new Paint();
        firstPaint.setColor(Color.BLACK);
        firstPaint.setStyle(Paint.Style.FILL);
        firstPaint.setStrokeWidth(5f);

        secondPaint = new Paint();
        secondPaint.setColor(Color.RED);
        secondPaint.setStyle(Paint.Style.FILL);
        secondPaint.setStrokeWidth(10f);

        thirdPaint = new Paint();
        thirdPaint.setColor(Color.GREEN);
        thirdPaint.setStyle(Paint.Style.FILL);
        thirdPaint.setStrokeWidth(15f);
    }

    Paint getPaint(){
        int rand = mRandom.nextInt(3);
        Paint paint = null;
        if(rand == 0){
            paint = firstPaint;
        }else if(rand == 1){
            paint = secondPaint;
        }else if(rand == 2){
            paint = thirdPaint;
        }
        return paint;
    }
}