package behavioralpattern.state.scorestate;

/**
 * @auther: YangChegn
 * @program:设计模式
 * @title: HighState
 * @description: 具体状态类：优秀
 * @data 2020/8/19 0019 15:35
 */
public class HighState extends AbstractState{
    public HighState(AbstractState state)
    {
        hj=state.hj;
        stateName="优秀";
        score=state.score;
    }
    @Override
    public void checkState()
    {
        if(score<60)
        {
            hj.setState(new LowState(this));
        }
        else if(score<90)
        {
            hj.setState(new MiddleState(this));
        }
    }
}
