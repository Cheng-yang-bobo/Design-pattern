package behavioralpattern.iterator;

/**
 * @auther: YangChegn
 * @program:设计模式
 * @title: Iterator
 * @description: 抽象迭代器
 * @data 2020/8/20 0020 14:44
 */
public interface Iterator {
    Object first();

    Object next();

    boolean hasNext();
}
