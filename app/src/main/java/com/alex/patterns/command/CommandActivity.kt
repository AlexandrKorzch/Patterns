package com.alex.patterns.command

import android.view.View
import android.widget.RadioGroup
import com.alex.patterns.BaseActivity
import com.alex.patterns.Language
import com.alex.patterns.R
import com.alex.patterns.command.java.InvokerJava
import com.alex.patterns.command.java.ReceiverJava
import com.alex.patterns.command.kotlin.InvokerKotlin
import com.alex.patterns.command.kotlin.ReceiverKotlin
import kotlinx.android.synthetic.main.activity_command.*

class CommandActivity : BaseActivity() {

    override fun toolbarTitle() = R.string.bridge
    override fun layoutId() = R.layout.activity_command
    override fun isBackButton() = true

    private lateinit var invokerKotlin: InvokerKotlin
    private lateinit var invokerJava: InvokerJava

    override fun onCreate() {
        setClickListener(btUndo)
        initInvokerRadioGroup()
        invokerKotlin = InvokerKotlin(ReceiverKotlin(findViewById(R.id.rgSwitcherTwo)))
        invokerJava = InvokerJava(ReceiverJava(findViewById(R.id.rgSwitcherTwo)))
    }

    override fun onClick(v: View) {
        super.onClick(v)
        when (v.id) {
            R.id.btUndo -> when (language) {
                Language.KOTLIN -> invokerKotlin.undo()
                Language.JAVA -> invokerJava.undo()
            }
        }
    }

    private fun initInvokerRadioGroup() {
        findViewById<RadioGroup>(R.id.rgSwitcher)?.setOnCheckedChangeListener { _, checkedId ->
            when (checkedId) {
                R.id.rbOne -> when (language) {
                    Language.KOTLIN -> invokerKotlin.invokeOne()
                    Language.JAVA -> invokerJava.invokeOne()
                }
                R.id.rbTwo -> when (language) {
                    Language.KOTLIN -> invokerKotlin.invokeTwo()
                    Language.JAVA -> invokerJava.invokeTwo()
                }
                R.id.rbThree -> when (language) {
                    Language.KOTLIN -> invokerKotlin.invokeThree()
                    Language.JAVA -> invokerJava.invokeThree()
                }
                R.id.rbFour -> when (language) {
                    Language.KOTLIN -> invokerKotlin.invokeFour()
                    Language.JAVA -> invokerJava.invokeFour()
                }
            }
        }
    }
}