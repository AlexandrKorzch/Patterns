package com.alex.patterns.proxy.kotlin

import android.content.Context
import android.widget.Toast

class MathKotlin : IMathKotlin {

    override fun add(x: Int, y: Int, context: Context): Int {
        toast(context, (x + y).toString() + "")
        return x + y
    }

    override fun sub(x: Int, y: Int, context: Context): Int {
        toast(context, (x - y).toString() + "")
        return x - y
    }

    override fun mul(x: Int, y: Int, context: Context): Int {
        toast(context, (x * y).toString() + "")
        return x * y
    }

    override fun div(x: Int, y: Int, context: Context): Int {
        toast(context, (x / y).toString() + "")
        return x / y
    }

    private fun toast(context: Context, result: String) {
        Toast.makeText(context, "Math $result", Toast.LENGTH_SHORT).show()
    }
}