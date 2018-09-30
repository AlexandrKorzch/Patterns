package com.alex.patterns.bridge.java;

import android.widget.TextView;

public abstract class TextJava {

    WriterJava writer;

    abstract public void writeText(String message, TextView textView);
}