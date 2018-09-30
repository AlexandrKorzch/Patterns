package com.alex.patterns.state.kotlin

class PauseStateKotlin(override val player: PlayerKotlin) : StateKotlin {

    init {
        onPause()
    }

    override fun onPlay() {
        player.changeState(PlayStateKotlin(player))
    }

    override fun onStop() {
        player.changeState(StopStateKotlin(player))
    }

    override fun onPause() {
        player.pause()
    }
}