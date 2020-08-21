package j2eepattern.interceptingfilterpattern;

/**
 * @author: YangChegn
 * @program:设计模式
 * @title: Target
 * @description: target
 * @data 2020/8/21 0021 14:27
 */
public class Target {
    public void execute(String request){
        System.out.println("Executing request: " + request);
    }
}
