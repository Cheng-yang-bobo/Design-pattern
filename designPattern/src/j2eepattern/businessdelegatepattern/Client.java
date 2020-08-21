package j2eepattern.businessdelegatepattern;

/**
 * @author: YangChegn
 * @program:设计模式
 * @title: Client
 * @description: 客户端
 * @data 2020/8/21 0021 10:51
 */
public class Client {
    BusinessDelegate businessService;

    public Client(BusinessDelegate businessService) {
        this.businessService = businessService;
    }

    public void doTask() {
        businessService.doTask();
    }
}
