package com.alex.patterns.state.kotlin

interface StateKotlin {

    val player: PlayerKotlin

    fun onPlay()
    fun onStop()
    fun onPause()
}