package com.alex.patterns.command.kotlin

interface CommandKotlin {
    val receiver: ReceiverKotlin
    fun execute()
}