package behavioralpattern.command.macroscommand;

import java.util.ArrayList;
import java.util.List;

/**
 * @auther: YangChegn
 * @program:设计模式
 * @title: CompositeInvoker
 * @description: 树枝构件:调用者
 * @data 2020/8/18 0018 19:10
 */
public class CompositeInvoker implements AbstractCommand {


    private List<AbstractCommand> children = new ArrayList<>();

    public void add(AbstractCommand c) {
        children.add(c);
    }

    public void remove(AbstractCommand c) {
        children.remove(c);
    }

    public AbstractCommand getChild(int i) {
        return children.get(i);
    }

    @Override
    public void execute() {
        for (AbstractCommand abstractCommand : children) {
            abstractCommand.execute();
        }
    }

}
