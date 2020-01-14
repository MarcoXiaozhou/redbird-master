package com.redbird.marco.sys.designpatterns.observerpattern;

import java.util.ArrayList;

/**
 * @program: redbird-master
 * @description:
 * @author: fanwz
 * @create: 2020-01-14 13:33
 **/
public class WeatherData implements Subject {

    private ArrayList observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        observers = new ArrayList();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if(i>=0){
            observers.remove(i);
        }
    }

    @Override
    public void notifyObservers() {
        for(int i=0;i<observers.size();i++){
            Observer observer= (Observer) observers.get(i);
//            System.out.println(o);
            observer.update(temperature,humidity,pressure);
        }
    }

    public void measurementsChanged(){
        notifyObservers();
    }

    public void setMessurements(float temperature,float humidity,float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}