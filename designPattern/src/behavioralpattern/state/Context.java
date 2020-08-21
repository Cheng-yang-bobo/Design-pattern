package behavioralpattern.state;

/**
 * @auther: YangChegn
 * @program:设计模式
 * @title: Context
 * @description: 环境类
 * @data 2020/8/19 0019 15:12
 */
public class Context {
    private State state;

    public Context(){
        this.state=new ConcreteStateA();
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void Handle(){
        state.Handle(this);
    }


}
