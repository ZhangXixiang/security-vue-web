package com.space.mybatis.dao;

import com.space.common.dto.star.IMUserForm;
import com.space.mybatis.model.UcUsersFull;
import com.space.mybatis.model.UcUsersFullExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface UcUsersFullMapper {
    int countByExample(UcUsersFullExample example);

    int deleteByExample(UcUsersFullExample example);

    int insert(UcUsersFull record);

    int insertSelective(UcUsersFull record);

    List<UcUsersFull> selectByExample(UcUsersFullExample example);

    int updateByExampleSelective(@Param("record") UcUsersFull record, @Param("example") UcUsersFullExample example);

    int updateByExample(@Param("record") UcUsersFull record, @Param("example") UcUsersFullExample example);

    String getAccountByMobile(String mobile);

    /**
     * 根据姓名获取用户account
     * @param name
     * @return
     */
    List<Map<String,String>> getAccountByRealName(@Param("name") String name);

    List<IMUserForm> getIMUserFormByRealName(@Param("name") String name);

    List<String> isRegist(@Param("account") String account);

    List<Map<String,String>> getInvitedUsers(String mobile);
}