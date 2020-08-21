package behavioralpattern.state;

/**
 * @auther: YangChegn
 * @program:设计模式
 * @title: ConcreteStateA
 * @description: 具体状态A
 * @data 2020/8/19 0019 15:15
 */
public class ConcreteStateA extends State{


    @Override
    public void Handle(Context context) {
        System.out.println("当前状态是A");
        context.setState(new ConcreteStateB());
    }

}
