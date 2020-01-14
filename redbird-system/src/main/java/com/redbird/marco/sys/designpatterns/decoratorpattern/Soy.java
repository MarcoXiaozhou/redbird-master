package com.redbird.marco.sys.designpatterns.decoratorpattern;

/**
 * @program: redbird-master
 * @description: 豆浆
 * @author: fanwz
 * @create: 2020-01-14 15:29
 **/
public class Soy extends CondimentDecorator {
    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+", soy";
    }

    @Override
    public double cost() {
        return 0.5+beverage.cost();
    }
}
