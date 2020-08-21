package behavioralpattern.observer;

/**
 * @auther: YangChegn
 * @program:设计模式
 * @title: ObserverMain
 * @description: 观察者模式
 * @data 2020/8/19 0019 16:30
 */
public class ObserverMain {

    public static void main(String[] args) {
        Subject subject = new ConcreteSubject();
        Observer observer1 = new ConcreteObserver1();
        Observer observer2 = new ConcreteObserver2();
        subject.add(observer1);
        subject.add(observer2);
        subject.remove(observer2);
    }
}
