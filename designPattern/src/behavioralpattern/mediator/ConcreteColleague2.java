package behavioralpattern.mediator;

/**
 * @auther: YangChegn
 * @program:设计模式
 * @title: ConcreteColleague2
 * @description: 具体同事类2号
 * @data 2020/8/20 0020 14:12
 */
public class ConcreteColleague2 extends Colleague {
    @Override
    public void receive() {
        System.out.println("具体同事类2号收到请求");
    }

    @Override
    public void send() {
        System.out.println("具体同事类2号发出请求");
        mediator.relay(this);
    }
}
