package behavioralpattern.state;

/**
 * @auther: YangChegn
 * @program:设计模式
 * @title: ConcreteStateB
 * @description: 具体状态B类
 * @data 2020/8/19 0019 15:18
 */
public class ConcreteStateB extends State{
    @Override
    public void Handle(Context context) {
        System.out.println("当前状态是B");
        context.setState(new ConcreteStateA());
    }
}
