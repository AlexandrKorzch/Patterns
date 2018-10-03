package com.alex.patterns.visitor.java;

public class TextVisitorJava implements VisitorJava {

    @Override
    public void visit(ButtonJava button) {
        button.getButton().setText("Visited");
    }
}