package com.redbird.marco.sys.designpatterns.strategypattern;

/**
 * @program: redbird-master
 * @description: 动力火箭
 * @author: fanwz
 * @create: 2020-01-14 09:57
 **/
public class FlyRocketPowered implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("i'm flying with a rocket!!!");
    }
}
