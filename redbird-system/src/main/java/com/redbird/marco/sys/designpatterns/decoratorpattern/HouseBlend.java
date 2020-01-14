package com.redbird.marco.sys.designpatterns.decoratorpattern;

/**
 * @program: redbird-master
 * @description: 混合咖啡
 * @author: fanwz
 * @create: 2020-01-14 15:08
 **/
public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "house blend coffee";
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
