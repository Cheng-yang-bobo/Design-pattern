package j2eepattern.servicelocatorpattern;

/**
 * @author: YangChegn
 * @program:设计模式
 * @title: Service1
 * @description: 创建实体服务1
 * @data 2020/8/21 0021 14:54
 */
public class Service1 implements Service {
    @Override
    public String getName() {

        return "Service1";

    }

    @Override
    public void execute() {
        System.out.println("Executing Service1");

    }
}
