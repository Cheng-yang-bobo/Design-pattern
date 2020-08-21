package j2eepattern.businessdelegatepattern;

/**
 * @author: YangChegn
 * @program:设计模式
 * @title: BusinessDelegatePatternMain
 * @description: 业务代表模式
 * @data 2020/8/21 0021 10:46
 */
public class BusinessDelegatePatternMain {
    public static void main(String[] args) {
        BusinessDelegate businessDelegate = new BusinessDelegate();
        Client client = new Client(businessDelegate);

        businessDelegate.setServiceType("EJB");
        client.doTask();

        businessDelegate.setServiceType("JMS");
        client.doTask();
    }
}
