package com.cec.dao;

import com.cec.entity.Role;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface RoleMapper {
    int deleteByPrimaryKey(String roleId);

    int insert(Role record);

    int insertSelective(Role record);

    Role selectByPrimaryKey(String roleId);

    int updateByPrimaryKeySelective(Role record);

    int updateByPrimaryKey(Role record);
}