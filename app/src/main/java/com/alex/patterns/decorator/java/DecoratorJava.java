package com.alex.patterns.decorator.java;

public class DecoratorJava implements IDecorComponentJava {

    private IDecorComponentJava component ;

    DecoratorJava(IDecorComponentJava component) {
        this.component = component;
    }

    @Override
    public String decorate(String text) {
        return component.decorate(text);
    }
}
