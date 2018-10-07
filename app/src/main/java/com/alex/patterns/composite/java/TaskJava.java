package com.alex.patterns.composite.java;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;

import com.alex.patterns.R;

public class TaskJava extends ComponentJava {

    public TaskJava(int count, String name, Context context) {
        super(count, name, context);
        tvName.setText(name);
    }

    @Override
    Drawable getBackground() {
        return context.getDrawable(R.drawable.background_task);
    }

    @Override
    View getMainView() {
        return tvName;
    }

    @Override
    int getSum() {
        return count;
    }
}