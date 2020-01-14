package com.redbird.marco.sys.designpatterns.observerpattern;

/**
 * @program: redbird-master
 * @description: 测试类
 * @author: fanwz
 * @create: 2020-01-14 13:44
 **/
public class test {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionDisplay conditionDisplay = new CurrentConditionDisplay(weatherData);
        weatherData.setMessurements(80f,65f,30.4f);
        weatherData.setMessurements(82f,70f,29.2f);
        weatherData.setMessurements(78f,90f,29.3f);
    }
}
