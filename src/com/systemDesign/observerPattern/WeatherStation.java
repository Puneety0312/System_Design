package com.systemDesign.observerPattern;

public class WeatherStation {
    public static void main(String[] args){
        SubjectImpl subject = new SubjectImpl();
        Observer currentDisplay = new CurrentDisplay(subject);
        subject.setMeasurement(2.3F,34.3F,434);
        subject.setMeasurement(22F,23.F,12);
    }
}
