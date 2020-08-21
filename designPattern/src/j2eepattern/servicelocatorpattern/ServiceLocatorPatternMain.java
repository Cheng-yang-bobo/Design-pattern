package j2eepattern.servicelocatorpattern;

/**
 * @author: YangChegn
 * @program:设计模式
 * @title: ServiceLocatorPatternMain
 * @description: 服务定位器模式
 * @data 2020/8/21 0021 14:53
 */
public class ServiceLocatorPatternMain {
    public static void main(String[] args) {
        Service service = ServiceLocator.getService("Service1");
        service.execute();
        service = ServiceLocator.getService("Service2");
        service.execute();
        service = ServiceLocator.getService("Service1");
        service.execute();
        service = ServiceLocator.getService("Service2");
        service.execute();
    }
}

