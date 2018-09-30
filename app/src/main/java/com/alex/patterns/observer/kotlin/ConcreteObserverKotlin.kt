package com.alex.patterns.observer.kotlin

class ConcreteObserverKotlin(val function: (message: String) -> Unit) : ObserverKotlin {

    override fun handleEvent(message: String) {
        function(message)
    }
}