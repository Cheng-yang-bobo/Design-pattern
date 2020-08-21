package behavioralpattern.command.macroscommand;

/**
 * @auther: YangChegn
 * @program:设计模式
 * @title: ConcreteCommand2
 * @description: 树叶构件:具体命令2
 * @data 2020/8/18 0018 19:11
 */
public class ConcreteCommand2 implements AbstractCommand{


    private CompositeReceiver receiver;
    ConcreteCommand2()
    {
        receiver=new CompositeReceiver();
    }

    @Override
    public void execute()
    {
        receiver.action2();
    }
}
