package structuralpattern.flyweight;

/**
 * @auther: YangChegn
 * @program:设计模式
 * @title: UnsharedConcreteFlyweight
 * @description: 非享元角色
 * @data 2020/8/11 0011 10:09
 */
public class UnsharedConcreteFlyweight {
    private String info;

    UnsharedConcreteFlyweight(String info) {
        this.info = info;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
