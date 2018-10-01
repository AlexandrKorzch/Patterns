package com.alex.patterns.strategy.kotlin

class EncryptionKotlin {

    var algorithm: AlgorithmKotlin = FirstAlgorithmKotlin()

    fun crypt(text : String) = algorithm.crypt(text)

}