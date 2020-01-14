package com.in28minutes.springboot.web.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

    //create user
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication().withUser("in28minutes").password("{noop}dummy").roles("USER", "ADMIN");
    }

    //create login page

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        // /login'i her kullanıcı açabilsin ancak todo sayfasına USER rolune sahip olanlar erişebilsin.
        http.authorizeRequests().antMatchers("/login").permitAll().antMatchers("/","/*todo*/**").
                access("hasRole('USER')").and().formLogin();
    }
}
