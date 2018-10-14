package com.alex.patterns.proxy.java;

import android.content.Context;

public interface IMathJava {
    int add(int x, int y, Context context);
    int sub(int x, int y, Context context);
    int mul(int x, int y, Context context);
    int div(int x, int y, Context context);
}
