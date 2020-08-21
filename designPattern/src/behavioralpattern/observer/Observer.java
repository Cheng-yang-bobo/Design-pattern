package behavioralpattern.observer;

/**
 * @auther: YangChegn
 * @program:设计模式
 * @title: Observer
 * @description: 抽象观察者
 * @data 2020/8/19 0019 16:51
 */
public abstract class Observer {
    String name="";


    String handle="";

    public  abstract void response();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHandle() {
        return handle;
    }

    public void setHandle(String handle) {
        this.handle = handle;
    }
}
