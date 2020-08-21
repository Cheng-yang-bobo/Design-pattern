package behavioralpattern.observer;

/**
 * @auther: YangChegn
 * @program:设计模式
 * @title: ConcreteObserver1
 * @description: 具体观察者1
 * @data 2020/8/19 0019 16:56
 */
public class ConcreteObserver1 extends Observer{

    ConcreteObserver1(){
        this.setName("具体观察者1");
    }

    @Override
    public void response() {
        System.out.println("具体观察者1做出响应,执行"+this.name);
    }
}
