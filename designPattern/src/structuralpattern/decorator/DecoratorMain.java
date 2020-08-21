package structuralpattern.decorator;

/**
 * @auther: YangChegn
 * @program:设计模式
 * @title: DecoratorMain
 * @description: 装饰模式主函数
 * @data 2020/8/7 0007 18:56
 */
public class DecoratorMain {
    public static void main(String[] args) {
        Component p=new ConcreteComponent();
        p.operation();
        System.out.println("---------------------------------");
        Component d=new ConcreteDecorator(p);
        d.operation();
    }
}
