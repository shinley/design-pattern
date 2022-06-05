package com.shinley.design.pattern.filter;

public class SensitiveFilter implements Filter {
    public String doFilter(String msg) {
        String r = msg.replace("被就业","就业")
                .replace("敏感", "");
        return r;
    }
}
