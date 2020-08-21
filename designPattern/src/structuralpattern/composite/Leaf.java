package structuralpattern.composite;

/**
 * @auther: YangChegn
 * @program:设计模式
 * @title: Leaf
 * @description: 树叶构件
 * @data 2020/8/13 0013 9:14
 */
public class Leaf implements Component{
    private String name;
    public Leaf(String name){
        System.out.println(name+"叶子结点被创建");
        this.name="树叶构件"+name;
    }

    @Override
    public void add(Component c) {

    }

    @Override
    public void remove(Component c) {

    }

    @Override
    public Component getChild(int i) {
        return null;
    }


    @Override
    public void operation() {
        System.out.println(name+"：被访问！");
    }

    @Override
    public String getName() {
        return name;
    }
}
