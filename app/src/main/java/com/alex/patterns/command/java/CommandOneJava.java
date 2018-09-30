package com.alex.patterns.command.java;

import com.alex.patterns.R;

public class CommandOneJava extends CommandJava {

    public CommandOneJava(ReceiverJava receiver) {
        super(receiver);
    }

    @Override
    void execute() {
        receiver.radioGroup.check(R.id.rbOne_);
    }
}