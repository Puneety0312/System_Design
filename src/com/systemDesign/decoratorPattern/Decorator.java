package com.systemDesign.decoratorPattern;

public abstract class Decorator extends Beverage{
    Beverage beverage;
    public abstract String getDesc();
}
