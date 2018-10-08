package com.alex.patterns.decorator.kotlin

abstract class DecoratorKotlin(var component : IDecorComponentKotlin) : IDecorComponentKotlin{

    override fun decorate(text: String) = component.decorate(text)
}