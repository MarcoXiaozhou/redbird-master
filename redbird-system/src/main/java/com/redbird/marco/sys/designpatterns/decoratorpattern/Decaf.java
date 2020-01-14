package com.redbird.marco.sys.designpatterns.decoratorpattern;

/**
 * @program: redbird-master
 * @description: 低咖咖啡
 * @author: fanwz
 * @create: 2020-01-14 15:18
 **/
public class Decaf extends Beverage {
    public Decaf() {
        description = "Decaf";
    }

    @Override
    public double cost() {
        return 0.86;
    }
}
