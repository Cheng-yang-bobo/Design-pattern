package j2eepattern.interceptingfilterpattern;

/**
 * @author: YangChegn
 * @program:设计模式
 * @title: InterceptingFilterPatternMain
 * @description: InterceptingFilterPatternMain
 * @data 2020/8/21 0021 14:22
 */
public class InterceptingFilterPatternMain {
    public static void main(String[] args) {
        FilterManager filterManager = new FilterManager(new Target());
        filterManager.setFilter(new AuthenticationFilter());
        filterManager.setFilter(new DebugFilter());

        Client client = new Client();
        client.setFilterManager(filterManager);
        client.sendRequest("HOME");
    }
}
