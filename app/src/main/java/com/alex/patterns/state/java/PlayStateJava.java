package com.alex.patterns.state.java;

public class PlayStateJava extends StateJava {

    PlayStateJava(PlayerJava player) {
        super(player);
        onPlay();
    }

    @Override
    public void onPlay() {
        mPlayer.play();
    }

    @Override
    public void onStop() {
        mPlayer.changeState(new StopStateJava(mPlayer));
    }

    @Override
    public void onPause() {
        mPlayer.changeState(new PauseStateJava(mPlayer));
    }
}