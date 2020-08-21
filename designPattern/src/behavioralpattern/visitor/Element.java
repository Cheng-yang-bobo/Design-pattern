package behavioralpattern.visitor;

/**
 * @auther: YangChegn
 * @program:设计模式
 * @title: Element
 * @description: 抽象元素类接口
 * @data 2020/8/20 0020 15:54
 */
public interface Element {

    void accept(Visitor visitor);

}
