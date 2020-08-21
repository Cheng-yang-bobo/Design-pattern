package behavioralpattern.memento;

import behavioralpattern.state.threadstatetest.New;

import java.util.HashMap;

/**
 * @author: YangChegn
 * @program:设计模式
 * @title: Caretaker
 * @description: 管理者
 * @data 2020/8/20 0020 17:04
 */
public class Caretaker {
    private HashMap<String,Memento>  hashMap=new HashMap<>();

    public void setMemento(Memento m) {
        hashMap.put(m.getState(),m);
    }

    public Memento getMemento(String s) {

       return hashMap.get(s);
    }
}
