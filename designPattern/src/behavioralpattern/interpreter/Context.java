package behavioralpattern.interpreter;

/**
 * @author: YangChegn
 * @program:设计模式
 * @title: Context
 * @description: 环境类
 * @data 2020/8/20 0020 18:48
 */
public class Context {
    private AbstractExpression exp;

    private String[] citys={"韶关","广州"};
    private String[] persons={"老人","妇女","儿童"};
    private AbstractExpression cityPerson;
    public Context()
    {
        AbstractExpression city=new TerminalExpression(citys);
        AbstractExpression person=new TerminalExpression(persons);
        cityPerson=new NonterminalExpression(city,person);
    }
    public void freeRide(String info)
    {
        boolean ok=cityPerson.interpret(info);
        if(ok) System.out.println("您是"+info+"，您本次乘车免费！");
        else System.out.println(info+"，您不是免费人员，本次乘车扣费2元！");
    }
}
