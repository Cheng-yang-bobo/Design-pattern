package behavioralpattern.mediator;

/**
 * @auther: YangChegn
 * @program:设计模式
 * @title: MediatorMain
 * @description: 中介者模式
 * @data 2020/8/20 0020 14:03
 */
public class MediatorMain {
    public static void main(String[] args) {
        Mediator md=new ConcreteMediator();
        Colleague c1,c2;
        c1=new ConcreteColleague1();
        c2=new ConcreteColleague2();
        md.register(c1);
        md.register(c2);
        c1.send();
        System.out.println("-------------");
        c2.send();
    }
}
