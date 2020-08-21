package behavioralpattern.strategy;

/**
 * @auther: YangChegn
 * @program:设计模式
 * @title: Context
 * @description: 环境类
 * @data 2020/8/17 0017 18:51
 */
public class Context {

    private Strategy strategy;

    public Strategy getStrategy() {
        return strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void strategyMethod(){
        strategy.strategyMethod();
    }
}
