package com.alex.patterns.decorator.java;

public class SecondDecoratorJava extends DecoratorJava {

    public SecondDecoratorJava(IDecorComponentJava component) {
        super(component);
    }

    @Override
    public String decorate(String text) {
        return super.decorate("[ "+ text + " ]");
    }
}