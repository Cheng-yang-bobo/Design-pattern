package j2eepattern.interceptingfilterpattern;

/**
 * @author: YangChegn
 * @program:设计模式
 * @title: DebugFilter
 * @description: 过滤器实体
 * @data 2020/8/21 0021 14:25
 */
public class DebugFilter implements Filter {
    @Override
    public void execute(String request) {
        System.out.println("request log: " + request);
    }
}
