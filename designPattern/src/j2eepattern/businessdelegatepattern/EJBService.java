package j2eepattern.businessdelegatepattern;

/**
 * @author: YangChegn
 * @program:设计模式
 * @title: EJBService
 * @description: EJB服务实体
 * @data 2020/8/21 0021 10:47
 */
public class EJBService implements BusinessService {
    @Override
    public void doProcessing() {
        System.out.println("Processing task by invoking EJB Service");
    }
}
