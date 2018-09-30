package com.alex.patterns.bridge.kotlin

import android.graphics.Color
import android.widget.TextView

class RedWriterKotlin : WriterKotlin {

    override fun write(text: String, textView: TextView) {
        textView.text = text
        textView.setTextColor(Color.RED)
    }
}