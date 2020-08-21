package behavioralpattern.template.hook;

/**
 * @auther: YangChegn
 * @program:设计模式
 * @title: HookAbstractClass
 * @description: 含钩子的抽象类
 * @data 2020/8/14 0014 19:15
 */
abstract class HookAbstractClass {
    public void TemplateMethod() //模板方法
    {
        abstractMethod1();
        HookMethod1();
        if (HookMethod2()) {
            SpecificMethod();
        }
        abstractMethod2();
    }

    public void SpecificMethod() //具体方法
    {
        System.out.println("抽象类中的具体方法被调用...");
    }

    public void HookMethod1() {
    }  //钩子方法1

    public boolean HookMethod2() //钩子方法2
    {
        return true;
    }

    public abstract void abstractMethod1(); //抽象方法1

    public abstract void abstractMethod2(); //抽象方法2
}
