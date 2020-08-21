package behavioralpattern.iterator;

import java.util.List;

/**
 * @auther: YangChegn
 * @program:设计模式
 * @title: ConcreteIterator
 * @description: 具体迭代器
 * @data 2020/8/20 0020 14:46
 */
public class ConcreteIterator implements Iterator {
    private List<Object> list = null;
    private int index = -1;

    public ConcreteIterator(List<Object> list) {
        this.list = list;
    }

    @Override
    public Object first() {
        index = 0;
        Object obj = list.get(index);
        return obj;
    }

    @Override
    public Object next() {
        Object obj = null;
        if (this.hasNext()) {
            obj = list.get(++index);
        }
        return obj;
    }

    @Override
    public boolean hasNext() {
        if (index < list.size() - 1) {
            return true;
        } else {
            return false;
        }
    }
}
