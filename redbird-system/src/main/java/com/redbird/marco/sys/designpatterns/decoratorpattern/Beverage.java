package com.redbird.marco.sys.designpatterns.decoratorpattern;

/**
 * @program: 装饰者模式--动态的将责任附加到对象上。想要扩展功能，装饰者提供有别于继承的另一种选择
 * @description: (除水以外的) 饮料
 * @author: fanwz
 * @create: 2020-01-14 14:59
 **/
public abstract class Beverage {
    String description = "Unkonwn Beverage";
    public String getDescription(){
        return description;
    }

    /**
     * cost()方法必须在子类实现
     * @return
     */
    public abstract double cost();
}
