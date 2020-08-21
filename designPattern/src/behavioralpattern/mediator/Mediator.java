package behavioralpattern.mediator;

/**
 * @auther: YangChegn
 * @program:设计模式
 * @title: Mediator
 * @description: 抽象中介者
 * @data 2020/8/20 0020 14:03
 */
public abstract class Mediator {

    /***
     * @Param []
     * @description 注册
     * @author YangCheng
     * @date 2020/8/20 0020 14:08
     * @return void
     * @throws
     */
    public abstract void register(Colleague colleague);

    /***
     * @Param []
     * @description 转发
     * @author YangCheng
     * @date 2020/8/20 0020 14:08
     * @return void
     * @throws
     */
    public abstract void relay(Colleague colleague);

}
