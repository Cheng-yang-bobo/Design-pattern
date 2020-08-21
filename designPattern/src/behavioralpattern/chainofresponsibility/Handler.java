package behavioralpattern.chainofresponsibility;

/**
 * @auther: YangChegn
 * @program:设计模式
 * @title: Handler
 * @description: 抽象处理者角色
 * @data 2020/8/19 0019 11:24
 */
abstract class Handler {
    private  Handler next;

    public Handler getNext() {
        return next;
    }

    public void setNext(Handler next) {
        this.next = next;
    }

    public abstract void handleRequest(String request);
}
