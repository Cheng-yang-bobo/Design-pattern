package behavioralpattern.state.flyweightstatepattern;

/**
 * @auther: YangChegn
 * @program:设计模式
 * @title: ConcreteState2
 * @description: 具体状态2类
 * @data 2020/8/19 0019 16:15
 */
public class ConcreteState2 extends ShareState{
    @Override
    public void Handle(ShareContext context) {
        System.out.println("当前状态是： 状态2");
        context.setState(context.getState("1"));
    }
}
