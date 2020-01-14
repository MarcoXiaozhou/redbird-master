package com.redbird.marco.sys.designpatterns.decoratorpattern;

/**
 * @program: redbird-master
 * @description: 摩卡咖啡-装饰者
 * @author: fanwz
 * @create: 2020-01-14 15:09
 **/
public class Mocha extends CondimentDecorator {
    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return 0.2+beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+",Mocha";
    }
}
