package structuralpattern.bridge;

/**
 * @auther: YangChegn
 * @program:设计模式
 * @title: RefinedAbstraction
 * @description: 拓展抽象化角色
 * @data 2020/8/7 0007 13:34
 */
public class RefinedAbstraction extends Abstraction{

    protected RefinedAbstraction(Implementor implementor) {
        super(implementor);
        System.out.println("加工");
    }

    @Override
    public void Operation0() {
        System.out.println("拓展抽象化(Refined Abstraction)角色被访问");
        implementor.OperationImpl();
        System.out.println("执行操作0");
    }

    @Override
    public void Operation1() {
        System.out.println("拓展抽象化(Refined Abstraction)角色被访问");
        implementor.OperationImpl();
        System.out.println("执行操作1");
    }

    @Override
    public void Operation2() {
        System.out.println("拓展抽象化(Refined Abstraction)角色被访问");
        implementor.OperationImpl();
        System.out.println("执行操作2");
    }
}
