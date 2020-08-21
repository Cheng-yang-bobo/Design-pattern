package structuralpattern.bridge;

/**
 * @auther: YangChegn
 * @program:设计模式
 * @title: ConcreteImplementorA
 * @description: 具体实现化角色A--升级过配合适配器使用
 * @data 2020/8/7 0007 13:32
 */
public class ConcreteImplementorA implements Implementor{

    private Adaptee adaptee;

    ConcreteImplementorA(Adaptee adaptee){
        this.adaptee=adaptee;
    }

    @Override
    public void OperationImpl() {
        System.out.println("具体实现化(Concrete Implementor)角色被访问");
        adaptee.specificRequrest();
    }
}
