package structuralpattern.bridge;

/**
 * @auther: YangChegn
 * @program:设计模式
 * @title: Abstraction
 * @description: 抽象化角色
 * @data 2020/8/7 0007 13:33
 */
abstract class Abstraction {
    protected Implementor implementor;

    protected Abstraction(Implementor implementor) {
        this.implementor = implementor;
    }

    public abstract void Operation0();

    public abstract void Operation1();

    public abstract void Operation2();
}
