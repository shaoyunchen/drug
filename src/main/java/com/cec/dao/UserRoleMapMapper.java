package com.cec.dao;

import com.cec.entity.UserRoleMap;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserRoleMapMapper {
    int insert(UserRoleMap record);

    List<UserRoleMap> selectByRoleId(String roleId);

    int insertSelective(UserRoleMap record);


}