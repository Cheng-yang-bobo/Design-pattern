package behavioralpattern.state.flyweightstatepattern;

import java.util.HashMap;

/**
 * @auther: YangChegn
 * @program:设计模式
 * @title: ShareContext
 * @description: 环境类
 * @data 2020/8/19 0019 16:12
 */
public class ShareContext {

    private ShareState state;
    private HashMap<String, ShareState> stateSet=new HashMap<String, ShareState>();
    public ShareContext()
    {
        state=new ConcreteState1();
        stateSet.put("1", state);
        state=new ConcreteState2();
        stateSet.put("2", state);
        state=getState("1");
    }
    //设置新状态
    public void setState(ShareState state)
    {
        this.state=state;
    }
    //读取状态
    public ShareState getState(String key)
    {
        ShareState s=(ShareState)stateSet.get(key);
        return s;
    }
    //对请求做处理
    public void Handle()
    {
        state.Handle(this);
    }
}
