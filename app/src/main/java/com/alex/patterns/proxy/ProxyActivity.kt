package com.alex.patterns.proxy

import android.view.View
import com.alex.patterns.BaseActivity
import com.alex.patterns.Language
import com.alex.patterns.R
import com.alex.patterns.proxy.java.MathProxyJava
import com.alex.patterns.proxy.kotlin.MathProxyKotlin
import kotlinx.android.synthetic.main.activity_proxy.*

class ProxyActivity : BaseActivity() {

    override fun toolbarTitle() = R.string.proxy
    override fun layoutId() = R.layout.activity_proxy
    override fun isBackButton() = true

    private var first  = 0
    private var second  = 0

    private val mathProxyJava  = MathProxyJava()
    private val mathProxyKotlin  = MathProxyKotlin()

    override fun onCreate() {
        setClickListener(btMultiple, btPlus, btMinus, btDivide)
    }

    override fun onClick(v: View) {
        super.onClick(v)
        first = etFirst.text.toString().toInt()
        second = etSecond.text.toString().toInt()
        when (v.id) {
            R.id.btMultiple ->  when (language) {
                Language.JAVA -> multipleJava()
                Language.KOTLIN -> multipleKotlin()
            }
            R.id.btPlus -> when (language) {
                Language.JAVA -> plusJava()
                Language.KOTLIN -> plusKotlin()
            }
            R.id.btMinus -> when (language) {
                Language.JAVA -> minusJava()
                Language.KOTLIN -> minusKotlin()
            }
            R.id.btDivide -> when (language) {
                Language.JAVA -> divideJava()
                Language.KOTLIN -> divideKotlin()
            }
        }
    }

    private fun multipleJava() = mathProxyJava.mul(first, second, this)
    private fun divideJava() = mathProxyJava.div(first, second, this)
    private fun minusJava() = mathProxyJava.sub(first, second, this)
    private fun plusJava() = mathProxyJava.add(first, second, this)

    private fun multipleKotlin() = mathProxyKotlin.mul(first, second, this)
    private fun divideKotlin() = mathProxyKotlin.div(first, second, this)
    private fun minusKotlin() = mathProxyKotlin.sub(first, second, this)
    private fun plusKotlin() = mathProxyKotlin.add(first, second, this)
}