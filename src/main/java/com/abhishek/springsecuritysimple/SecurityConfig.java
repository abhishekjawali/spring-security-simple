package com.abhishek.springsecuritysimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * Created by jawala on 6/20/2017.
 */
@EnableWebSecurity
@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    protected void configureUser(AuthenticationManagerBuilder auth) throws Exception {
        System.out.println("inside configure user");
        auth.inMemoryAuthentication().withUser("user1").password("user1").roles("User");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        System.out.println("inside configure");
        http.authorizeRequests().anyRequest().fullyAuthenticated().and().httpBasic();
    }
}
