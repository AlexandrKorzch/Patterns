package com.alex.patterns.visitor.kotlin

import android.widget.TextView

class ButtonImplKotlin(override val button: TextView) : ButtonKotlin {

    override fun accept(visitor: VisitorKotlin) {
        visitor.visit(this)
    }
}