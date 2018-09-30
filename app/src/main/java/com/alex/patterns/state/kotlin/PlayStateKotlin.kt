package com.alex.patterns.state.kotlin

class PlayStateKotlin(override val player: PlayerKotlin) : StateKotlin {

    init {
        onPlay()
    }

    override fun onPlay() {
        player.play()
    }

    override fun onStop() {
        player.changeState(StopStateKotlin(player))
    }

    override fun onPause() {
        player.changeState(PauseStateKotlin(player))
    }
}