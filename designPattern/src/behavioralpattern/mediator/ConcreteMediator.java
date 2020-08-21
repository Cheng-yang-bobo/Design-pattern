package behavioralpattern.mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * @auther: YangChegn
 * @program:设计模式
 * @title: ConcreteMediator
 * @description: 具体中介者
 * @data 2020/8/20 0020 14:08
 */
public class ConcreteMediator extends Mediator {
    private List<Colleague> colleagues = new ArrayList<Colleague>();

    @Override
    public void register(Colleague colleague) {
        if (!colleagues.contains(colleague)) {
            colleagues.add(colleague);
            colleague.setMedium(this);
        }
    }


    @Override
    public void relay(Colleague cl) {
        for (Colleague ob : colleagues) {
            if (!ob.equals(cl)) {
                 ob.receive();
            }
        }
    }
}
