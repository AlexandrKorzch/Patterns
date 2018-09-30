package com.alex.patterns.state

import android.view.View
import com.alex.patterns.BaseActivity
import com.alex.patterns.Language
import com.alex.patterns.R
import com.alex.patterns.state.java.PlayerJava
import com.alex.patterns.state.kotlin.PlayerKotlin
import kotlinx.android.synthetic.main.activity_state.*

class StateActivity : BaseActivity() {

    override fun toolbarTitle() = R.string.state
    override fun layoutId() = R.layout.activity_state
    override fun isBackButton() = true

    private lateinit var playerKotlin: PlayerKotlin
    private lateinit var playerJava: PlayerJava

    override fun onCreate() {
        setClickListener(ivPlay, ivStop, ivPause)
        playerKotlin = PlayerKotlin(tvState)
        playerJava = PlayerJava(tvState)
    }

    override fun onClick(v: View) {
        super.onClick(v)
        when (v.id) {
            R.id.ivPlay -> when (language) {
                Language.KOTLIN -> playerKotlin.state.onPlay()
                Language.JAVA -> playerJava.state.onPlay()
            }
            R.id.ivStop -> when (language) {
                Language.KOTLIN -> playerKotlin.state.onStop()
                Language.JAVA -> playerJava.state.onStop()
            }
            R.id.ivPause -> when (language) {
                Language.KOTLIN -> playerKotlin.state.onPause()
                Language.JAVA -> playerJava.state.onPause()
            }
        }
    }
}