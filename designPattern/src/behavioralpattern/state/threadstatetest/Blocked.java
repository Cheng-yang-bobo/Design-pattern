package behavioralpattern.state.threadstatetest;

/**
 * @auther: YangChegn
 * @program:设计模式
 * @title: Blocked
 * @description: 具体状态类:阻塞状态
 * @data 2020/8/19 0019 15:50
 */
public class Blocked extends ThreadState{
    public Blocked()
    {
        stateName="阻塞状态";
        System.out.println("当前线程处于：阻塞状态.");
    }
    public void resume(ThreadContext hj)
    {
        System.out.print("调用resume()方法-->");
        if(stateName.equals("阻塞状态"))
        {
            hj.setState(new Runnable());
        }
        else
        {
            System.out.println("当前线程不是阻塞状态，不能调用resume()方法.");
        }
    }
}
