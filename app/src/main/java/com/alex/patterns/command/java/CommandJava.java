package com.alex.patterns.command.java;

public abstract class CommandJava {
    protected ReceiverJava receiver;
    abstract void execute();

    public CommandJava(ReceiverJava receiver) {
        this.receiver = receiver;
    }
}