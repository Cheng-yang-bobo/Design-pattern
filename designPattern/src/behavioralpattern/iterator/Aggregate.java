package behavioralpattern.iterator;

/**
 * @auther: YangChegn
 * @program:设计模式
 * @title: Aggregate
 * @description: 抽象聚合接口
 * @data 2020/8/20 0020 14:43
 */
public interface Aggregate {


    public void add(Object obj);
    public void remove(Object obj);
    public Iterator getIterator();

}
