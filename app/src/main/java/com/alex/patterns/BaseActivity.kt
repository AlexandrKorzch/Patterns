package com.alex.patterns

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.MenuItem
import android.view.View
import android.widget.RadioGroup
import android.widget.Toast

abstract class BaseActivity : AppCompatActivity(), View.OnClickListener {

    abstract fun onCreate()
    abstract fun layoutId(): Int
    abstract fun toolbarTitle(): Int
    abstract fun isBackButton(): Boolean

    abstract fun performInJava()
    abstract fun performInKotlin()

    private var language : Language? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layoutId())
        supportActionBar?.title = getString(toolbarTitle())
        if (isBackButton()) supportActionBar?.setDisplayHomeAsUpEnabled(true)
        initRadioGroup()
        onCreate()
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            android.R.id.home -> onBackPressed()
        }
        return super.onOptionsItemSelected(item)
    }

    protected fun setClickListener(vararg views: View) {
        views.forEach { it.setOnClickListener(this) }
    }

    protected fun performAction(){
        when(language){
            Language.KOTLIN -> performInKotlin()
            Language.JAVA -> performInJava()
            else -> Toast.makeText(this, getString(R.string.check_language), Toast.LENGTH_LONG).show()
        }
    }

    private fun initRadioGroup(){
        findViewById<RadioGroup>(R.id.rgLanguage)?.setOnCheckedChangeListener { _, checkedId ->
            when(checkedId){
                R.id.rbJava -> language = Language.JAVA
                R.id.rbKotlin -> language = Language.KOTLIN
            }
        }
    }

    override fun onClick(v: View) {
    }
}

enum class Language{
    KOTLIN,
    JAVA
}