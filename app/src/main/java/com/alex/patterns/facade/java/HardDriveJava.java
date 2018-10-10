package com.alex.patterns.facade.java;

import android.content.Context;
import android.widget.Toast;

class HardDriveJava {

    String read(Context context, String bootSector, String bootSize) {
        Toast.makeText(context, "HardDriveJava: read - "+bootSector+" "+bootSize, Toast.LENGTH_SHORT).show();
        return "bytes";
    }
}
