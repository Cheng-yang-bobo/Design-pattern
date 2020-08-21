package behavioralpattern.observer;

import java.util.Objects;

/**
 * @auther: YangChegn
 * @program:设计模式
 * @title: ConcreteSubject
 * @description: 具体目标类
 * @data 2020/8/19 0019 16:54
 */
public class ConcreteSubject extends Subject {
    @Override
    public void notifyObserver(String handle) {
        System.out.println("-------------");

        System.out.println("具体目标发生改变,操作名:" + handle);

        System.out.println("-------------");

        Observer observer = observers.get(handle);

        if (Objects.isNull(observer)) {
            System.out.println(handle + "执行完毕");
        } else {
            observer.response();
        }
    }
}
