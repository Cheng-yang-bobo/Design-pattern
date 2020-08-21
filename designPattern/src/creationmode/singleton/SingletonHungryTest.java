package creationmode.singleton;

/**
 * @Program:designPattern
 * @Title: SingletonHungryTest
 * @Description: 饿汉模式--线程安全
 * @Auther: YangCheng
 * @Create 2020/8/2 0002 17:34
 */
public class SingletonHungryTest {

    private static final SingletonHungryTest instance=new SingletonHungryTest();
    private SingletonHungryTest(){};
    public static SingletonHungryTest getInstance(){
        return instance;
    }
}
