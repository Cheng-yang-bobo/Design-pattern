package structuralpattern.adapter.objectadapter;

/**
 * @auther: YangChegn
 * @program:设计模式
 * @title: ObjectAdapter
 * @description: 对象适配器类
 * @data 2020/8/6 0006 11:15
 */
public class ObjectAdapter implements Traget {
    private Adaptee adaptee;

    public ObjectAdapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        adaptee.specificRequest();
    }
}
