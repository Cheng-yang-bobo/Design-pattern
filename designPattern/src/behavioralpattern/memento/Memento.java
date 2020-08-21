package behavioralpattern.memento;

/**
 * @author: YangChegn
 * @program:设计模式
 * @title: Memento
 * @description: 备忘录
 * @data 2020/8/20 0020 17:04
 */
public class Memento {
    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
