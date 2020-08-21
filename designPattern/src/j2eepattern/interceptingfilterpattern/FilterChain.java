package j2eepattern.interceptingfilterpattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: YangChegn
 * @program:设计模式
 * @title: FilterChain
 * @description: 创建过滤器链
 * @data 2020/8/21 0021 14:27
 */
public class FilterChain {
    private List<Filter> filters = new ArrayList<Filter>();
    private Target target;

    public void addFilter(Filter filter){
        filters.add(filter);
    }

    public void execute(String request){
        for (Filter filter : filters) {
            filter.execute(request);
        }
        target.execute(request);
    }

    public void setTarget(Target target){
        this.target = target;
    }
}
