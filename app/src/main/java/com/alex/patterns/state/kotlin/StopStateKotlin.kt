package com.alex.patterns.state.kotlin

class StopStateKotlin(override val player: PlayerKotlin) : StateKotlin{

    init {
        onStop()
    }

    override fun onPlay() {
        player.changeState(PlayStateKotlin(player))
    }

    override fun onStop() {
        player.stop()
    }

    override fun onPause() {
        player.changeState(PauseStateKotlin(player))
    }
}