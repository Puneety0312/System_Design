package com.systemDesign.decoratorPattern;

public class Condiment extends Decorator{
    Beverage beverage;

    public Condiment(Beverage beverage){
        this.beverage=beverage;
    }
    @Override
    public String getDesc() {
        return beverage.getDesc() + "condiment";
    }

    @Override
    public double cost() {
        return beverage.cost() + 12;
    }
}
