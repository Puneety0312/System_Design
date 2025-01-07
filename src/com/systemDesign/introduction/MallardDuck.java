package com.systemDesign.introduction;

public class MallardDuck extends Duck{
    public MallardDuck(){
        quackBehaviour = new Quack();
        flyBehaviour = new FlyWithWings();
    }
    @Override
    public void display() {
        System.out.println("I am Mallard Duck");
    }
}
