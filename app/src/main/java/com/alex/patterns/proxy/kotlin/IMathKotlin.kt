package com.alex.patterns.proxy.kotlin

import android.content.Context

interface IMathKotlin {
    fun add(x: Int, y: Int, context: Context): Int
    fun sub(x: Int, y: Int, context: Context): Int
    fun mul(x: Int, y: Int, context: Context): Int
    fun div(x: Int, y: Int, context: Context): Int
}