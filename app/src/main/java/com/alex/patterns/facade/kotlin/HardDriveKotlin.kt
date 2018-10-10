package com.alex.patterns.facade.kotlin

import android.content.Context
import android.widget.Toast

class HardDriveKotlin {

    fun read(context: Context, bootSector : String, bootSize : String): String {
        Toast.makeText(context, "HardDriveKotlin: read - $bootSector $bootSize", Toast.LENGTH_SHORT).show()
        return "bytes"
    }
}