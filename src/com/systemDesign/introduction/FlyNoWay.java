package com.systemDesign.introduction;

public class FlyNoWay implements FlyBehaviour
{
    @Override
    public void fly() {
        System.out.println("Duck cannot fly");
    }
}
