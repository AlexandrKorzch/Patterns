package com.alex.patterns.observer.kotlin

interface ObservableKotlin {
    fun addOrRemoveObservable(observer: ObserverKotlin)
    fun notifyObservers(message: String)
}