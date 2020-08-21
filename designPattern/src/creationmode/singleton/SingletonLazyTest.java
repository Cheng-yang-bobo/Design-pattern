package creationmode.singleton;

/**
 * @Program:designPattern
 * @Title: SingletonTest
 * @Description: creationMode.singleton test  懒汉模式
 * @Auther: YangCheng
 * @Create 2020/7/31 0031 11:36
 */
public class SingletonLazyTest {

    //保证在所有线程同步
    private static volatile SingletonLazyTest instance = null;

    private SingletonLazyTest() {
    }//防止该方法会在外部进行实例化

    /**
     * @return creationMode.singleton.SingletonLazyTest
     * @throws
     * @Param []
     * @description 单例模式1.0:有现成安全问题
     * @author YangCheng
     * @date 2020/8/1 0001 15:08
     */
    public static SingletonLazyTest getInstance01() {
        if (instance == null) {
            instance = new SingletonLazyTest();
        }
        return instance;
    }

    /**
     * @return creationMode.singleton.SingletonLazyTest
     * @throws
     * @Param []
     * @description 单例模式2.0改动线程安全问题，但是锁方法，每个线程都会阻塞
     * @author YangCheng
     * @date 2020/8/1 0001 15:09
     */
    public static synchronized SingletonLazyTest getInstance02() {
        if (instance == null) {
            instance = new SingletonLazyTest();
        }
        return instance;
    }

    /**
     * @return creationMode.singleton.SingletonLazyTest
     * @throws
     * @Param []
     * @description 单例模式3.0高效锁方式，但是是个优化错误示范，会发生指令重排这就是为什么要加volatile关键词原因
     * @author YangCheng
     * @date 2020/8/1 0001 15:10
     */
    public static SingletonLazyTest getInstance03() {
        if (instance == null) {
            synchronized (SingletonLazyTest.class) {
                if (instance == null) {
                    instance = new SingletonLazyTest();
                }
            }
        }
        return instance;
    }

    /**
     * @author YangCheng
     * @Param []
     * @description 单例模式3.1高效方式，通过虚拟机执行的类构造器的clint方法实现并发控制，阻塞等
     * @date 2020/8/1 0001 15:16
     * @return creationMode.singleton.SingletonLazyTest
     * @throws
     */
    private static class Inner {
        private static SingletonLazyTest instance01 = new SingletonLazyTest();
    }

    public static SingletonLazyTest getInstance04() {
        return Inner.instance01;
    }
}
