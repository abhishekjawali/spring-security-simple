package com.abhishek.springsecuritysimple;

import javax.servlet.*;
import java.io.IOException;

/**
 * Created by jawala on 6/20/2017.
 */
public class MyFilter2 implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("inside init method of filter 2");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, javax.servlet.FilterChain filterChain) throws IOException, ServletException {
        System.out.println("Inside dofilter method of filter 2");
    }



    @Override
    public void destroy() {

        System.out.println("inside destry method of filter 2");
    }
}
