package behavioralpattern.interpreter;

/**
 * @author: YangChegn
 * @program:设计模式
 * @title: NonterminalExpression
 * @description: 非终结符号表达式类
 * @data 2020/8/20 0020 18:45
 */
public class NonterminalExpression implements AbstractExpression {

    private AbstractExpression exp1;
    private AbstractExpression exp2;

    private AbstractExpression city = null;
    private AbstractExpression person = null;

    public NonterminalExpression(AbstractExpression city, AbstractExpression person) {
        this.city = city;
        this.person = person;
    }

    @Override
    public boolean interpret(String info) {
        String s[] = info.split("的");
        return city.interpret(s[0]) && person.interpret(s[1]);
    }
}
