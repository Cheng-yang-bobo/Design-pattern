package behavioralpattern.chainofresponsibility;

/**
 * @auther: YangChegn
 * @program:设计模式
 * @title: ConcreteHandler2
 * @description: 具体处理者角色2
 * @data 2020/8/19 0019 11:32
 */
public class ConcreteHandler2 extends Handler{

    private String two="two";


    @Override
    public void handleRequest(String request) {
        if(two.equals(request))
        {
            System.out.println("具体处理者2负责处理该请求！");
        }
        else
        {
            if(getNext()!=null)
            {
                getNext().handleRequest(request);
            }
            else
            {
                System.out.println("没有人处理该请求！");
            }
        }
    }
}
