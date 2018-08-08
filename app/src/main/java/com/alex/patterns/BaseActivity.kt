package com.alex.patterns

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.MenuItem
import android.view.View

abstract class BaseActivity : AppCompatActivity(), View.OnClickListener {

    abstract fun onCreate()
    abstract fun layoutId(): Int
    abstract fun toolbarTitle(): Int
    abstract fun isBackButton(): Boolean

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layoutId())
        supportActionBar?.title = getString(toolbarTitle())
        if (isBackButton()) supportActionBar?.setDisplayHomeAsUpEnabled(true)
        onCreate()
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            android.R.id.home -> onBackPressed()
        }
        return super.onOptionsItemSelected(item)
    }

    protected fun open(clazz: Class<out AppCompatActivity>) {
        startActivity(Intent(this, clazz))
    }

    protected fun setClickListener(vararg views: View) {
        views.forEach { it.setOnClickListener(this) }
    }

    override fun onClick(v: View) {
        when (v.id) {
//            R.id.btMomento -> open(MomentoActivity::class.java)
        }
    }
}