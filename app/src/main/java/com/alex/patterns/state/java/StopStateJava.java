package com.alex.patterns.state.java;

public class StopStateJava extends StateJava {

    StopStateJava(PlayerJava player) {
        super(player);
        onStop();
    }

    @Override
    public void onPlay() {
        mPlayer.changeState(new PlayStateJava(mPlayer));
    }

    @Override
    public void onStop() {
        mPlayer.stop();
    }

    @Override
    public void onPause() {
        mPlayer.changeState(new PauseStateJava(mPlayer));
    }
}