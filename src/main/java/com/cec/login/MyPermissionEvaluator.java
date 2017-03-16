package com.cec.login;

import org.springframework.stereotype.Component;

/**
 * Created by shaoyun_book on 2017/3/16.
 */
@Component
public class MyPermissionEvaluator /*implements PermissionEvaluator*/ {

//    @Autowired
//    private LoginService loginService;
//
//    @Autowired
//    private RoleSe  rvice roleService;
//
//    @Override
//    public boolean hasPermission(Authentication authentication, Object targetDomainObject, Object permission) {
//        String username = authentication.getName();
//        Login login = loginService.findByUsername(username).get();
//        return roleService.authorized(login.getId(), targetDomainObject.toString(), permission.toString());
//    }
//
//    @Override
//    public boolean hasPermission(Authentication authentication, Serializable targetId, String targetType, Object permission) {
//        // not supported
//        return false;
//    }
}
