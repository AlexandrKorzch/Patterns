package com.alex.patterns.command.kotlin

import com.alex.patterns.R


class CommandThreeKotlin(override val receiver: ReceiverKotlin) : CommandKotlin {
    override fun execute() {
        receiver.radioGroup.check(R.id.rbThree_)
    }
}