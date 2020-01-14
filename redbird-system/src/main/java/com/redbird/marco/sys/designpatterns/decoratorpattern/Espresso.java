package com.redbird.marco.sys.designpatterns.decoratorpattern;

/**
 * @program: redbird-master
 * @description: 浓缩咖啡
 * @author: fanwz
 * @create: 2020-01-14 15:05
 **/
public class Espresso extends Beverage {
    public Espresso(){
        description = "Espresso";
    }
    public double cost(){
        return 1.99;
    }
}
