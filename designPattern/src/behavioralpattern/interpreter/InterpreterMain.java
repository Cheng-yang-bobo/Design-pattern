package behavioralpattern.interpreter;

/**
 * @author: YangChegn
 * @program:设计模式
 * @title: InterpreterMain
 * @description: 解释器模式
 * @data 2020/8/20 0020 18:43
 */
public class InterpreterMain {
    public static void main(String[] args) {
        Context bus = new Context();
        bus.freeRide("韶关的老人");
        bus.freeRide("韶关的年轻人");
        bus.freeRide("广州的妇女");
        bus.freeRide("广州的儿童");
        bus.freeRide("山东的儿童");
    }
}
