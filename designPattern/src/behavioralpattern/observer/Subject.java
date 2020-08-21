package behavioralpattern.observer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @auther: YangChegn
 * @program:设计模式
 * @title: Subject
 * @description: 抽象目标
 * @data 2020/8/19 0019 16:50
 */
public abstract class Subject {

    protected HashMap<String,Observer> observers=new HashMap<>();

    private static String add="add";
    private static String remove="remove";

    public void add(Observer observer){
        observer.setHandle(add);
        observers.put(observer.getName()+observer.getHandle(),observer);
        this.notifyObserver(observer.getName());
    }

    public void remove(Observer observer){

        observers.remove(observer.getName()+observer.getHandle());
        observer.setHandle(remove);
        this.notifyObserver(observer.getName()+observer.getHandle());
    }

    public abstract void notifyObserver(String handle);


}
