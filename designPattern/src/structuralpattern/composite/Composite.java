package structuralpattern.composite;

import java.util.ArrayList;
import java.util.Objects;

/**
 * @auther: YangChegn
 * @program:设计模式
 * @title: Composite
 * @description: 树枝构件
 * @data 2020/8/13 0013 9:16
 */
public class Composite implements Component{
    private ArrayList<Component> childer=new ArrayList<>();
    private String name;
    Composite(String name){
        System.out.println(name+"树枝构件创建");
        this.name="树枝构件"+name;
    }

    @Override
    public void add(Component c) {
        System.out.println(name+"添加"+c.getName());
        childer.add(c);
    }

    @Override
    public void remove(Component c) {
        childer.remove(c);
    }

    @Override
    public Component getChild(int i) {
        return childer.get(i);
    }

    @Override
    public void operation() {
        System.out.println("遍历"+name);
        for (Component obj:childer){
                obj.operation();
        }
    }

    @Override
    public String getName() {
        return name;
    }
}
