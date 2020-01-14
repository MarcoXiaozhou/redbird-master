package com.redbird.marco.sys.designpatterns.strategypattern;

public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
