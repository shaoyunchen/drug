package com.cec.service;

import com.cec.dao.UserMapper;
import com.cec.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by shaoyun_book on 2017/3/14.
 */
@Service
public class UserService {
    @Autowired
    UserMapper userMapper;

    public User getUserWithUserId(String userId){
        return userMapper.selectByUserId(userId);
    }

    public User getUserWithUserIdAndPassword(String userId,String password){
        return userMapper.selectByUserIdAndPassword(userId,password);
    }

}
