package behavioralpattern.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @auther: YangChegn
 * @program:设计模式
 * @title: ConcreteAggregate
 * @description: 具体聚合
 * @data 2020/8/20 0020 14:44
 */
public class ConcreteAggregate implements Aggregate{

    private List<Object> list=new ArrayList<>();

    @Override
    public void add(Object obj) {
        list.add(obj);
        System.out.println("具体聚合list新增");
    }

    @Override
    public void remove(Object obj) {
        list.remove(obj);
        System.out.println("具体聚合list删除");
    }

    @Override
    public Iterator getIterator() {
        return new ConcreteIterator(list);
    }
}
