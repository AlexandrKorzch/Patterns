package com.alex.patterns.state.java;

import android.widget.TextView;

public class PlayerJava {

    private StateJava mState;
    private TextView tvState;

    public PlayerJava(TextView tvState) {
        this.tvState = tvState;
        mState = new StopStateJava(this);
    }

    public void play(){
        tvState.setText("PlayJava");
    }

    public void pause(){
        tvState.setText("PauseJava");
    }

    public void stop(){
        tvState.setText("StopJava");
    }

    public void changeState(StateJava state) {
        mState = state;
    }

    public StateJava getState() {
        return mState;
    }
}