package com.alex.patterns.composite.java;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;

public abstract class ComponentJava {

    public TextView tvName ;
    Context context;
    String name ;
    int count;

    public ComponentJava(int count, String name, Context context) {
        this.tvName = new TextView(context);
        this.context = context;
        this.count = count;
        this.name = name;
    }

    abstract Drawable getBackground();
    abstract View getMainView();
    abstract int getSum();
}