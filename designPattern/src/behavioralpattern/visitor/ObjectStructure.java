package behavioralpattern.visitor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @auther: YangChegn
 * @program:设计模式
 * @title: ObjectStructure
 * @description: 对象结构角色
 * @data 2020/8/20 0020 15:58
 */
public class ObjectStructure {

    private List<Element> list = new ArrayList<>();

    public void accept(Visitor visitor) {
        Iterator<Element> i = list.iterator();
        while (i.hasNext()) {
            (i.next()).accept(visitor);
        }
    }

    public void add(Element element) {
        list.add(element);
    }

    public void remove(Element element) {
        list.remove(element);
    }
}
