package com.demo.patter01;

/**
 * SingletonDemo3
 * 双重检查锁实现单例模式(不推荐使用)
 * @author 10905 2018/12/23
 * @version 1.0
 */
public class SingletonDemo3 {
    private static SingletonDemo3 instance = null;
    public static SingletonDemo3 getInstance() {
        if (instance == null) {
            SingletonDemo3 sc;
            synchronized (SingletonDemo3.class) {
                sc = instance;
                if (sc == null) {
                    synchronized (SingletonDemo3.class) {
                        if(sc == null) {
                            sc = new SingletonDemo3();
                        }
                    }
                    instance = sc;
                }
            }
        }
        return instance;
    }

    private SingletonDemo3() {

    }
}
