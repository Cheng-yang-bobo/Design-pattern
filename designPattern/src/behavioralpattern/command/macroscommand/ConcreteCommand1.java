package behavioralpattern.command.macroscommand;

/**
 * @auther: YangChegn
 * @program:设计模式
 * @title: ConcreteCommand1
 * @description: 树叶构件:具体命令1
 * @data 2020/8/18 0018 19:09
 */
public class ConcreteCommand1 implements AbstractCommand{
    private CompositeReceiver receiver;
    ConcreteCommand1()
    {
        receiver=new CompositeReceiver();
    }
    @Override
    public void execute() {

        receiver.action1();
    }
}
