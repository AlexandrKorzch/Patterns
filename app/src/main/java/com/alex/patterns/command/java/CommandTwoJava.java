package com.alex.patterns.command.java;


import com.alex.patterns.R;


public class CommandTwoJava extends CommandJava {

    public CommandTwoJava(ReceiverJava receiver) {
        super(receiver);
    }

    @Override
    void execute() {
        receiver.radioGroup.check(R.id.rbTwo_);
    }
}