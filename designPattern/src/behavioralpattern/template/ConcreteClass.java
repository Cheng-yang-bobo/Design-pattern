package behavioralpattern.template;

/**
 * @auther: YangChegn
 * @program:设计模式
 * @title: ConcreteClass
 * @description: 具体子类
 * @data 2020/8/14 0014 19:06
 */
public class ConcreteClass extends AbstractClass{

    @Override
    public void abstractMethod1() {
        System.out.println("抽象方法1的实现被调用...");
    }

    @Override
    public void abstractMethod2() {
        System.out.println("抽象方法1的实现被调用...");
    }
}
