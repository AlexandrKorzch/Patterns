package com.alex.patterns.mediator

import com.alex.patterns.BaseActivity
import com.alex.patterns.R
import com.alex.patterns.mediator.java.*
import com.alex.patterns.mediator.kotlin.*
import kotlinx.android.synthetic.main.activity_mediator.*

class MediatorActivity : BaseActivity() {

    override fun toolbarTitle() = R.string.mediator
    override fun layoutId() = R.layout.activity_mediator
    override fun isBackButton() = true

    override fun onCreate() {
        ButtonMediatorKotlin().apply {
            firstButton = FirstButtonKotlin(btFirstKotlin, this)
            secondButton = SecondButtonKotlin(btSecondKotlin, this)
            thirdButton = ThirdButtonKotlin(btThirdKotlin, this)
            fourthButton = FourthButtonKotlin(btFourthKotlin, this)
        }
        ButtonMediatorJava().apply {
            setFirstButton(FirstButtonJava(btFirstJava, this))
            setSecondButton(SecondButtonJava(btSecondJava, this))
            setThirdButton(ThirdButtonJava(btThirdJava, this))
            setFourthButton(FourthButtonJava(btFourthJava, this))
        }
    }
}
