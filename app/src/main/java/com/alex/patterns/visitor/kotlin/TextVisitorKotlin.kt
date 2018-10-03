package com.alex.patterns.visitor.kotlin

class TextVisitorKotlin : VisitorKotlin {

    override fun visit(button: ButtonKotlin) {
        button.button.text = "Visited"
    }
}