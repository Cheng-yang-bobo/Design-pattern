package j2eepattern.interceptingfilterpattern;

/**
 * @author: YangChegn
 * @program:设计模式
 * @title: Client
 * @description: 客户端
 * @data 2020/8/21 0021 14:40
 */
public class Client {
    FilterManager filterManager;

    public void setFilterManager(FilterManager filterManager) {
        this.filterManager = filterManager;
    }

    public void sendRequest(String request) {
        filterManager.filterRequest(request);
    }
}
