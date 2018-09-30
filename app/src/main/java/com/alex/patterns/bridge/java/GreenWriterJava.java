package com.alex.patterns.bridge.java;

import android.graphics.Color;
import android.widget.TextView;

public class GreenWriterJava implements WriterJava {

    @Override
    public void write(String text, TextView textView) {
        textView.setText(text);
        textView.setTextColor(Color.GREEN);
    }
}