package com.alex.patterns

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

    protected var language : Language? = null

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

    protected fun toast(messageId : Int){
        Toast.makeText(this, getString(messageId), Toast.LENGTH_SHORT).show()
    }

    protected fun toast(message : String){
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }

    private fun checkLanguage(){
        when(language){
            Language.KOTLIN -> {}//toast(R.string.kotlin)
            Language.JAVA -> {}//toast(R.string.java)
            else -> toast(R.string.check_language)
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
        checkLanguage()
    }
}

enum class Language{
    KOTLIN,
    JAVA
}