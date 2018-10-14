package com.alex.patterns.proxy.kotlin

import android.content.Context
import android.widget.Toast

class MathProxyKotlin : IMathKotlin {

    private val math by lazy { MathKotlin() }

    override fun add(x: Int, y: Int, context: Context): Int {
        toast(context, "+")
        return math.add(x, y, context)
    }

    override fun sub(x: Int, y: Int, context: Context): Int {
        toast(context, "-")
        return math.sub(x, y, context)
    }

    override fun mul(x: Int, y: Int, context: Context): Int {
        toast(context, "*")
        return math.mul(x, y, context)
    }

    override fun div(x: Int, y: Int, context: Context): Int {
        toast(context, "/")
        return math.div(x, y, context)
    }

    private fun toast(context: Context, action: String) {
        Toast.makeText(context, "Proxy $action", Toast.LENGTH_SHORT).show()
    }
}