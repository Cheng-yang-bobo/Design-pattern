package behavioralpattern.state.flyweightstatepattern;

/**
 * @auther: YangChegn
 * @program:设计模式
 * @title: FlyweightStatePattern
 * @description: 状态共享--状态模式升级版
 * @data 2020/8/19 0019 16:12
 */
public class FlyweightStatePattern {
    public static void main(String[] args) {
        ShareContext context=new ShareContext();

        context.Handle();
        context.Handle();
        context.Handle();
        context.Handle();
    }
}
