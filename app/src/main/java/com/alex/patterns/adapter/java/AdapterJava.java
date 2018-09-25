package com.alex.patterns.adapter.java;

import android.content.Context;

public class AdapterJava implements ToastAdapterJava{

    private LibraryJava library;

    public AdapterJava(LibraryJava library) {
        this.library = library;
    }

    @Override
    public void toastHello(Context context) {
        library.makeToastHello(context);
    }

    @Override
    public void toastBuy(Context context) {
        library.makeToastBuy(context);
    }
}