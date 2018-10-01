package com.alex.patterns.strategy.kotlin

class FirstAlgorithmKotlin : AlgorithmKotlin {

    private val key = "q"

    override fun crypt(text: String): String {
        var returnText = ""
        text.forEach { returnText = returnText.plus(it.plus(key)) }
        return returnText
    }
}