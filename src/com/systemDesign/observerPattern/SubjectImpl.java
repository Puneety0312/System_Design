package com.systemDesign.observerPattern;

import java.util.ArrayList;
import java.util.List;

public class SubjectImpl implements Subject{
    private float temp;
    private float pressure;
    private float humidity;
    private List<Observer> observerList;

    public SubjectImpl(){
        observerList = new ArrayList<>();
    }

    @Override
    public void register(Observer o) {
        observerList.add(o);
    }

    @Override
    public void remove(Observer o) {
        observerList.remove(o);
    }

    @Override
    public void notifyObserver() {
        for(Observer o: observerList){
            o.update(temp, pressure, humidity);
        }
    }

    public void setMeasurement(float temp, float pressure, float humidity){
        this.temp=temp;
        this.pressure=pressure;
        this.humidity=humidity;
        notifyObserver();
    }

}
