package j2eepattern.servicelocatorpattern;

/**
 * @author: YangChegn
 * @program:设计模式
 * @title: ServiceLocator
 * @description: 服务定位器
 * @data 2020/8/21 0021 14:57
 */
public class ServiceLocator {
    private static Cache cache;

    static {
        cache = new Cache();
    }

    public static Service getService(String jndiName) {

        Service service = cache.getService(jndiName);

        if (service != null) {
            return service;
        }

        InitialContext context = new InitialContext();
        Service service1 = (Service) context.lookup(jndiName);
        cache.addService(service1);
        return service1;
    }
}
