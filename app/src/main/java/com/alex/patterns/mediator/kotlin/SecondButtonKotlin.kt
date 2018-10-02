package com.alex.patterns.mediator.kotlin

import android.widget.TextView

class SecondButtonKotlin(override val button: TextView,
                         override val mediator: MediatorKotlin) : ButtonKotlin {

    init {
        initClick(button)
    }
}