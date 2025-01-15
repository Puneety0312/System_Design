package com.systemDesign.decoratorPattern;

public abstract class Beverage {
    public String desc="Coffee";
//    public Beverage(){
//        desc="Beverage";
//    }
    public String getDesc(){
        return desc;
    }
    public abstract double cost();
}
