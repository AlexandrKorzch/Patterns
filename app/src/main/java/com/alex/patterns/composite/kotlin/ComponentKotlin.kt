package com.alex.patterns.composite.kotlin

import android.graphics.drawable.Drawable
import android.view.View
import android.widget.TextView

interface ComponentKotlin {

    val count: Int
    val tvName : TextView

    fun getBackground() : Drawable
    fun getMainView() : View
    fun getSum() : Int
}