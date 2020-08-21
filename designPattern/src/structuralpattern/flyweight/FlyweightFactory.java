package structuralpattern.flyweight;

import java.util.HashMap;

/**
 * @auther: YangChegn
 * @program:设计模式
 * @title: FlyweightFactory
 * @description: 享元工厂角色
 * @data 2020/8/11 0011 10:18
 */
public class FlyweightFactory {
    private HashMap<String, Flyweight> flyweights = new HashMap<>();

    public Flyweight getFlyweight(String key) {
        Flyweight flyweight = flyweights.get(key);
        if (flyweight != null) {
            System.out.println("具体享元" + key + "已经存在，被成功获取");
        } else {
            flyweight = new ConcreteFlyweight(key);
            flyweights.put(key, flyweight);
        }
        return flyweight;
    }
}
