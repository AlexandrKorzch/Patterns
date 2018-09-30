package com.alex.patterns.state.kotlin

import android.widget.TextView

class PlayerKotlin(private val tvState: TextView) {

    var state : StateKotlin

    init {
        state = StopStateKotlin(this)
    }

    fun play(){
        tvState.text = "PlayKotlin"
    }

    fun pause(){
        tvState.text = "PauseKotlin"
    }

    fun stop(){
        tvState.text = "StopKotlin"
    }

    fun changeState(state: StateKotlin) {
        this.state = state
    }
}