package com.space.service;

import com.space.common.dto.star.IMBasicForm;
import com.space.common.dto.star.IMUserForm;

import java.util.List;
import java.util.Map;

/**
 * IMService
 */
public interface IMService {

    /**
     * 网易云信创建账户
     * @param imBasicForm
     * @return
     */
    IMBasicForm createAcount(IMBasicForm imBasicForm);

    /**
     * 根据登录账户 获取imtoken
     * @param account
     * @return
     */
    String getIMTokenByAccount(String account);

    /**
     * 添加好友
     * @param mobile
     * @return
     */
   /* RestApiModel addFriend(IMBasicForm imBasicForm);*/

    String getAccountByMobile(String mobile);

    /**
     * 根据姓名获取用户account
     * @param name
     * @return
     */
     List<Map<String,String>> getAccountByRealName(String name);

     List<IMUserForm> getIMUserFormByRealName(String name);

    /**
     * 判断是否注册
     * @param account
     * @return
     */
    boolean isRegist(String account);

    /**
     * 获取推荐人列表
     * @param mobile
     * @return
     */
    List<Map<String,String>> getInvitedUsers(String mobile);
}
