package j2eepattern.businessdelegatepattern;

/**
 * @author: YangChegn
 * @program:设计模式
 * @title: BusinessLookUp
 * @description: 创建业务查询服务
 * @data 2020/8/21 0021 10:50
 */
public class BusinessLookUp {

    public BusinessService getBusinessService(String serviceType) {

        if (serviceType.equalsIgnoreCase("EJB")) {
            return new EJBService();
        } else {
            return new JMSService();
        }

    }
}
