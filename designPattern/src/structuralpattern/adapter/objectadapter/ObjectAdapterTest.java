package structuralpattern.adapter.objectadapter;

/**
 * @auther: YangChegn
 * @program:设计模式
 * @title: ObjectAdapterTest
 * @description: 对象结构模式适配器
 * @data 2020/8/6 0006 11:18
 */
public class ObjectAdapterTest {
    public static void main(String[] args) {
        System.out.println("对象结构模式测试");
        Adaptee adaptee = new Adaptee();
        Traget traget = new ObjectAdapter(adaptee);
        traget.request();
    }
}
