package com.alex.patterns.mediator.kotlin

import android.widget.TextView

class FirstButtonKotlin(override val button: TextView,
                        override val mediator: MediatorKotlin) : ButtonKotlin {

    init {
        initClick(button)
    }
}