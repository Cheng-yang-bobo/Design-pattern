package structuralpattern.flyweight;

/**
 * @auther: YangChegn
 * @program:设计模式
 * @title: FlyweightMain
 * @description: 享元模式主函数
 * @data 2020/8/11 0011 9:58
 */
public class FlyweightMain {
    public static void main(String[] args) {
        FlyweightFactory factory=new FlyweightFactory();
        Flyweight f01=factory.getFlyweight("a");
        Flyweight f02=factory.getFlyweight("a");
        Flyweight f03=factory.getFlyweight("a");
        Flyweight f11=factory.getFlyweight("b");
        Flyweight f12=factory.getFlyweight("b");
        f01.operation(new UnsharedConcreteFlyweight("第一次调用A"));
        f02.operation(new UnsharedConcreteFlyweight("第二次调用A"));
        f03.operation(new UnsharedConcreteFlyweight("第三次调用A"));
        f11.operation(new UnsharedConcreteFlyweight("第一次调用B"));
        f12.operation(new UnsharedConcreteFlyweight("第二次调用B"));
    }
}
