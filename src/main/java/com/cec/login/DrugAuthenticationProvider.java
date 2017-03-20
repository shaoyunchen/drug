package com.cec.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.authentication.encoding.Md5PasswordEncoder;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import java.util.Collection;

/**
 * Created by shaoyun_book on 2017/3/16.
 */
@Component
public class DrugAuthenticationProvider implements AuthenticationProvider {

    @Autowired
    private DrugUserDetailsService userService;

    @Autowired
    Md5PasswordEncoder md5Encoder;

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {

        String username = authentication.getName();
        String password = (String) authentication.getCredentials();
        UserDetails userDetails =  userService.loadUserByUsername(username);
        /*String encodePassword = md5Encoder.encodePassword(password, null);
        if (!encodePassword.equals(user.getPassword())) {
            throw new BadCredentialsException("Wrong password.");
        }*/
        if(!md5Encoder.isPasswordValid(userDetails.getPassword(),password,null))
            throw new BadCredentialsException("Wrong password.");
        Collection<? extends GrantedAuthority> authorities = userDetails.getAuthorities();
        return new UsernamePasswordAuthenticationToken(userDetails, password, authorities);
    }

    @Override
    public boolean supports(Class<?> aClass) {
        return true;
    }
}
