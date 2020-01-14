package com.redbird.marco.sys.designpatterns.decoratorpattern;

/**
 * @program: redbird-master
 * @description:
 * @author: fanwz
 * @create: 2020-01-14 15:16
 **/
public class DarkRoast extends Beverage {
    public DarkRoast(){
        description = "DarkRoast";
    }

    @Override
    public double cost() {
        return 0.75;
    }
}
