package com.example.microservice_demo.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

public class OauthSecurityConfig  {
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http.csrf().disable()
//                .antMatcher("/**").authorizeRequests()
//                .antMatchers("/login", "/register").permitAll()
//                .anyRequest().authenticated()
//                .and()
//                .oauth2Login();
//
//    }
}
