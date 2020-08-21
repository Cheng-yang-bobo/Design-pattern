package j2eepattern.businessdelegatepattern;

/**
 * @author: YangChegn
 * @program:设计模式
 * @title: JMSService
 * @description: JMSService
 * @data 2020/8/21 0021 10:48
 */
public class JMSService implements BusinessService {

    @Override
    public void doProcessing() {
        System.out.println("Processing task by invoking JMS Service");
    }
}
