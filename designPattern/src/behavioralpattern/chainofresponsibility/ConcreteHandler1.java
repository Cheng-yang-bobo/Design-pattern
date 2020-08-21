package behavioralpattern.chainofresponsibility;

import java.util.Objects;

/**
 * @auther: YangChegn
 * @program:设计模式
 * @title: ConcreteHandler1
 * @description: 具体处理者1
 * @data 2020/8/19 0019 11:26
 */
public class ConcreteHandler1 extends Handler {

    private String one = "one";


    @Override
    public void handleRequest(String request) {
        if (one.equals(request)) {
            System.out.println("具体处理者1开始处理请求！");
        } else {
            if (!Objects.isNull(getNext())) {
                getNext().handleRequest(request);
            } else {
                System.out.println("没有人处理该请求!");
            }
        }
    }
}
