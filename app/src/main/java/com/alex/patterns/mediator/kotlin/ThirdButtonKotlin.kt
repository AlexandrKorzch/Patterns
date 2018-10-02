package com.alex.patterns.mediator.kotlin

import android.widget.TextView

class ThirdButtonKotlin(override val button: TextView,
                        override val mediator: MediatorKotlin) : ButtonKotlin {

    init {
        initClick(button)
    }
}