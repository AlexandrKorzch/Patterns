package com.alex.patterns.facade.java;

import android.content.Context;
import android.widget.Toast;

class MemoryJava {

    void load(Context context, String position, String data) {
        Toast.makeText(context, "MemoryJava: load: position-"+position+", data-"+data, Toast.LENGTH_SHORT).show();
    }
}
