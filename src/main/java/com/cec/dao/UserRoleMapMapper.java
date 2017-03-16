package com.cec.dao;

import com.cec.entity.UserRoleMap;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserRoleMapMapper {
    int insert(UserRoleMap record);

    List<UserRoleMap> selectByRoleId(String roleId);

    List<UserRoleMap> selectByUserId(String userId);

    int insertSelective(UserRoleMap record);


}