package com.alex.patterns.bridge

import android.view.View
import com.alex.patterns.BaseActivity
import com.alex.patterns.Language
import com.alex.patterns.R
import com.alex.patterns.bridge.java.ConcreteTextJava
import com.alex.patterns.bridge.java.GreenWriterJava
import com.alex.patterns.bridge.java.RedWriterJava
import com.alex.patterns.bridge.kotlin.ConcreteTextKotlin
import com.alex.patterns.bridge.kotlin.GreenWriterKotlin
import com.alex.patterns.bridge.kotlin.RedWriterKotlin
import kotlinx.android.synthetic.main.activity_bridge.*

class BridgeActivity : BaseActivity() {

    override fun toolbarTitle() = R.string.bridge
    override fun layoutId() = R.layout.activity_bridge
    override fun isBackButton() = true

    private val greenWriterKotlin = GreenWriterKotlin()
    private val redWriterKotlin = RedWriterKotlin()

    private val greenWriterJava = GreenWriterJava()
    private val redWriterJava = RedWriterJava()

    private val greenTextKotlin = ConcreteTextKotlin(greenWriterKotlin)
    private val redTextKotlin = ConcreteTextKotlin(redWriterKotlin)

    private val greenTextJava = ConcreteTextJava(greenWriterJava)
    private val redTextJava = ConcreteTextJava(redWriterJava)

    override fun onCreate() {
        setClickListener(btGreen, btRed)
    }

    override fun onClick(v: View) {
        super.onClick(v)
        when (v.id) {
            R.id.btGreen -> writeGreenText()
            R.id.btRed -> writeRedText()
        }
    }

    private fun writeGreenText() {
        when (language) {
            Language.JAVA -> writeGreenTextJava()
            Language.KOTLIN -> writeGreenTextKotlin()
        }
    }

    private fun writeRedText() {
        when (language) {
            Language.JAVA -> writeRedTextJava()
            Language.KOTLIN -> writeRedTextKotlin()
        }
    }

    private fun writeGreenTextKotlin() {
        greenTextKotlin.writeText("greenKotlin", textView)
    }

    private fun writeRedTextKotlin() {
        redTextKotlin.writeText("redKotlin", textView)
    }

    private fun writeGreenTextJava() {
        greenTextJava.writeText("greenJava", textView)
    }

    private fun writeRedTextJava() {
        redTextJava.writeText("redJava", textView)
    }
}