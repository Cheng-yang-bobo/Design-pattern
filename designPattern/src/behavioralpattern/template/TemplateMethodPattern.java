package behavioralpattern.template;

/**
 * @auther: YangChegn
 * @program:设计模式
 * @title: TemplateMethodPattern
 * @description: 模板模式主函数
 * @data 2020/8/14 0014 19:02
 */
public class TemplateMethodPattern {
    public static void main(String[] args) {
        AbstractClass tm=new ConcreteClass();
        tm.TemplateMethod();
    }
}
