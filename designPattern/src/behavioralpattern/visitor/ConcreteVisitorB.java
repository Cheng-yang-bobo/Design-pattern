package behavioralpattern.visitor;

/**
 * @auther: YangChegn
 * @program:设计模式
 * @title: ConcreteVisitorB
 * @description: 具体访问者B
 * @data 2020/8/20 0020 15:59
 */
public class ConcreteVisitorB implements Visitor{

    @Override
    public void visit(ConcreteElementA element) {
        System.out.println("具体访问者B访问-->"+element.operationA());
    }

    @Override
    public void visit(ConcreteElementB element) {
        System.out.println("具体访问者B访问-->"+element.operationB());
    }
}
