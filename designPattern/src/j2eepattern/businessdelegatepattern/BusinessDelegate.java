package j2eepattern.businessdelegatepattern;

/**
 * @author: YangChegn
 * @program:设计模式
 * @title: BusinessDelegate
 * @description: 业务代表
 * @data 2020/8/21 0021 10:51
 */
public class BusinessDelegate {

    private BusinessLookUp lookupService = new BusinessLookUp();
    private BusinessService businessService;
    private String serviceType;

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public void doTask() {
        businessService = lookupService.getBusinessService(serviceType);
        businessService.doProcessing();
    }
}
