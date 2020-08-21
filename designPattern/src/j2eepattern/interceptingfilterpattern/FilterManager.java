package j2eepattern.interceptingfilterpattern;

/**
 * @author: YangChegn
 * @program:设计模式
 * @title: FilterManager
 * @description: 过滤管理器
 * @data 2020/8/21 0021 14:39
 */
public class FilterManager {
    FilterChain filterChain;

    public FilterManager(Target target){
        filterChain = new FilterChain();
        filterChain.setTarget(target);
    }
    public void setFilter(Filter filter){
        filterChain.addFilter(filter);
    }

    public void filterRequest(String request){
        filterChain.execute(request);
    }
}
