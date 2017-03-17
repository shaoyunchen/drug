package com.cec.login;

import com.cec.entity.User;
import com.cec.service.RoleService;
import com.cec.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

/**
 * Created by shaoyun_book on 2017/3/15.
 */
@Component
public class DrugUserDetailsService implements UserDetailsService{

    @Autowired
    UserService userService;

    @Autowired
    RoleService roleService;
    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        if(userName==null||userName.trim().length()==0){
            throw new UsernameNotFoundException("用户名为空");
        }
        User user = userService.getUserWithUserId(userName);
        DrugUserDetails sUser = new DrugUserDetails(user);
        sUser.setRoles(roleService.getRolesWithUserId(user.getEmpNo()));
        return sUser;
    }
}
