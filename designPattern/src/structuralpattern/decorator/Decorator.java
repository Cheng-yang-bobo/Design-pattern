package structuralpattern.decorator;

/**
 * @auther: YangChegn
 * @program:设计模式
 * @title: Decorator
 * @description: 抽象装饰模式
 * @data 2020/8/7 0007 19:46
 */
public class Decorator implements Component{
    private Component component;

    Decorator(Component component){
        this.component=component;
    }

    @Override
    public void operation() {
        component.operation();
    }
}
