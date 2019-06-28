package com.space.mybatis.dao;

import org.apache.ibatis.annotations.Param;
import com.space.mybatis.model.Role;

import java.util.List;

/**
 * Created by sang on 2018/1/1.
 */
public interface RoleMapper {
    List<Role> roles();

    int addNewRole(@Param("role") String role, @Param("roleZh") String roleZh);

    int deleteRoleById(Long rid);
}
