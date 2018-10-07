package com.alex.patterns.composite.kotlin

import android.content.Context
import android.graphics.drawable.Drawable
import android.view.View
import android.widget.TextView
import com.alex.patterns.R

open class TaskKotlin(val name: String, val context: Context, override val count: Int = 0) : ComponentKotlin {

    final override val tvName: TextView = TextView(context)

    init {
        tvName.text = name
    }

    override fun getMainView(): View = tvName

    override fun getBackground(): Drawable = context.getDrawable(R.drawable.background_task)

    override fun getSum(): Int = count
}