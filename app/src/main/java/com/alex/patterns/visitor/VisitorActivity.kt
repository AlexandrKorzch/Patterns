package com.alex.patterns.visitor

import android.view.View
import com.alex.patterns.BaseActivity
import com.alex.patterns.R
import com.alex.patterns.visitor.java.ButtonImplJava
import com.alex.patterns.visitor.java.ButtonJava
import com.alex.patterns.visitor.java.TextVisitorJava
import com.alex.patterns.visitor.java.VisitorJava
import com.alex.patterns.visitor.kotlin.ButtonImplKotlin
import com.alex.patterns.visitor.kotlin.ButtonKotlin
import com.alex.patterns.visitor.kotlin.TextVisitorKotlin
import com.alex.patterns.visitor.kotlin.VisitorKotlin
import kotlinx.android.synthetic.main.activity_visitor.*

class VisitorActivity : BaseActivity() {

    override fun toolbarTitle() = R.string.visitor
    override fun layoutId() = R.layout.activity_visitor
    override fun isBackButton() = true

    private lateinit var buttonKotlin: ButtonKotlin
    private lateinit var visitorKotlin: VisitorKotlin

    private lateinit var buttonJava: ButtonJava
    private lateinit var visitorJava: VisitorJava

    override fun onCreate() {
        setClickListener(btFirstKotlin, btFirstJava)
        initKotlinFields()
        initJavaFields()
    }

    private fun initJavaFields() {
        buttonJava = ButtonImplJava(btSecondJava)
        visitorJava = TextVisitorJava()
    }

    private fun initKotlinFields() {
        buttonKotlin = ButtonImplKotlin(btSecondKotlin)
        visitorKotlin = TextVisitorKotlin()
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.btFirstKotlin -> buttonKotlin.accept(visitorKotlin)
            R.id.btFirstJava -> buttonJava.accept(visitorJava)
        }
    }
}