package com.alex.patterns.adapter.java;

import android.content.Context;
import android.widget.Toast;

import static android.widget.Toast.LENGTH_SHORT;

public class LibraryJava {

    public void makeToastHello(Context context){
        Toast.makeText(context, "Hello", LENGTH_SHORT).show();
    }

    public void makeToastBuy(Context context){
        Toast.makeText(context, "Buy", LENGTH_SHORT).show();
    }
}