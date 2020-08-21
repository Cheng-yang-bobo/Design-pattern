package behavioralpattern.mediator;

/**
 * @auther: YangChegn
 * @program:设计模式
 * @title: Colleague
 * @description: 抽象同事类
 * @data 2020/8/20 0020 14:09
 */
public abstract class Colleague {
    protected Mediator mediator;

    public void setMedium(Mediator mediator) {
        this.mediator = mediator;
    }

    public abstract void receive();

    public abstract void send();
}
