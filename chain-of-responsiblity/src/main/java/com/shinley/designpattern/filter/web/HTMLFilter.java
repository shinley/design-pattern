package com.shinley.designpattern.filter.web;

public class HTMLFilter implements Filter {

    public void doFilter(Request request, Response response, FilterChain chain) {
        request.requestStr = request.requestStr.replace("<", "[")
                .replace(">", "]") +"--HTMLFilter";
        chain.doFilter(request, response, chain);
        response.responseStr +="--HTMLFilter";
    }
}
