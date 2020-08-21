package j2eepattern.servicelocatorpattern;

/**
 * @author: YangChegn
 * @program:设计模式
 * @title: InitialContext
 * @description: 上下文
 * @data 2020/8/21 0021 14:56
 */
public class InitialContext {
    public Object lookup(String jndiName) {
        if (jndiName.equalsIgnoreCase("SERVICE1")) {
            System.out.println("Looking up and creating a new Service1 object");
            return new Service1();
        } else if (jndiName.equalsIgnoreCase("SERVICE2")) {
            System.out.println("Looking up and creating a new Service2 object");
            return new Service2();
        }
        return null;
    }
}
