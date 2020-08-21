package structuralpattern.adapter.twowayadapter;

/**
 * @auther: YangChegn
 * @program:设计模式
 * @title: TwoWayAdapter
 * @description: 双向适配器
 * @data 2020/8/6 0006 11:51
 */
public class TwoWayAdapter implements TwoWayAdaptee, TwoWayTarget {
    private TwoWayTarget target;
    private TwoWayAdaptee adaptee;


    public TwoWayAdapter(TwoWayTarget target) {
        this.target = target;
    }

    public TwoWayAdapter(TwoWayAdaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void specificRequest() {
        target.request();
    }

    @Override
    public void request() {
        adaptee.specificRequest();
    }
}
