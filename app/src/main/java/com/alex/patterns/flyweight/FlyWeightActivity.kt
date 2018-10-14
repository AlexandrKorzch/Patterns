package com.alex.patterns.flyweight

import com.alex.patterns.BaseActivity
import com.alex.patterns.R

class FlyWeightActivity : BaseActivity() {

    override fun toolbarTitle() = R.string.flyweight
    override fun layoutId() = R.layout.activity_fly_weight
    override fun isBackButton() = true

    override fun onCreate() {
    }
}