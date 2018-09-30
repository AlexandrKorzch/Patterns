package com.alex.patterns.state.java;

public class PauseStateJava extends StateJava {

    PauseStateJava(PlayerJava player) {
        super(player);
        onPause();
    }

    @Override
    public void onPlay() {
        mPlayer.changeState(new PlayStateJava(mPlayer));
    }

    @Override
    public void onStop() {
        mPlayer.changeState(new StopStateJava(mPlayer));
    }

    @Override
    public void onPause() {
        mPlayer.pause();
    }
}