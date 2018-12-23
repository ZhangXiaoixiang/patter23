package com.demo.patter01;

/**
 * SingletonDemo2
 * 测试懒汉式单例模式 优点:延时加载  缺点:调用效率低
 * @author 10905 2018/12/23
 * @version 1.0
 */
public class SingletonDemo2 {
    /**
     * 类初始化时，不初始化这个对象（延时加载，真正用的时候再创建）。
     */
    private static SingletonDemo2 instance;

    /**
     * 私有化构造器
     */
    private SingletonDemo2(){
    }

    /**
     *  方法同步，调用效率低！
     *  我的解释:为什么需要synchronized同步了?因为懒加载类初始化的时候没有及时new对象,所以试想一下,多个地方使用该类,
     *  但是生成实例的时间点不一样,如果不同步,那么久保证不了单例,并且线程不安全
     */
    public static  synchronized SingletonDemo2  getInstance(){
        if(instance==null){
            instance = new SingletonDemo2();
        }
        return instance;
    }

}


