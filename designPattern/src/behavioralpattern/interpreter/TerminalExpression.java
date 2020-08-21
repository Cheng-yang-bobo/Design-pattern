package behavioralpattern.interpreter;

import java.util.HashSet;
import java.util.Set;

/**
 * @author: YangChegn
 * @program:设计模式
 * @title: TerminalExpression
 * @description: 终结符表达式类
 * @data 2020/8/20 0020 18:44
 */
public class TerminalExpression implements AbstractExpression {
    private Set<String> set = new HashSet<>();

    public TerminalExpression(String[] data) {
        for (int i = 0; i < data.length; i++) {
            set.add(data[i]);
        }
    }

    @Override
    public boolean interpret(String info) {
        if (set.contains(info)) {
            return true;
        }
        return false;
    }
}
