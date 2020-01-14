package com.redbird.marco.sys.designpatterns.strategypattern;

public class Squeak implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}
