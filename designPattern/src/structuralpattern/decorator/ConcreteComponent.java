package structuralpattern.decorator;

/**
 * @auther: YangChegn
 * @program:设计模式
 * @title: ConcreteComponent
 * @description: 具体构件角色
 * @data 2020/8/7 0007 19:45
 */
public class ConcreteComponent implements Component{

    public ConcreteComponent()
    {
        System.out.println("创建具体构件角色");
    }
    @Override
    public void operation() {
        System.out.println("调用具体构件角色的方法operation()");
    }
}
