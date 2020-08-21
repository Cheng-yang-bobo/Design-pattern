package structuralpattern.adapter.twowayadapter;

/**
 * @auther: YangChegn
 * @program:设计模式
 * @title: TwoWayAdapterTest
 * @description: 双向适配器实现
 * @data 2020/8/6 0006 11:44
 */
public class TwoWayAdapterTest {
    public static void main(String[] args) {
        System.out.println("目标通过双向适配器访问适配者：");
        TwoWayAdaptee adaptee = new AdapteeRealize();
        TwoWayTarget target = new TwoWayAdapter(adaptee);
        target.request();
        System.out.println("-------------------");
        System.out.println("适配者通过双向适配器访问目标：");
        target = new TargetRealize();
        adaptee = new TwoWayAdapter(target);
        adaptee.specificRequest();
    }
}
