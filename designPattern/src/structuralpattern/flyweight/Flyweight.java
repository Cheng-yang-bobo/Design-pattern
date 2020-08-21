package structuralpattern.flyweight;

/**
 * @auther: YangChegn
 * @program:设计模式
 * @title: Flyweight
 * @description: 抽象享元角色
 * @data 2020/8/11 0011 10:11
 */
public interface Flyweight {
    void  operation(UnsharedConcreteFlyweight state);
}
