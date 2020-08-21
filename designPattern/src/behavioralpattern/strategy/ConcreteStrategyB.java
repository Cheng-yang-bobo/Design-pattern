package behavioralpattern.strategy;

/**
 * @auther: YangChegn
 * @program:设计模式
 * @title: ConcreteStrategyB
 * @description: 具体策略B
 * @data 2020/8/17 0017 18:51
 */
public class ConcreteStrategyB implements  Strategy{
    @Override
    public void strategyMethod() {
        System.out.println("具体策略B被访问");
    }
}
