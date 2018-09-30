package com.alex.patterns

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import com.alex.patterns.adapter.AdapterActivity
import com.alex.patterns.bridge.BridgeActivity
import com.alex.patterns.memento.MementoActivityOriginator

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<View>(R.id.btBridge).setOnClickListener(this)
        findViewById<View>(R.id.btMomento).setOnClickListener(this)
        findViewById<View>(R.id.btAdapter).setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.btBridge -> startActivity(Intent(this, BridgeActivity::class.java))
            R.id.btMomento -> startActivity(Intent(this, MementoActivityOriginator::class.java))
            R.id.btAdapter -> startActivity(Intent(this, AdapterActivity::class.java))
        }
    }
}

