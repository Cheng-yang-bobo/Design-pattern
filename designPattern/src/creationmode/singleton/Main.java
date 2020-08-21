package creationmode.singleton;

import creationmode.singleton.Singleton.President;

/**
 * @Program:designPattern
 * @Title: Main
 * @Description: main
 * @Auther: YangCheng
 * @Create 2020/8/1 0001 0:14
 */
public class Main {
    public static void main(String[] args) {
//        //单例模式1.0--无锁
//        SingletonLazyTest singletonLazyTest01 = SingletonLazyTest.getInstance01();
//        //单例模式2.0--锁方法
//        SingletonLazyTest singletonLazyTest02 = SingletonLazyTest.getInstance02();
//        //单例模式3.0--锁对象
//        SingletonLazyTest singletonLazyTest03 = SingletonLazyTest.getInstance03();
//        //单例模式4.0--静态内部类
//        SingletonLazyTest singletonLazyTest04 = SingletonLazyTest.getInstance04();
//        //饿汉模式
//        SingletonHungryTest singletonHungryTest=SingletonHungryTest.getInstance();

        President zt1=President.getInstance();
        zt1.getName();
        President zt2=President.getInstance();
        zt2.getName();
        if (zt1==zt2){
            System.out.println("他们是同一个人");
        }else{
            System.out.println("他们不是同一个人!");
        }
    }
}
