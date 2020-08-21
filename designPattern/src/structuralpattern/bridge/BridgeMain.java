package structuralpattern.bridge;

/**
 * @auther: YangChegn
 * @program:设计模式
 * @title: BridgeMain
 * @description: 桥接模式主函数
 * @data 2020/8/7 0007 13:23
 */
public class BridgeMain {

    public static void main(String[] args) {
        Adaptee adaptee=new Adaptee();
        Implementor implementor=new ConcreteImplementorA(adaptee);
        Abstraction abstraction=new RefinedAbstraction(implementor);
        abstraction.Operation0();
        abstraction.Operation1();
        abstraction.Operation2();
    }
}
