package com.alex.patterns.flyweight.kotlin

import android.content.Context
import android.graphics.Canvas
import android.util.AttributeSet
import android.view.View
import java.util.*

class ViewKotlin(context: Context?, attrs: AttributeSet?) : View(context, attrs) {

    private val paintFactory = PaintFactoryKotlin()
    private val points = mutableListOf<GraphPointKotlin>()
    private val random = Random()

    override fun onLayout(changed: Boolean, left: Int, top: Int, right: Int, bottom: Int) {
        super.onLayout(changed, left, top, right, bottom)
        initPoints()
    }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        points.forEach {
            canvas.drawPoint(it.x.toFloat(), it.y.toFloat(), it.paint)
        }

        postDelayed({
            initPoints()
            invalidate()
        }, 300)
    }

    private fun initPoints() {
        takeIf { points.isEmpty() }
                ?.apply {
                    for (i in 0..999) {
                        points.add(createNewPoint())
                    }
                }
                ?: apply {
                    points.forEach {
                        it.x = random.nextInt(width)
                        it.y = random.nextInt(height)
                    }
                }
    }

    private fun createNewPoint(): GraphPointKotlin {
        return GraphPointKotlin(
                random.nextInt(width),
                random.nextInt(height),
                paintFactory.getPaint())
    }
}