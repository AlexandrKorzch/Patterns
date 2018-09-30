package com.alex.patterns.bridge.java;

import android.widget.TextView;

public class ConcreteTextJava extends TextJava {

    public ConcreteTextJava(WriterJava writer) {
        this.writer = writer;
    }

    @Override
    public void writeText(String message, TextView textView) {
       writer.write(message, textView);
    }
}