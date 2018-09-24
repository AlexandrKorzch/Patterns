package com.alex.patterns

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import com.alex.patterns.memento.MementoActivityOriginator

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<View>(R.id.btMomento).setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.btMomento -> startActivity(Intent(this, MementoActivityOriginator::class.java))
        }
    }
}

