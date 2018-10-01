package com.alex.patterns.strategy.kotlin

class ThirdAlgorithmKotlin : AlgorithmKotlin {

    private val key = "gj"

    override fun crypt(text: String): String {
        var returnText = ""
        text.forEach { returnText = returnText.plus(it.plus(key)) }
        return returnText
    }
}