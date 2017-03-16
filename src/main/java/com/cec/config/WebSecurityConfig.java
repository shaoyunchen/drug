package com.cec.config;

import com.cec.login.DrugAuthenticationProvider;
import com.cec.login.LoginSuccessHandler;
import com.cec.login.DrugUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.encoding.Md5PasswordEncoder;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * Created by shaoyun_book on 2017/3/14.
 */
@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)  //AOP
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    DrugAuthenticationProvider drugAuthenticationProvider;

    @Autowired
    DrugUserDetailsService drugUserDetailsService;

    @Autowired
    LoginSuccessHandler loginSuccessHandler;

    @Bean
    public Md5PasswordEncoder getMd5PasswordEncoder() {
        return new Md5PasswordEncoder();
    }

    @Override
    public void configure(WebSecurity web) throws Exception {
        web.ignoring().antMatchers("/css/**", "/js/**", "/images/**");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                .anyRequest().authenticated();
        http
                .formLogin()
                //.loginProcessingUrl("/login")
                .loginPage("/login")
                .failureUrl("/login?error")
                .successForwardUrl("/hello")
                .successHandler(loginSuccessHandler)
                .permitAll();
        http
                .logout()
                .logoutSuccessUrl("/login")
                .permitAll();
        super.configure(http);
    }


   /* @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
//       auth.authenticationProvider(drugAuthenticationProvider);
         auth.userDetailsService(drugUserDetailsService).passwordEncoder(getMd5PasswordEncoder());
    }*/

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth.authenticationProvider(drugAuthenticationProvider);
    }
   /* @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(drugUserDetailsService).passwordEncoder(new Md5PasswordEncoder());;
    }*/

}
