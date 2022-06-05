package com.shinley.design.pattern.filter.web;

public class SensitiveFilter implements Filter {

    public void doFilter(Request request, Response response, FilterChain chain) {
        request.requestStr = request.requestStr.replace("被就业","就业")
                .replace("敏感", "") + "---SensitiveFilter";

        chain.doFilter(request, response, chain);

        response.responseStr += "---SensitiveFilter";
    }
}
