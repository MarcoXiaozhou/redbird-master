package com.redbird.marco.sys.designpatterns.strategypattern;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("<<Silence>>");
    }
}
