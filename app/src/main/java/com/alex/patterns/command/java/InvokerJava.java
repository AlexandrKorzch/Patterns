package com.alex.patterns.command.java;

import java.util.ArrayList;
import java.util.List;

public class InvokerJava {

    private ReceiverJava mReceiverJava;
    private List<CommandJava> mCommands = new ArrayList<>();

    public InvokerJava(ReceiverJava receiverJava) {
        mReceiverJava = receiverJava;
    }

    public void invokeOne() {
        add(action(new CommandOneJava(mReceiverJava)));
    }

    public void invokeTwo() {
        add(action(new CommandTwoJava(mReceiverJava)));
    }

    public void invokeThree() {
        add(action(new CommandThreeJava(mReceiverJava)));
    }

    public void invokeFour() {
        add(action(new CommandFourJava(mReceiverJava)));
    }

    public void undo() {
        removeLast();
        if (!mCommands.isEmpty()) {
            action(mCommands.get(mCommands.size() - 1));
        }
    }

    private CommandJava action(CommandJava command) {
        command.execute();
        return command;
    }

    private void add(CommandJava command) {
        mCommands.add(command);
    }

    private void removeLast() {
        if (!mCommands.isEmpty()) {
            mCommands.remove(mCommands.size() - 1);
        }
    }
}