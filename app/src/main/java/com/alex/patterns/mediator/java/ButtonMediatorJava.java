package com.alex.patterns.mediator.java;

public class ButtonMediatorJava implements MediatorJava {

    private ButtonJava firstButton;
    private ButtonJava secondButton;
    private ButtonJava thirdButton;
    private ButtonJava fourthButton;

    @Override
    public void send(String message, ButtonJava sender) {
        if (sender == firstButton){
            secondButton.onGetMessage(message);
        }else if (sender == secondButton){
            thirdButton.onGetMessage(message);
        }else if (sender == thirdButton){
            fourthButton.onGetMessage(message);
        }
    }

    public void setFirstButton(ButtonJava firstButton) {
        this.firstButton = firstButton;
    }

    public void setSecondButton(ButtonJava secondButton) {
        this.secondButton = secondButton;
    }

    public void setThirdButton(ButtonJava thirdButton) {
        this.thirdButton = thirdButton;
    }

    public void setFourthButton(ButtonJava fourthButton) {
        this.fourthButton = fourthButton;
    }
}
