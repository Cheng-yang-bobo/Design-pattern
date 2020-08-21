package structuralpattern.composite;

/**
 * @auther: YangChegn
 * @program:设计模式
 * @title: CompositeMain
 * @description: 组合模式主函数
 * @data 2020/8/12 0012 19:07
 */
public class CompositeMain {
    public static void main(String[] args) {

        Component c0=new Composite("0");
        Component c1=new Composite("1");
        Component leaf1=new Leaf("1");
        Component leaf2=new Leaf("2");
        Component leaf3=new Leaf("3");
        c0.add(leaf1);
        c0.add(c1);
        c1.add(leaf2);
        c1.add(leaf3);
        c0.operation();
    }
}
