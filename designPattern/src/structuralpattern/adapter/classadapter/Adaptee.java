package structuralpattern.adapter.classadapter;

/**
 * @auther: YangChegn
 * @program:设计模式
 * @title: Adaptee
 * @description: 适配者
 * @data 2020/8/6 0006 10:37
 */
public class Adaptee {

    Adaptee() {
        System.out.println("父类适配者构造");
    }

    public void specificRequest() {
        System.out.println("适配者中的业务代码被调用");
    }
}
