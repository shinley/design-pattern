package com.shinley.design.pattern.filter.web;

public interface Filter {
    void doFilter(Request request, Response response, FilterChain fc);
}
