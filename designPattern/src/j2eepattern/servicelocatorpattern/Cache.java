package j2eepattern.servicelocatorpattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: YangChegn
 * @program:设计模式
 * @title: Cache
 * @description: 缓存
 * @data 2020/8/21 0021 14:56
 */
public class Cache {
    private List<Service> services;

    public Cache() {
        services = new ArrayList<Service>();
    }

    public Service getService(String serviceName) {
        for (Service service : services) {
            if (service.getName().equalsIgnoreCase(serviceName)) {
                System.out.println("Returning cached  " + serviceName + " object");
                return service;
            }
        }
        return null;
    }

    public void addService(Service newService) {
        boolean exists = false;
        for (Service service : services) {
            if (service.getName().equalsIgnoreCase(newService.getName())) {
                exists = true;
            }
        }
        if (!exists) {
            services.add(newService);
        }
    }
}
