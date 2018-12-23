package com.demo.patter01.test;

import com.demo.patter01.SingletonDemo1;
import com.demo.patter01.SingletonDemo2;
import com.demo.patter01.SingletonDemo4;
import com.demo.patter01.SingletonDemo5;
import org.junit.jupiter.api.Test;


public class TestPatterTest {
    /**
     * 饿汉式
     */
    @Test
    public void SingletonDemo1Test() {
        System.out.println("饿汉式");
        SingletonDemo1 instance = SingletonDemo1.getInstance();
        SingletonDemo1 instance2 = SingletonDemo1.getInstance();
        System.out.println(instance == instance2);
    }

    /**
     * 懒汉式
     */
    @Test
    public void SingletonDemo2Test() {
        System.out.println("懒汉式");
        SingletonDemo2 instance = SingletonDemo2.getInstance();
        SingletonDemo2 instance2 = SingletonDemo2.getInstance();
        System.out.println(instance == instance2);
    }
//    双重检查锁实现单例模式就不测试了,几乎不用

    /**
     * 静态内部类
     */
    @Test
    public void SingletonDemo4Test() {
        System.out.println("静态内部类");
        SingletonDemo4 instance = SingletonDemo4.getInstance();
        SingletonDemo4 instance2 = SingletonDemo4.getInstance();
        System.out.println(instance == instance2);
    }
    /**
     * 枚举方式
     */
    @Test
    public void SingletonDemo5Test() {
        System.out.println("枚举方式");


    }
}