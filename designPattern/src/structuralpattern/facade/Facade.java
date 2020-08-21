package structuralpattern.facade;

/**
 * @auther: YangChegn
 * @program:设计模式
 * @title: Facade
 * @description: 外观角色
 * @data 2020/8/10 0010 19:02
 */
public class Facade {

    private Subsystem01 obj1=new Subsystem01();

    private Subsystem02 obj2=new Subsystem02();

    private Subsystem03 obj3=new Subsystem03();


    public void method(){
        obj1.method1();
        obj2.method2();
        obj3.method3();
    }
}
