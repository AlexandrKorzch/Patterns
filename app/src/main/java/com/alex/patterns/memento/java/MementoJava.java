package com.alex.patterns.memento.java;

public class MementoJava {

    private String mState;

    public MementoJava(String state) {
        mState = state;
    }

    public String getState() {
        return mState;
    }

    public void setState(String state) {
        mState = state;
    }
}
