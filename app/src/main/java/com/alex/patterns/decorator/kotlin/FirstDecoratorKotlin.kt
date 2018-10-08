package com.alex.patterns.decorator.kotlin

class FirstDecoratorKotlin(component : IDecorComponentKotlin) : DecoratorKotlin(component) {

    override fun decorate(text: String) = super.decorate("( $text )")
}