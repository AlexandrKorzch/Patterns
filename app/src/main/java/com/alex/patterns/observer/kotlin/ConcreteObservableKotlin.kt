package com.alex.patterns.observer.kotlin

class ConcreteObservableKotlin : ObservableKotlin{

    private val observers = mutableListOf<ObserverKotlin>()

    override fun addOrRemoveObservable(observer: ObserverKotlin) {
        takeIf { observers.contains(observer) }
                ?.apply { observers.remove(observer) }
                ?: apply { observers.add(observer) }
    }

    override fun notifyObservers(message: String) {
        observers.forEach { it.handleEvent(message) }
    }
}