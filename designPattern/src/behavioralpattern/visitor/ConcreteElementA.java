package behavioralpattern.visitor;

/**
 * @auther: YangChegn
 * @program:设计模式
 * @title: ConcreteElementA
 * @description: 具体元素A
 * @data 2020/8/20 0020 15:55
 */
public class ConcreteElementA implements Element{
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public String operationA( ){
        return "具体元素操作A";
    }
}
