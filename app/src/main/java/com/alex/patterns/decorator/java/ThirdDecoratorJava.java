package com.alex.patterns.decorator.java;

public class ThirdDecoratorJava extends DecoratorJava {

    public ThirdDecoratorJava(IDecorComponentJava component) {
        super(component);
    }

    @Override
    public String decorate(String text) {
        return super.decorate("{ "+ text + " }");
    }
}