package behavioralpattern.state.flyweightstatepattern;

/**
 * @auther: YangChegn
 * @program:设计模式
 * @title: ShareState
 * @description: 状态抽象
 * @data 2020/8/19 0019 16:13
 */
public abstract class ShareState {

    public abstract void Handle(ShareContext context);
}
