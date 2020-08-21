package behavioralpattern.state.threadstatetest;

/**
 * @auther: YangChegn
 * @program:设计模式
 * @title: Dead
 * @description: 具体状态类：死亡状态
 * @data 2020/8/19 0019 15:50
 */
public class Dead extends ThreadState{
    public Dead()
    {
        stateName="死亡状态";
        System.out.println("当前线程处于：死亡状态.");
    }
}
