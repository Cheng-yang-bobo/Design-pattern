package behavioralpattern.chainofresponsibility;

/**
 * @auther: YangChegn
 * @program:设计模式
 * @title: ChainOfResponsibilityMain
 * @description: 责任链模式主函数
 * @data 2020/8/19 0019 11:04
 */
public class ChainOfResponsibilityMain {

    public static void main(String[] args) {

        Handler handler1=new ConcreteHandler1();
        Handler handler2=new ConcreteHandler2();

        handler1.setNext(handler2);

        handler1.handleRequest("two");
    }

}
