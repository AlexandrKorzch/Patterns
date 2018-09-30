package com.alex.patterns.command.kotlin

import com.alex.patterns.R


class CommandTwoKotlin(override val receiver: ReceiverKotlin) : CommandKotlin {

    override fun execute() {
        receiver.radioGroup.check(R.id.rbTwo_)
    }
}