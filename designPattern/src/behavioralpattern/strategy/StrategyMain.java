package behavioralpattern.strategy;

/**
 * @auther: YangChegn
 * @program:设计模式
 * @title: StrategyMain
 * @description: 策略模式主函数
 * @data 2020/8/17 0017 17:38
 */
public class StrategyMain {
    public static void main(String[] args) {
        Context c=new Context();
        Strategy s=new ConcreteStrategyA();
        c.setStrategy(s);
        c.strategyMethod();
        System.out.println("-----------------");
        s=new ConcreteStrategyB();
        c.setStrategy(s);
        c.strategyMethod();
    }
}
