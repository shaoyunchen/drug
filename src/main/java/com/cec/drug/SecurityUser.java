package com.cec.drug;

import com.cec.entity.Role;
import com.cec.entity.User;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;

/**
 * Created by shaoyun_book on 2017/3/15.
 */
public class SecurityUser implements UserDetails {

    String fullName ;

    List<Role> roles;

    User user;

    public SecurityUser(User user) {
        /*if(user==null)
            throw new NullPointerException("user is null");*/
        this.user = user;
        this.fullName = user.getLastName()+user.getFirstName();
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    public String getFullName() {
        return fullName;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public String getPassword() {
        return this.user.getPassword();
    }

    @Override
    public String getUsername() {
        return null;
    }

    @Override
    public boolean isAccountNonExpired() {
        return false;
    }

    @Override
    public boolean isAccountNonLocked() {
        return false;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return false;
    }

    @Override
    public boolean isEnabled() {
        return false;
    }
}
