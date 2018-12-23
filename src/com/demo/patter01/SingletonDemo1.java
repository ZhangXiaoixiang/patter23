package com.demo.patter01;

/**
 * SingletonDemo1
 * 测试饿汉式单例模式 优点:调用效率高  缺点:不具备延时加载
 * @author 10905 2018/12/23
 * @version 1.0
 */
public class SingletonDemo1 {
    /**
     * 1 类初始化时，立即加载这个对象（没有延时加载的优势）。加载类时，天然的是线程安全的.这里使用的private封装对象(主要是安全层面的访
     *   问修饰符,和一般的属性封装为private是一样的,没有什么特别的意思)
     *   static修饰是为了实例化对象的时候的方便使用类名.方法名的方式得到这个类的单例对象
     */
    private static SingletonDemo1 instance=new SingletonDemo1();

    /**
     * 2 私有构造器(在本类的如果要继续new对象可以,private,public修饰构造器没有区别,但是外部调用该类,必须使用private修饰以防止外部
     * new出新对象,所以这里必须是private修饰构造器)
     */
    private SingletonDemo1() {
    }
    /**
     * 3 公开调用方法,方法没有同步，调用效率高！(必须要提供给外部一个方法创建这个类的单例(唯一)对象的方法,因为第一步static修饰类属性的
     * (就是一个对象),所以这里也必须使用static修饰返回的对象)
     */
    public static SingletonDemo1 getInstance(){
        return instance;
    }

    /**
     * 这是在本类测试,所以上面的化构造器即使是private修饰为私有的,但是在本类仍然可以使用构造器new对象,所以我这里写的main方法主要是为了
     * 加深对构造器为什么要私有化的理解二特意在这里的,
     * 当然,要测试单例,应该在另一个类中写个main方法测试(或者junit测试)
     * @param args
     */

    public static void main(String[] args) {
        SingletonDemo1 instance = SingletonDemo1.getInstance();
        System.out.println(instance);
        SingletonDemo1 instance1 = SingletonDemo1.getInstance();
        System.out.println(instance1);
        /**
         * 构造器私有化了,为什么仍然可以new的原因是因为这个main方法写在了单例类的内部,当然可以使用构造器(故意写在这里的)
         */
        SingletonDemo1 singletonDemo1=new SingletonDemo1();
        SingletonDemo1 singletonDemo2=new SingletonDemo1();
        System.out.println(singletonDemo1);
        System.out.println(singletonDemo2);
        /**
         * 说明:instance和instance1肯定是一个对象,但是singletonDemo1和singletonDemo2不是一个对象了
         */
    }

}
