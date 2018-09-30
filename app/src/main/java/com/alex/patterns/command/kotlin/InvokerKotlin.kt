package com.alex.patterns.command.kotlin

class InvokerKotlin(private val receiver: ReceiverKotlin) {

    private val list = mutableListOf<CommandKotlin>()

    fun invokeOne() = CommandOneKotlin(receiver).action().add()

    fun invokeTwo() = CommandTwoKotlin(receiver).action().add()

    fun invokeThree() = CommandThreeKotlin(receiver).action().add()

    fun invokeFour() = CommandFourKotlin(receiver).action().add()

    fun undo() {
        list.removeLast()
        takeIf { list.isNotEmpty() }
                ?.apply { list.last().action() }
    }

    private fun CommandKotlin.action(): CommandKotlin {
        execute()
        return this
    }

    private fun CommandKotlin.add() {
        list.add(this)
    }

    private fun <E> MutableList<E>.removeLast() {
        takeIf { this.isNotEmpty() }
                ?.apply { this.remove(this.last()) }
    }
}