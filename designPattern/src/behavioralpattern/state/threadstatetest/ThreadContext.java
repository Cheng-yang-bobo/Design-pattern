package behavioralpattern.state.threadstatetest;

/**
 * @auther: YangChegn
 * @program:设计模式
 * @title: ThreadContext
 * @description: 环境类
 * @data 2020/8/19 0019 15:43
 */
public class ThreadContext {

    private ThreadState state;
    ThreadContext()
    {
        state=new New();
    }
    public void setState(ThreadState state)
    {
        this.state=state;
    }
    public ThreadState getState()
    {
        return state;
    }
    public void start()
    {
        ((New) state).start(this);
    }
    public void getCPU()
    {
        ((Runnable) state).getCPU(this);
    }
    public void suspend()
    {
        ((Running) state).suspend(this);
    }
    public void stop()
    {
        ((Running) state).stop(this);
    }
    public void resume()
    {
        ((Blocked) state).resume(this);
    }
}
