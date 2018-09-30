package com.alex.patterns.memento

import android.view.View
import android.widget.EditText
import com.alex.patterns.BaseActivity
import com.alex.patterns.Language
import com.alex.patterns.R
import com.alex.patterns.memento.java.CaretakerJava
import com.alex.patterns.memento.java.MementoJava
import com.alex.patterns.memento.kotlin.CaretakerKotlin
import com.alex.patterns.memento.kotlin.MementoKotlin
import kotlinx.android.synthetic.main.activity_memento.*

class MementoActivityOriginator : BaseActivity() {

    override fun toolbarTitle() = R.string.momento
    override fun layoutId() = R.layout.activity_memento
    override fun isBackButton() = true

    private lateinit var edText: EditText

    private val careTakerKotlin: CaretakerKotlin by lazy { CaretakerKotlin() }
    private val careTakerJava: CaretakerJava by lazy { CaretakerJava() }

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
        careTakerJava.memento = MementoJava(edText.text.toString())
    }

    private fun saveStateKotlin() {
        careTakerKotlin.memento = MementoKotlin(edText.text.toString())
    }

    private fun restoreStateJava() {
        edText.setText(careTakerJava.memento?.state)
    }

    private fun restoreStateKotlin() {
        edText.setText(careTakerKotlin.memento?.state)
    }
}
