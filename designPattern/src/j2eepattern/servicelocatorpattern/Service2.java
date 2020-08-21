package j2eepattern.servicelocatorpattern;

/**
 * @author: YangChegn
 * @program:设计模式
 * @title: Service2
 * @description: 实体服务2
 * @data 2020/8/21 0021 14:55
 */
public class Service2 implements Service {

    @Override
    public String getName() {
        return "Service2";
    }

    @Override
    public void execute() {
        System.out.println("Executing Service2");
    }
}
