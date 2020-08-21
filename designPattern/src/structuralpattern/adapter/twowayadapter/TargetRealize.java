package structuralpattern.adapter.twowayadapter;

/**
 * @auther: YangChegn
 * @program:设计模式
 * @title: TargetRealize
 * @description: 双向适配器目标实现
 * @data 2020/8/6 0006 11:48
 */
public class TargetRealize implements TwoWayTarget{

    @Override
    public void request() {
        System.out.println("目标代码被调用");
    }
}
