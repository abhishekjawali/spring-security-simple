package com.abhishek.springsecuritysimple;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by jawala on 6/20/2017.
 */
@Configuration
public class FilterChain {

    @Bean
    public FilterRegistrationBean filter1Reg() {
        System.out.println("Inside filter 1 registration");
        FilterRegistrationBean registrationBean = new FilterRegistrationBean();
        registrationBean.setName("filter 1");
        MyFilter1 myFilter1 = new MyFilter1();
        registrationBean.setFilter(myFilter1);
        registrationBean.setOrder(1);
        return registrationBean;
    }

    @Bean
    public FilterRegistrationBean filter2Reg() {

        System.out.println("Inside filter 2 registration");
        FilterRegistrationBean registrationBean = new FilterRegistrationBean();
        registrationBean.setName("filter 2");
        MyFilter2 myFilter2 = new MyFilter2();
        registrationBean.setFilter(myFilter2);
        registrationBean.setOrder(2);
        return registrationBean;
    }
}
