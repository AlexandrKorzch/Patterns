package com.alex.patterns.mediator.java;

import android.view.View;
import android.widget.TextView;

abstract class ButtonJava  {

    private TextView button;
    private MediatorJava mediator;

    ButtonJava(TextView button, MediatorJava mediator) {
        this.button = button;
        this.mediator = mediator;
        initClick(button);
    }

    private void initClick(View button){
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                send("->");
            }
        });
    }

    private void send(String message){
        mediator.send(message, this);
    }

    void onGetMessage(String message){
        button.setText(message);
    }
}
