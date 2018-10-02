package com.alex.patterns.mediator.kotlin

import android.view.View
import android.widget.TextView

interface ButtonKotlin {
    val button : TextView
    val mediator : MediatorKotlin

    fun initClick(button : View){
        button.setOnClickListener { send("->") }
    }

    fun send(message : String){
        mediator.send(message, this)
    }

    fun onGetMessage(message: String){
        button.text = message
    }
}