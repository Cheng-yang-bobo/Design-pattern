package behavioralpattern.state.scorestate;

/**
 * @auther: YangChegn
 * @program:设计模式
 * @title: AbstractState
 * @description: 抽象状态类
 * @data 2020/8/19 0019 15:32
 */
public abstract class AbstractState {
    /**
     * 环境
     */
    protected ScoreContext hj;
    /**
     *状态名
     */
    protected String stateName;
    /**
     *分数
     */
    protected int score;
    /**
     * 检查当前状态
     */
    public abstract void checkState();

    public void addScore(int x)
    {
        score+=x;
        System.out.print("加上："+x+"分，\t当前分数："+score );
        checkState();
        System.out.println("分，\t当前状态："+hj.getState().stateName);
    }

}
