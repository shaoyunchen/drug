package com.cec.service;

import com.cec.entity.Role;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * Created by shaoyun_book on 2017/3/17.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class RoleServiceTest {

    @Autowired
    RoleService roleService;

    @Test
    public void getRolesWithUserIdTest(){
        List<Role> roles = roleService.getRolesWithUserId("daiqian");
        Assert.assertNotNull(roles);
        Assert.assertTrue(roles.size()>0);
        roles.forEach(role -> System.out.println(role));
    }

}