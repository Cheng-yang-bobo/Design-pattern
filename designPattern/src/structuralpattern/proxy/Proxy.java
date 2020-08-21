package structuralpattern.proxy;

/**
 * @auther: YangChegn
 * @program:设计模式
 * @title: Proxy
 * @description: 代理类
 * @data 2020/8/5 0005 19:40
 */
public class Proxy implements Subject {

    private RealSubject realSubject;

    @Override
    public void Request() {
        if (realSubject == null) {
            realSubject = new RealSubject();
        }
        befereRequest();
        realSubject.Request();
        afterRequest();
    }

    public void befereRequest() {
        System.out.println("访问主题前置操作");
    }

    public void afterRequest() {
        System.out.println("访问主题后置操作");
    }
}
