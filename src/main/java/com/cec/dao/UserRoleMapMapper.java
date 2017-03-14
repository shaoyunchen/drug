package com.cec.dao;

import com.cec.entity.UserRoleMap;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserRoleMapMapper {
    int insert(UserRoleMap record);

    int insertSelective(UserRoleMap record);
}