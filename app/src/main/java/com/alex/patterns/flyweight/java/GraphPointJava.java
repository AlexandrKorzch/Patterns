package com.alex.patterns.flyweight.java;

import android.graphics.Paint;
import android.graphics.Point;

class GraphPointJava extends Point {

    private Paint mPaint;

    GraphPointJava(int x, int y, Paint paint) {
        super(x, y);
        mPaint = paint;
    }

    Paint getPaint() {
        return mPaint;
    }
}