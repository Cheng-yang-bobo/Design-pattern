package behavioralpattern.command;

/**
 * @auther: YangChegn
 * @program:设计模式
 * @title: ConcreteCommand
 * @description: 具体命令
 * @data 2020/8/18 0018 18:44
 */
public class ConcreteCommand implements Command{
    private Receiver receiver;

    ConcreteCommand(){
        receiver=new Receiver();
    }

    @Override
    public void execute() {
        receiver.action();
    }
}
