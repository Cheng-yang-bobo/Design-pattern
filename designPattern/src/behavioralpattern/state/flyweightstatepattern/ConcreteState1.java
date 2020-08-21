package behavioralpattern.state.flyweightstatepattern;

/**
 * @auther: YangChegn
 * @program:设计模式
 * @title: ConcreteState1
 * @description: 具体状态1类
 * @data 2020/8/19 0019 16:14
 */
public class ConcreteState1 extends ShareState{
    @Override
    public void Handle(ShareContext context) {
        System.out.println("当前状态是： 状态1");
        context.setState(context.getState("2"));
    }
}
