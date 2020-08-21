package behavioralpattern.memento.mementoclone;

/**
 * @author: YangChegn
 * @program:设计模式
 * @title: MementoCloneMain
 * @description: 原型模式和备忘录模式配合
 * @data 2020/8/20 0020 18:04
 */
public class MementoCloneMain {

    public static void main(String[] args) {
        OriginatorPrototype or=new OriginatorPrototype();
        PrototypeCaretaker cr=new PrototypeCaretaker();
        or.setState("S0");
        System.out.println("初始状态:"+or.getState());
        //保存状态
        cr.setMemento(or.createMemento());
        or.setState("S1");
        System.out.println("新的状态:"+or.getState());
        //恢复状态
        or.restoreMemento(cr.getMemento());
        System.out.println("恢复状态:"+or.getState());
    }
}
