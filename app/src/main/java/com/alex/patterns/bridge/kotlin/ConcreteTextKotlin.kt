package com.alex.patterns.bridge.kotlin

import android.widget.TextView

class ConcreteTextKotlin(override val writer: WriterKotlin) : TextKotlin {

    override fun writeText(message: String, textView: TextView) {
        writer.write(message, textView)
    }
}