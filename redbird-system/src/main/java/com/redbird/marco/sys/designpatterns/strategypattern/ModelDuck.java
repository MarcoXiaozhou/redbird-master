package com.redbird.marco.sys.designpatterns.strategypattern;

/**
 * @program: redbird-master
 * @description: ModelDuck
 * @author: fanwz
 * @create: 2020-01-14 09:54
 **/
public class ModelDuck extends Duck {
    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a model duck");
    }
}
