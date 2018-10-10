package com.alex.patterns.facade.java;

import android.content.Context;
import android.widget.Toast;

class CPUJava {

    void freeze(Context context) {
        Toast.makeText(context, "CPUJava: freeze", Toast.LENGTH_SHORT).show();
    }
    void jump(Context context, String position) {
        Toast.makeText(context, "CPUJava: jump to " + position, Toast.LENGTH_SHORT).show();

    }
    public void execute(Context context) {
        Toast.makeText(context, "CPUJava: execute", Toast.LENGTH_SHORT).show();
    }
}
