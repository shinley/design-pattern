package com.shinley.designpattern.filter.web;

import java.util.ArrayList;
import java.util.List;

public class FilterChain implements Filter{
    private List<Filter> filterList = new ArrayList();
    int index = 0;

    public FilterChain addFiter(Filter filter) {
        this.filterList.add(filter);
        return this;
    }

    public void doFilter(Request request, Response response, FilterChain chain) {
        if (index == filterList.size()) {
            return;
        }

        Filter f = filterList.get(index);
        index ++;
        f.doFilter(request, response, chain);
    }
}
