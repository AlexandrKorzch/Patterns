package com.alex.patterns.memento

import android.view.View
import android.widget.EditText
import com.alex.patterns.BaseActivity
import com.alex.patterns.Language
import com.alex.patterns.R
import kotlinx.android.synthetic.main.activity_momento.*

class MementoActivity : BaseActivity() {

    override fun toolbarTitle() = R.string.momento
    override fun layoutId() = R.layout.activity_momento
    override fun isBackButton() = true

    private lateinit var edText: EditText

    override fun onCreate() {
        setClickListener(btSave, btRestore)
        edText = findViewById(R.id.editText)
    }

    override fun onClick(v: View) {
        super.onClick(v)
        when (v.id) {
            R.id.btSave -> saveState()
            R.id.btRestore -> restoreState()
        }
    }

    private fun saveState() {
        when (language) {
            Language.JAVA -> saveStateJava()
            Language.KOTLIN -> saveStateKotlin()
        }
    }

    private fun restoreState() {
        when (language) {
            Language.JAVA -> restoreStateJava()
            Language.KOTLIN -> restoreStateKotlin()
        }
    }

    private fun saveStateJava() {

    }

    private fun saveStateKotlin() {

    }

    private fun restoreStateJava() {

    }

    private fun restoreStateKotlin() {

    }

}
