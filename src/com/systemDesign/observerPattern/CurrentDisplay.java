package com.systemDesign.observerPattern;

public class CurrentDisplay implements Observer, Display{
    private float temp;
    private float pressure;
    private float humidity;
    private Subject subject;

    public CurrentDisplay(Subject subject){
        this.subject=subject;
        subject.register(this);
    }

    @Override
    public void update(float temp, float pressure, float humidity) {
        this.temp=temp;
        this.pressure=pressure;
        this.humidity=humidity;
        display();
    }

    @Override
    public void display() {
        System.out.println("Temprature is :" + temp +", Pressure is :" + pressure + ", Humidity is :" + humidity);
    }
}
