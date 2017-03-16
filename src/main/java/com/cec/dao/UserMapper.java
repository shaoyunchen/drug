package com.cec.dao;

import com.cec.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    int deleteByPrimaryKey(String empNo);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(String empNo);

    User selectByUserId(String userId);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}