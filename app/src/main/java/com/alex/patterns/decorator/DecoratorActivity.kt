package com.alex.patterns.decorator

import android.view.View
import android.widget.CompoundButton
import com.alex.patterns.BaseActivity
import com.alex.patterns.Language
import com.alex.patterns.R
import com.alex.patterns.decorator.java.*
import com.alex.patterns.decorator.kotlin.*
import kotlinx.android.synthetic.main.activity_decorator.*

class DecoratorActivity : BaseActivity(), CompoundButton.OnCheckedChangeListener {

    override fun toolbarTitle() = R.string.decorator
    override fun layoutId() = R.layout.activity_decorator
    override fun isBackButton() = true

    private var decoratorKotlin: IDecorComponentKotlin = TextComponentKotlin()
    private var decoratorJava: IDecorComponentJava = TextComponentJava()

    override fun onCreate() {
        setClickListener(btDecorate)
        initCheckBoxes()
    }

    private fun initCheckBoxes() {
        cbRound.setOnCheckedChangeListener(this)
        cbSquare.setOnCheckedChangeListener(this)
        cbBraces.setOnCheckedChangeListener(this)
    }

    override fun onCheckedChanged(buttonView: CompoundButton, isChecked: Boolean) {
        takeIf { isChecked }
                ?.apply {
                    when (language) {
                        Language.KOTLIN -> when (buttonView.id) {
                            R.id.cbRound -> decoratorKotlin = FirstDecoratorKotlin(decoratorKotlin)
                            R.id.cbSquare -> decoratorKotlin = SecondDecoratorKotlin(decoratorKotlin)
                            R.id.cbBraces -> decoratorKotlin = ThirdDecoratorKotlin(decoratorKotlin)
                        }
                        Language.JAVA -> when (buttonView.id) {
                            R.id.cbRound -> decoratorJava = FirstDecoratorJava(decoratorJava)
                            R.id.cbSquare -> decoratorJava = SecondDecoratorJava(decoratorJava)
                            R.id.cbBraces -> decoratorJava = ThirdDecoratorJava(decoratorJava)
                        }
                    }
                }
    }

    override fun onClick(v: View) {
        super.onClick(v)
        when (v.id) {
            R.id.btDecorate -> when (language) {
                Language.KOTLIN -> tvResult.text = decoratorKotlin.decorate(editText.text.toString())
                Language.JAVA -> tvResult.text = decoratorJava.decorate(editText.text.toString())
            }
        }
    }
}