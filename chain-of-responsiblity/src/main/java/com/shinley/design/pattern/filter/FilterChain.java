package com.shinley.design.pattern.filter;

import java.util.ArrayList;
import java.util.List;

public class FilterChain implements Filter{
    private List<Filter> filterList = new ArrayList();

    public FilterChain addFiter(Filter filter) {
        this.filterList.add(filter);
        return this;
    }

    public String doFilter(String msg) {
        String r =msg;
        for(Filter f:filterList) {
            r=f.doFilter(r);
        }
        return r;
    }
}
