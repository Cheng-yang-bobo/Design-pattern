package behavioralpattern.command.macroscommand;

/**
 * @auther: YangChegn
 * @program:设计模式
 * @title: MacrosMain
 * @description: 宏命令模式
 * @data 2020/8/18 0018 19:05
 */
public class MacrosMain {
    public static void main(String[] args) {
        AbstractCommand cmd1=new ConcreteCommand1();
        AbstractCommand cmd2=new ConcreteCommand2();
        CompositeInvoker ir=new CompositeInvoker();
        ir.add(cmd1);
        ir.add(cmd2);
        System.out.println("客户访问调用者的execute()方法...");
        ir.execute();
    }
}
