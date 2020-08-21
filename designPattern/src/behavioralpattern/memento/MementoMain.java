package behavioralpattern.memento;

/**
 * @author: YangChegn
 * @program:设计模式
 * @title: MementoMain
 * @description: 备忘录模式主函数
 * @data 2020/8/20 0020 17:03
 */
public class MementoMain {
    public static void main(String[] args) {
        Originator or=new Originator();
        Caretaker cr=new Caretaker();
        or.setState("S0");
        System.out.println("初始状态:"+or.getState());
        //保存状态
        cr.setMemento(or.createMemento());
        or.setState("S1");
        System.out.println("新的状态:"+or.getState());
        //保存状态
        cr.setMemento(or.createMemento());

        or.setState("S2");
        System.out.println("新的状态:"+or.getState());
        //保存状态
        cr.setMemento(or.createMemento());

        //恢复状态
        or.restoreMemento(cr.getMemento("S0"));
        System.out.println("恢复状态:"+or.getState());
    }
}
