package com.alex.patterns.decorator.kotlin

class ThirdDecoratorKotlin(component : IDecorComponentKotlin) : DecoratorKotlin(component) {

    override fun decorate(text: String): String = super.decorate("{ $text }")
}