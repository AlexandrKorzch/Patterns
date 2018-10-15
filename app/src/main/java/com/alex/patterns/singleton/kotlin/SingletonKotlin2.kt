package com.alex.patterns.singleton.kotlin

import com.alex.patterns.singleton.java.SingletonJava

class SingletonKotlin2 {

    private object Holder { val INSTANCE = SingletonKotlin2() }

    companion object {
        val instance: SingletonKotlin2 by lazy { Holder.INSTANCE }
    }


    /*Double Checked Locking & volatile*/
    @Volatile
    private var instanceDoubleCheck: SingletonKotlin2? = null

    fun getInstanceDoubleCheck(): SingletonKotlin2? {
        var localInstance = instanceDoubleCheck
        if (localInstance == null) {
            synchronized(SingletonKotlin2::class.java) {
                localInstance = instanceDoubleCheck
                if (localInstance == null) {
                    localInstance = SingletonKotlin2()
                    instanceDoubleCheck = localInstance
                }
            }
        }
        return localInstance
    }


    /*Synchronized Accessor*/
    private var instance: SingletonKotlin2? = null

    @Synchronized
    fun getInstance(): SingletonKotlin2? {
        if (instance == null) {
            instance = SingletonKotlin2()
        }
        return instance
    }
}