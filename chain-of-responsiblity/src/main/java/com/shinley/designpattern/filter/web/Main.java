package com.shinley.designpattern.filter.web;


public class Main {
    public static void main(String[] args) {
        String msg = "大家好,<script>,敏感，被就业， 网络授课没感觉， 因为看不见大家伙儿";
        Request request = new Request();
        request.setRequestStr(msg);

        Response response = new Response();
        response.setResponseStr("response");

        FilterChain fc = new FilterChain();
        fc.addFiter(new HTMLFilter()).addFiter(new SensitiveFilter());

        fc.doFilter(request, response, fc);

        System.out.println(request.getRequestStr());
        System.out.println(response.getResponseStr());

    }
}
