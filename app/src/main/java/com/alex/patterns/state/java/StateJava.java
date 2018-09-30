package com.alex.patterns.state.java;

public abstract class StateJava {

    PlayerJava mPlayer;

    StateJava(PlayerJava player) {
        mPlayer = player;
    }

    public abstract void onPlay();

    public abstract void onStop();

    public abstract void onPause();
}