package behavioralpattern.template.hook;

/**
 * @auther: YangChegn
 * @program:设计模式
 * @title: HookConcreteClass
 * @description: 含钩子的具体实现类
 * @data 2020/8/14 0014 19:16
 */
public class HookConcreteClass extends HookAbstractClass {
    @Override
    public void abstractMethod1() {
        System.out.println("抽象方法1的实现被调用...");
    }

    @Override
    public void abstractMethod2() {
        System.out.println("抽象方法2的实现被调用...");
    }

    @Override
    public void HookMethod1() {
        System.out.println("钩子方法1被重写...");
    }

    @Override
    public boolean HookMethod2() {
        return false;
    }
}
