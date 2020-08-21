package behavioralpattern.memento;

/**
 * @author: YangChegn
 * @program:设计模式
 * @title: Originator
 * @description: 发起人
 * @data 2020/8/20 0020 17:04
 */
public class Originator {
    private String state;

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public Memento createMemento() {
        return new Memento(state);
    }

    public void restoreMemento(Memento m) {
        this.setState(m.getState());
    }
}
