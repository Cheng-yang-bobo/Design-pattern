package structuralpattern.decorator;

/**
 * @auther: YangChegn
 * @program:设计模式
 * @title: ConcreteDecorator
 * @description: 具体装饰角色
 * @data 2020/8/7 0007 19:47
 */
public class ConcreteDecorator extends Decorator {

    public ConcreteDecorator(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        super.operation();
        addedFunction();
    }

    public void addedFunction() {
        System.out.println("为具体构件角色增加额外的功能addedFunction()");
    }

}
