package com.alex.patterns.adapter

import android.view.View
import com.alex.patterns.BaseActivity
import com.alex.patterns.Language
import com.alex.patterns.R
import com.alex.patterns.adapter.java.AdapterJava
import com.alex.patterns.adapter.java.LibraryJava
import com.alex.patterns.adapter.java.ToastAdapterJava
import com.alex.patterns.adapter.kotlin.AdapterKotlin
import com.alex.patterns.adapter.kotlin.LibraryKotlin
import com.alex.patterns.adapter.kotlin.ToastAdapterKotlin
import kotlinx.android.synthetic.main.activity_adapter.*


class AdapterActivity : BaseActivity() {

    override fun toolbarTitle() = R.string.adapter
    override fun layoutId() = R.layout.activity_adapter
    override fun isBackButton() = true

    private lateinit var adapterKotlin: ToastAdapterKotlin
    private lateinit var adapterJava: ToastAdapterJava

    override fun onCreate() {
        setClickListener(btHello, btBuy)
        adapterKotlin = AdapterKotlin(LibraryKotlin())
        adapterJava = AdapterJava(LibraryJava())
    }

    override fun onClick(v: View) {
        super.onClick(v)
        when (v.id) {
            R.id.btHello -> hello()
            R.id.btBuy -> buy()
        }
    }

    private fun hello() {
        when (language) {
            Language.JAVA -> helloJava()
            Language.KOTLIN -> helloKotlin()
        }
    }

    private fun buy() {
        when (language) {
            Language.JAVA -> buyJava()
            Language.KOTLIN -> buyKotlin()
        }
    }

    private fun helloJava() = adapterJava.toastHello(this)

    private fun helloKotlin() = adapterKotlin.toastHello(this)

    private fun buyJava() = adapterJava.toastBuy(this)

    private fun buyKotlin() = adapterKotlin.toastBuy(this)
}