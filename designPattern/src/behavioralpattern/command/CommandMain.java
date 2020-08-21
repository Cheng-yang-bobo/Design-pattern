package behavioralpattern.command;

/**
 * @auther: YangChegn
 * @program:设计模式
 * @title: CommandMain
 * @description: 命令模式主函数
 * @data 2020/8/18 0018 18:32
 */
public class CommandMain {

    public static void main(String[] args) {
        Command cmd=new ConcreteCommand();
        Invoker ir=new Invoker(cmd);
        System.out.println("调用者调用call方法");
        ir.call();
    }
}
