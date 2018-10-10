package com.alex.patterns.facade.kotlin

import android.content.Context
import android.widget.Toast

class MemoryKotlin {

    fun load(context: Context, position : String, data : String) {
        Toast.makeText(context, "MemoryKotlin: load: position-$position, data-$data ", Toast.LENGTH_SHORT).show()
    }
}