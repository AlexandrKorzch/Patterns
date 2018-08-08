package com.alex.patterns

import android.view.View
import com.alex.patterns.momento.MomentoActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {

    override fun isBackButton() = false
    override fun toolbarTitle() = R.string.app_name
    override fun layoutId() = R.layout.activity_main

    override fun onCreate() {
        setClickListener(btMomento)
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.btMomento -> open(MomentoActivity::class.java)
        }
    }
}

