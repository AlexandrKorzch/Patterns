package com.alex.patterns.facade

import android.view.View
import com.alex.patterns.BaseActivity
import com.alex.patterns.R
import com.alex.patterns.facade.java.ComputerJava
import com.alex.patterns.facade.kotlin.ComputerKotlin
import kotlinx.android.synthetic.main.activity_facade.*

class FacadeActivity : BaseActivity() {

    override fun toolbarTitle() = R.string.facade
    override fun layoutId() = R.layout.activity_facade
    override fun isBackButton() = true

    override fun onCreate() {
        setClickListener(btLoadJava, btLoadKotlin)
    }

    override fun onClick(v: View) {
        super.onClick(v)
        when (v.id) {
            R.id.btLoadJava -> ComputerJava().startComputer(this)
            R.id.btLoadKotlin -> ComputerKotlin().startComputer(this)
        }
    }
}