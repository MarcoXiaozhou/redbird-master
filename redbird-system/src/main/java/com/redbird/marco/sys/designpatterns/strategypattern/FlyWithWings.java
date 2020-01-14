package com.redbird.marco.sys.designpatterns.strategypattern;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("i'm flying!!!");
    }
}
