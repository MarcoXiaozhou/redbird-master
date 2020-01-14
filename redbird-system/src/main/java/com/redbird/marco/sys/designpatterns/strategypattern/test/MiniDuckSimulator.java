package com.redbird.marco.sys.designpatterns.strategypattern.test;

import com.redbird.marco.sys.designpatterns.strategypattern.Duck;
import com.redbird.marco.sys.designpatterns.strategypattern.FlyRocketPowered;
import com.redbird.marco.sys.designpatterns.strategypattern.MallardDuck;
import com.redbird.marco.sys.designpatterns.strategypattern.ModelDuck;


public class MiniDuckSimulator {

    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
