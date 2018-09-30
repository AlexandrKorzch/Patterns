package com.alex.patterns

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import com.alex.patterns.adapter.AdapterActivity
import com.alex.patterns.bridge.BridgeActivity
import com.alex.patterns.command.CommandActivity
import com.alex.patterns.memento.MementoActivityOriginator
import com.alex.patterns.observer.ObserverActivity
import com.alex.patterns.state.StateActivity

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<View>(R.id.btState).setOnClickListener(this)
        findViewById<View>(R.id.btCommand).setOnClickListener(this)
        findViewById<View>(R.id.btObserver).setOnClickListener(this)
        findViewById<View>(R.id.btBridge).setOnClickListener(this)
        findViewById<View>(R.id.btMomento).setOnClickListener(this)
        findViewById<View>(R.id.btAdapter).setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.btState -> open(StateActivity::class.java)
            R.id.btCommand -> open(CommandActivity::class.java)
            R.id.btObserver -> open(ObserverActivity::class.java)
            R.id.btBridge -> open(BridgeActivity::class.java)
            R.id.btMomento -> open(MementoActivityOriginator::class.java)
            R.id.btAdapter -> open(AdapterActivity::class.java)
        }
    }

    private fun open(clazz: Class<out Activity>) {
        startActivity(Intent(this, clazz))
    }
}

