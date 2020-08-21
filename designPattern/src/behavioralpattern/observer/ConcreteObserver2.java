package behavioralpattern.observer;

/**
 * @auther: YangChegn
 * @program:设计模式
 * @title: ConcreteObserver2
 * @description: 具体观察这2
 * @data 2020/8/19 0019 16:59
 */
public class ConcreteObserver2 extends Observer {


    ConcreteObserver2(){
        this.setName("具体观察者2");
    }

    @Override
    public void response() {
        System.out.println("具体观察者2做出响应执行"+this.name);
    }
}
