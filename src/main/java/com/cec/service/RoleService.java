package com.cec.service;

import com.cec.dao.RoleMapper;
import com.cec.dao.UserRoleMapMapper;
import com.cec.entity.Role;
import com.cec.entity.UserRoleMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by shaoyun_book on 2017/3/15.
 */
@Service
public class RoleService {
    @Autowired
    RoleMapper roleMapper;
    @Autowired
    UserRoleMapMapper userRoleMapMapper;

    public List<Role> getRolesWithUserId(String userId){
        List<UserRoleMap> userRoleMaps = userRoleMapMapper.selectByUserId(userId);
        List<Role> roles = new ArrayList<>();
        if(userRoleMaps!=null&&userRoleMaps.size()>0){
            for (UserRoleMap map: userRoleMaps) {
                Role role = roleMapper.selectByPrimaryKey(map.getRoleId());
                roles.add(role);
            }
        }
        return roles;
    }

}
