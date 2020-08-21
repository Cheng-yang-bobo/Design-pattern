package behavioralpattern.mediator;

/**
 * @auther: YangChegn
 * @program:设计模式
 * @title: ConcreteColleague1
 * @description: 具体同事类
 * @data 2020/8/20 0020 14:10
 */
public class ConcreteColleague1 extends Colleague{
    @Override
    public void receive() {
        System.out.println("具体同事1号收到请求");
    }

    @Override
    public void send() {
        System.out.println("具体同事类1号发送请求。");
        mediator.relay(this);
    }
}
