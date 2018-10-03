package com.alex.patterns.visitor.kotlin

import android.widget.TextView

interface ButtonKotlin {
    val button : TextView
    fun accept(visitorKotlin : VisitorKotlin)
}