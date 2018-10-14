package com.alex.patterns.proxy.java;

import android.content.Context;
import android.widget.Toast;

public class MathJava implements IMathJava {

    @Override
    public int add(int x, int y, Context context) {
        toast(context, x + y + "");
        return x + y;
    }

    @Override
    public int sub(int x, int y, Context context) {
        toast(context, x - y + "");
        return x - y;
    }

    @Override
    public int mul(int x, int y, Context context) {
        toast(context, x * y + "");
        return x * y;
    }

    @Override
    public int div(int x, int y, Context context) {
        toast(context, x / y + "");
        return x / y;
    }

    private void toast(Context context, String result) {
        Toast.makeText(context, "Math " + result, Toast.LENGTH_SHORT).show();
    }
}
