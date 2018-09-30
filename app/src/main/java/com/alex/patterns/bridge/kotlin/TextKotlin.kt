package com.alex.patterns.bridge.kotlin

import android.widget.TextView

interface TextKotlin {

    val writer: WriterKotlin

    fun writeText(message: String, textView: TextView)
}