package behavioralpattern.command;

/**
 * @auther: YangChegn
 * @program:设计模式
 * @title: Invoker
 * @description: 调用者
 * @data 2020/8/18 0018 18:32
 */
public class Invoker {
    private Command command;
    public Invoker(Command command){
        this.command=command;
    }

    public Command getCommand() {
        return command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void call( ){
        System.out.println("调用执行者命令command...");
        command.execute();
    }
}
