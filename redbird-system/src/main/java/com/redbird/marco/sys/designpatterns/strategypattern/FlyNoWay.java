package com.redbird.marco.sys.designpatterns.strategypattern;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("i'm can't fly!!!");
    }
}
