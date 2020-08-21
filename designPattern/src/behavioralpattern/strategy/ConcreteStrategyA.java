package behavioralpattern.strategy;

/**
 * @auther: YangChegn
 * @program:设计模式
 * @title: ConcreteStrategyA
 * @description: 具体策略A
 * @data 2020/8/17 0017 18:50
 */
public class ConcreteStrategyA implements Strategy{
    @Override
    public void strategyMethod() {
        System.out.println("具体策略A方法被访问");
    }
}
