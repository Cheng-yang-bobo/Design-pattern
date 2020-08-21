package behavioralpattern.visitor;

/**
 * @auther: YangChegn
 * @program:设计模式
 * @title: Visitor
 * @description: 抽象访问者接口
 * @data 2020/8/20 0020 15:53
 */
public interface Visitor {

    void visit(ConcreteElementA element);
    void visit(ConcreteElementB element);

}
