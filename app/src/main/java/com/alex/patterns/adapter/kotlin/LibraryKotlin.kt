package com.alex.patterns.adapter.kotlin

import android.content.Context
import android.widget.Toast
import android.widget.Toast.LENGTH_SHORT

class LibraryKotlin {

    fun makeToastHello(context : Context) = Toast.makeText(context, "Hello", LENGTH_SHORT).show()

    fun makeToastBuy(context : Context) = Toast.makeText(context, "Buy", LENGTH_SHORT).show()
}