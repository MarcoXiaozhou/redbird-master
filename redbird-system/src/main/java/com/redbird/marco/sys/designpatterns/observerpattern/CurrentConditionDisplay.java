package com.redbird.marco.sys.designpatterns.observerpattern;

/**
 * @program: redbird-master
 * @description: 布告板实现类
 * @author: fanwz
 * @create: 2020-01-14 13:39
 **/
public class CurrentConditionDisplay implements Observer,DisplayElement {
    private float temperature;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current conditons:"+temperature+"F degrees and "+humidity+" % humidity");
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();

    }
}
