package com.abhishek.springsecuritysimple;

import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;

import javax.servlet.*;
import java.io.IOException;

/**
 * Created by jawala on 6/20/2017.
 */
public class MyFilter1 implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("inside init method of filter 1");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, javax.servlet.FilterChain filterChain) throws IOException, ServletException {
        System.out.println("Inside dofilter method of filter 1");
        SecurityContext context = SecurityContextHolder.getContext();
        filterChain.doFilter(servletRequest, servletResponse);
    }



    @Override
    public void destroy() {
        System.out.println("inside destry method of filter 1");
    }
}
