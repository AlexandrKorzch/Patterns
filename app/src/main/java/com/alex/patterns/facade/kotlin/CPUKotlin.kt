package com.alex.patterns.facade.kotlin

import android.content.Context
import android.widget.Toast

class CPUKotlin {

    fun freeze(context: Context) {
        Toast.makeText(context, "CPUKotlin: freeze", Toast.LENGTH_SHORT).show()
    }

    fun jump(context: Context, position : String) {
        Toast.makeText(context, "CPUKotlin: jump to $position", Toast.LENGTH_SHORT).show()
    }

    fun execute(context: Context) {
        Toast.makeText(context, "CPUKotlin: execute", Toast.LENGTH_SHORT).show()
    }
}