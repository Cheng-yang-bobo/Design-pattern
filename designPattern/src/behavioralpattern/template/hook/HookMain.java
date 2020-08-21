package behavioralpattern.template.hook;

/**
 * @auther: YangChegn
 * @program:设计模式
 * @title: HookMain
 * @description: 钩子主函数
 * @data 2020/8/14 0014 19:15
 */
public class HookMain {

    public static void main(String[] args) {
        HookAbstractClass tm=new HookConcreteClass();
        tm.TemplateMethod();
    }
}
