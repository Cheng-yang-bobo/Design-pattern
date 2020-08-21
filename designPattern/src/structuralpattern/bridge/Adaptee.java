package structuralpattern.bridge;

/**
 * @auther: YangChegn
 * @program:设计模式
 * @title: Adaptee
 * @description: 适配者
 * @data 2020/8/7 0007 13:54
 */
public class Adaptee {
    public void specificRequrest() {
        System.out.println("适配者被访问,执行高阶操作");
    }
}
