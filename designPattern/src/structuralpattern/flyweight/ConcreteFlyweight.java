package structuralpattern.flyweight;

/**
 * @auther: YangChegn
 * @program:设计模式
 * @title: ConcreteFlyweight
 * @description: 具体享元角色
 * @data 2020/8/11 0011 10:12
 */
public class ConcreteFlyweight implements Flyweight{


    private  String key;

    ConcreteFlyweight(String key){
        this.key=key;
        System.out.println("具体享元角色"+key+"被创建！");
    }

    @Override
    public void operation(UnsharedConcreteFlyweight state) {
        System.out.println("具体享元角色"+key+"被使用！");
        System.out.println("非享元信息是:"+state.getInfo());
    }
}
