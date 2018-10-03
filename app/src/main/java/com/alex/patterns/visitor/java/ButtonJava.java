package com.alex.patterns.visitor.java;

import android.widget.TextView;

public abstract class ButtonJava {
    private TextView mButton;

    public ButtonJava(TextView button) {
        mButton = button;
    }

    public TextView getButton() {
        return mButton;
    }

    public void accept(VisitorJava visitor) {
        visitor.visit(this);
    }
}