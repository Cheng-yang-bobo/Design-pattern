package structuralpattern.adapter.classadapter;

/**
 * @auther: YangChegn
 * @program:设计模式
 * @title: ClassAdapter
 * @description: 类适配器类
 * @data 2020/8/6 0006 10:56
 */
public class ClassAdapter extends Adaptee implements Traget {

    ClassAdapter() {
        System.out.println("类适配器类的子类构造函数");
    }

    @Override
    public void request() {
        specificRequest();
    }
}
