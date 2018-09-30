package com.alex.patterns.command.java;

import com.alex.patterns.R;


public class CommandFourJava extends CommandJava {

    public CommandFourJava(ReceiverJava receiver) {
        super(receiver);
    }

    @Override
    void execute() {
        receiver.radioGroup.check(R.id.rbFour_);
    }
}