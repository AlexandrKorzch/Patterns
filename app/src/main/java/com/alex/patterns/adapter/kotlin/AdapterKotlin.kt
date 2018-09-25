package com.alex.patterns.adapter.kotlin

import android.content.Context

class AdapterKotlin(private val library: LibraryKotlin) : ToastAdapterKotlin {

    override fun toastHello(context : Context) = library.makeToastHello(context)

    override fun toastBuy(context : Context) = library.makeToastBuy(context)
}