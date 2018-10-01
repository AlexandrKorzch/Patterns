package com.alex.patterns.strategy.kotlin

class SecondAlgorithmKotlin : AlgorithmKotlin {

    private val key = "f"

    override fun crypt(text: String): String {
        var returnText = ""
        text.forEach { returnText = returnText.plus(it.plus(key)) }
        return returnText
    }
}