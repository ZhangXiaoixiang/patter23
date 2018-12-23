package com.demo.patter01;

/**
 * SingletonDemo5
 * 枚举式实现单例模式(没有延时加载)
 * @author 10905 2018/12/23
 * @version 1.0
 */
public enum  SingletonDemo5 {
    /**
     *  这个枚举元素，本身就是单例对象！
     */

    INSTANCE;

    /**
     *  添加自己需要的操作！
     */

    public void singletonOperation(){
    }
}
