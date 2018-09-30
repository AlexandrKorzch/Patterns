package com.alex.patterns.bridge.kotlin

import android.widget.TextView

interface WriterKotlin {
    fun write(text: String, textView: TextView)
}