package behavioralpattern.memento.mementoclone;

/**
 * @author: YangChegn
 * @program:设计模式
 * @title: PrototypeCaretaker
 * @description: 原型管理者
 * @data 2020/8/20 0020 18:09
 */
public class PrototypeCaretaker {

    private OriginatorPrototype originatorPrototype;

    public OriginatorPrototype getMemento() {
        return originatorPrototype;
    }

    public void setMemento(OriginatorPrototype originatorPrototype) {
        this.originatorPrototype = originatorPrototype;
    }
}
