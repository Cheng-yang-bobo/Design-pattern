package behavioralpattern.state.scorestate;

/**
 * @auther: YangChegn
 * @program:设计模式
 * @title: LowState
 * @description: 具体状态类不及格
 * @data 2020/8/19 0019 15:34
 */
public class LowState extends AbstractState{
    public LowState(ScoreContext h)
    {
        hj=h;
        stateName="不及格";
        score=0;
    }
    public LowState(AbstractState state)
    {
        hj=state.hj;
        stateName="不及格";
        score=state.score;
    }
    @Override
    public void checkState()
    {
        if(score>=90)
        {
            hj.setState(new HighState(this));
        }
        else if(score>=60)
        {
            hj.setState(new MiddleState(this));
        }
    }
}
