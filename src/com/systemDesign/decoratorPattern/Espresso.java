package com.systemDesign.decoratorPattern;

public class Espresso extends Beverage{
    public Espresso(){
        desc="Espresso";
    }
    @Override
    public double cost() {
        return 99.0;
    }
}
