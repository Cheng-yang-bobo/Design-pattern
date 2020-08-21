package behavioralpattern.visitor;

/**
 * @auther: YangChegn
 * @program:设计模式
 * @title: ConcreteVisitorA
 * @description: 具体访问者类A
 * @data 2020/8/20 0020 15:58
 */
public class ConcreteVisitorA implements Visitor{
    @Override
    public void visit(ConcreteElementA element) {
        System.out.println("具体访问者A访问-->"+element.operationA());
    }

    @Override
    public void visit(ConcreteElementB element) {
        System.out.println("具体访问者A访问-->"+element.operationB());
    }
}
