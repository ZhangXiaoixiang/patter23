package com.demo.patter01;

/**
 * SingletonDemo4
 * 测试静态内部类实现单例模式  (推荐使用,很多框架也是使用它的)
 * 这种方式：线程安全，调用效率高，并且实现了延时加载.
 * @author 10905 2018/12/23
 * @version 1.0
 */
public class SingletonDemo4 {
    /**
     * 这是一个静态内部类,可以发现并没有立即加载该类,实现延迟加载的效果,直到调用才加载
     */
    private static class SingletonClassInstance {
        /**
         * static可以加final修饰,但是其实没有必要
         */
        private static  SingletonDemo4 instance = new SingletonDemo4();
    }

    /**
     * 构造器私有化
     */
    private SingletonDemo4(){
    }

    /**
     *  方法没有同步，调用效率高！,调用的时候才去静态内部类new对象,实现延时加载
     */

    public static SingletonDemo4  getInstance(){
        return SingletonClassInstance.instance;
    }
}
