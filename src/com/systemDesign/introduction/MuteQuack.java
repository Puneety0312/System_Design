package com.systemDesign.introduction;

public class MuteQuack implements QuackBehaviour{
    @Override
    public void quack() {
        System.out.println("Mute Quack");
    }
}
