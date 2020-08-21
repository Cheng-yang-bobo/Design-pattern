package behavioralpattern.memento.mementoclone;

/**
 * @author: YangChegn
 * @program:设计模式
 * @title: OriginatorPrototype
 * @description: 发起人原型
 * @data 2020/8/20 0020 18:06
 */
public class OriginatorPrototype implements Cloneable {

    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public OriginatorPrototype createMemento() {
        return this.clone();
    }

    public void restoreMemento(OriginatorPrototype opt) {
        this.setState(opt.getState());
    }

    @Override
    public OriginatorPrototype clone() {
        try {
            return (OriginatorPrototype) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
}
