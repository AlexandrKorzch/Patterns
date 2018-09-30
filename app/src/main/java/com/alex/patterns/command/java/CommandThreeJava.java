package com.alex.patterns.command.java;

import com.alex.patterns.R;

public class CommandThreeJava extends CommandJava {

    public CommandThreeJava(ReceiverJava receiver) {
        super(receiver);
    }

    @Override
    void execute() {
        receiver.radioGroup.check(R.id.rbThree_);
    }
}