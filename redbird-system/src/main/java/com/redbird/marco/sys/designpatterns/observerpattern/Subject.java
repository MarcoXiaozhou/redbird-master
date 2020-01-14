package com.redbird.marco.sys.designpatterns.observerpattern;

/**
 * @program: 观察者模式--在对象之间定义一对多的依赖，这样一来，
 *            当一个对象改变状态，依赖它的对象都会收到通知并自动更新。
 * @description: 主题
 * @author: fanwz
 * @create: 2020-01-14 13:23
 **/
public interface Subject {
    /**
     * 注册观察者
     * @param o
     */
    public void registerObserver(Observer o);

    /**
     * 删除观察者
     * @param o
     */
    public void removeObserver(Observer o);

    /**
     * 当主题状态改变时，这个方法会被调用，已通知所有的观察者
     */
    public void notifyObservers();
}
