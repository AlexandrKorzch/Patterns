package com.alex.patterns.mediator.kotlin

import android.widget.TextView

class FourthButtonKotlin(override val button: TextView,
                         override val mediator: MediatorKotlin) : ButtonKotlin {

    init {
        initClick(button)
    }
}