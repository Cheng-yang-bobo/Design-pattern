package structuralpattern.proxy;

/**
 * @auther: YangChegn
 * @program:设计模式
 * @title: RealSubject
 * @description: 真实主题
 * @data 2020/8/5 0005 19:39
 */
public class RealSubject implements Subject{
    @Override
    public void Request() {
        System.out.println("访问真实主题");
    }
}
