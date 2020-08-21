package behavioralpattern.state.scorestate;

/**
 * @auther: YangChegn
 * @program:设计模式
 * @title: MiddleState
 * @description: 具体状态类：中等
 * @data 2020/8/19 0019 15:35
 */
public class MiddleState extends AbstractState{
    public MiddleState(AbstractState state)
    {
        hj=state.hj;
        stateName="中等";
        score=state.score;
    }

    @Override
    public void checkState()
    {
        if(score<60)
        {
            hj.setState(new LowState(this));
        }
        else if(score>=90)
        {
            hj.setState(new HighState(this));
        }
    }
}
