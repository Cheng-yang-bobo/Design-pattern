package behavioralpattern.state;

/**
 * @auther: YangChegn
 * @program:设计模式
 * @title: StateClientMain
 * @description: 状态模式
 * @data 2020/8/19 0019 15:11
 */
public class StateClientMain {
    public static void main(String[] args) {
        Context context=new Context();

        context.Handle();
        context.Handle();
        context.Handle();
        context.Handle();
    }
}
