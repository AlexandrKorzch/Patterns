package com.alex.patterns.proxy.java;

import android.content.Context;
import android.widget.Toast;

public class MathProxyJava implements IMathJava {

    private MathJava math;

    public int add(int x, int y, Context context) {
        if(math == null) {
            math = new MathJava();
        }
        toast(context, "+");
        return math.add(x, y, context);
    }

    public int sub(int x, int y, Context context) {
        if(math == null) {
            math = new MathJava();
        }
        toast(context, "-");
        return math.sub(x, y,context);
    }

    public int mul(int x, int y, Context context) {
        if(math == null) {
            math = new MathJava();
        }
        toast(context, "*");
        return math.mul(x, y, context);
    }

    public int div(int x, int y, Context context) {
        if(math == null) {
            math = new MathJava();
        }
        toast(context, "/");
        return math.div(x, y, context);
    }

    private void toast(Context context, String action){
        Toast.makeText(context, "Proxy "+action, Toast.LENGTH_SHORT).show();
    }
}
