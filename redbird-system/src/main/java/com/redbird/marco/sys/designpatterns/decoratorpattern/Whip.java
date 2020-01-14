package com.redbird.marco.sys.designpatterns.decoratorpattern;

/**
 * @program: redbird-master
 * @description:
 * @author: fanwz
 * @create: 2020-01-14 15:22
 **/
public class Whip extends CondimentDecorator {
    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+", whip";
    }

    @Override
    public double cost() {
        return 0.3+beverage.cost();
    }
}
