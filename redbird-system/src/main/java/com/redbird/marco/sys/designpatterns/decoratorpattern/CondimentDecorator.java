package com.redbird.marco.sys.designpatterns.decoratorpattern;

/**
 * @program: redbird-master
 * @description: 调料
 * @author: fanwz
 * @create: 2020-01-14 15:01
 **/
public abstract class CondimentDecorator extends Beverage {
    /**
     * 1、必须让CondimentDecorator能够取代Beverage，所以
     * CondimentDecorator扩展自Beverage累
     * 2、所有的调料装饰者必须重新实现getDescription()方法。
     * @return
     */
    public abstract String getDescription();

}
