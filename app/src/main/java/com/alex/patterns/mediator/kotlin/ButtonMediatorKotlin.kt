package com.alex.patterns.mediator.kotlin

class ButtonMediatorKotlin : MediatorKotlin {

    var firstButton : ButtonKotlin? = null
    var secondButton : ButtonKotlin? = null
    var thirdButton : ButtonKotlin? = null
    var fourthButton : ButtonKotlin? = null

    override fun send(message: String, sender: ButtonKotlin) {
        when (sender) {
            firstButton -> secondButton?.onGetMessage(message)
            secondButton -> thirdButton?.onGetMessage(message)
            thirdButton -> fourthButton?.onGetMessage(message)
        }
    }
}