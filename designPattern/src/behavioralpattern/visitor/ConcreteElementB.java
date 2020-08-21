package behavioralpattern.visitor;

/**
 * @auther: YangChegn
 * @program:设计模式
 * @title: ConcreteElementB
 * @description: 具体访问元素B
 * @data 2020/8/20 0020 15:57
 */
public class ConcreteElementB implements Element {

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public String operationB() {
        return "具体元素B的操作。";
    }
}
