package structuralpattern.adapter.twowayadapter;

/**
 * @auther: YangChegn
 * @program:设计模式
 * @title: AdapteeRealize
 * @description: 双向适配器适配者实现
 * @data 2020/8/6 0006 11:49
 */
public class AdapteeRealize implements TwoWayAdaptee{
    @Override
    public void specificRequest() {
        System.out.println("适配者代码被调用!");
    }
}
