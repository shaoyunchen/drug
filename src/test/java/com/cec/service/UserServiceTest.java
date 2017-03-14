package com.cec.service;

import com.cec.entity.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by shaoyun_book on 2017/3/14.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceTest {

    @Autowired
    UserService userService;

    @Test
    public void getUserWithUserId() throws Exception {
        User user = userService.getUserWithUserId("daiqian");
        Assert.assertNotNull(user);
        Assert.assertEquals("daiqian",user.getEmpNo());
        System.out.println(user);
    }

    @Test
    public void getUserWithUserIdAndPassword() throws Exception {
        User user = userService.getUserWithUserIdAndPassword("daiqian","394e9e9aaa53e91b76dbc7aa4d4aea56");
        Assert.assertNotNull(user);
        Assert.assertEquals("daiqian",user.getEmpNo());
        System.out.println(user);
    }

}