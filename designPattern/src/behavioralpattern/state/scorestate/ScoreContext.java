package behavioralpattern.state.scorestate;

/**
 * @auther: YangChegn
 * @program:设计模式
 * @title: ScoreContext
 * @description: 环境类
 * @data 2020/8/19 0019 15:32
 */
public class ScoreContext {

    private AbstractState state;


    ScoreContext()
    {
        state=new LowState(this);
    }
    public void setState(AbstractState state)
    {
        this.state=state;
    }
    public AbstractState getState()
    {
        return state;
    }
    public void add(int score)
    {
        state.addScore(score);
    }
}
