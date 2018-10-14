package com.alex.patterns.flyweight.kotlin

import android.graphics.Color
import android.graphics.Paint
import java.util.*

class PaintFactoryKotlin {

    private var firstPaint = Paint()
    private var secondPaint = Paint()
    private var thirdPaint = Paint()

    private val mRandom = Random()

    init {
        with(firstPaint) {
            color = Color.MAGENTA
            style = Paint.Style.FILL
            strokeWidth = 5f
        }
        with(secondPaint) {
            color = Color.WHITE
            style = Paint.Style.FILL
            strokeWidth = 10f
        }
        with(thirdPaint) {
            color = Color.YELLOW
            style = Paint.Style.FILL
            strokeWidth = 15f
        }
    }

    fun getPaint(): Paint =
            when (mRandom.nextInt(3)) {
                0 -> firstPaint
                1 -> secondPaint
                else -> thirdPaint
            }
}