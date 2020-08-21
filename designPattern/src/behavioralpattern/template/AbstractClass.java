package behavioralpattern.template;

/**
 * @auther: YangChegn
 * @program:设计模式
 * @title: AbstractClass
 * @description: 抽象类
 * @data 2020/8/14 0014 19:02
 */
abstract class AbstractClass {
    public void TemplateMethod(){
        SpecofocMethod();
        abstractMethod1();
        abstractMethod2();
    }

    /***
     * @Param []
     * @description 具体方法
     * @author YangCheng
     * @date 2020/8/14 0014 19:04
     * @return void
     */
    public void SpecofocMethod(){
        System.out.println("抽象类的具体方法被调用");
    }

    /***
     * @Param []
     * @description 抽象方法一
     * @author YangCheng
     * @date 2020/8/14 0014 19:06
     * @return void
     */
    public abstract void abstractMethod1();

    /***
     * @Param []
     * @description 抽象方法2
     * @author YangCheng
     * @date 2020/8/14 0014 19:05
     * @return void
     */
    public abstract void abstractMethod2();
}
