package com.alex.patterns.decorator.java;

public class FirstDecoratorJava extends DecoratorJava {

    public FirstDecoratorJava(IDecorComponentJava component) {
        super(component);
    }

    @Override
    public String decorate(String text) {
        return super.decorate("( "+ text + " )");
    }
}
