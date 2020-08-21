package behavioralpattern.state.threadstatetest;

/**
 * @auther: YangChegn
 * @program:设计模式
 * @title: ThreadStateTest
 * @description: 状态模式线程实践
 * @data 2020/8/19 0019 15:39
 */
public class ThreadStateTest {
    public static void main(String[] args) {
        ThreadContext context=new ThreadContext();

        context.start();
        context.getCPU();
        context.suspend();
        context.resume();
        context.getCPU();
        context.stop();
    }
}
