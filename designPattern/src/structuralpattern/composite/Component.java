package structuralpattern.composite;

/**
 * @auther: YangChegn
 * @program:设计模式
 * @title: Component
 * @description: 抽象构建
 * @data 2020/8/13 0013 9:12
 */
public interface Component {

     void add(Component c);

     void remove(Component c);

     Component getChild(int i);

     void operation();

     String getName();

}
