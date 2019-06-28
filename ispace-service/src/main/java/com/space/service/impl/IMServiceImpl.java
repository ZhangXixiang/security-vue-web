package com.space.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.space.common.dto.star.IMBasicForm;
import com.space.common.dto.star.IMUserForm;
import com.space.common.util.im.IMSignUtil;
import com.space.common.util.im.WYHttpUtil;
import com.space.mybatis.dao.UcFormAttrValuesMapper;
import com.space.mybatis.dao.UcUsersFullMapper;
import com.space.mybatis.model.UcFormAttrValues;
import com.space.mybatis.model.UcUsersFull;
import com.space.mybatis.model.UcUsersFullExample;
import com.space.service.IMService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@Slf4j
public class IMServiceImpl implements IMService {

    @Autowired
    private WYHttpUtil wyHttpUtil;
    @Autowired
    private IMSignUtil imSignUtil;
    @Autowired
    private UcFormAttrValuesMapper ucFormAttrValuesMapper;
    @Autowired
    private UcUsersFullMapper ucUsersFullMapper;

    /**
     * 网易云信创建账户
     *
     * @param imBasicForm
     * @return
     */
    @Override
    public IMBasicForm createAcount(IMBasicForm imBasicForm) {
        Map<String,Object> paramMap = new HashMap<String, Object>();
        paramMap.put("accid",imBasicForm.getAccount());//网易云通信ID，最大长度32字符，必须保证一个 请注意以此接口返回结果中的accid为准
        String rep = wyHttpUtil.imPost(imSignUtil.getIMCreteurl(), paramMap);
        if(rep==null){
            imBasicForm.setErrorCode(-1);
            imBasicForm.setErrorMessage("网易云信创建账户，返回空");
        }
        JSONObject gson = JSONObject.parseObject(rep);
        if(IMSignUtil.returnCode_success.equals(gson.get("code"))){
            if(gson.get("info")!=null){
                Map<String, String> map = (Map) gson.get("info");
                imBasicForm.setAccount(map.get("accid"));//account 当accid
                imBasicForm.setImToken(map.get("token"));
                imBasicForm.setName(map.get("name"));
                log.info("网易云信创建账户返回："+ JSON.toJSONString(imBasicForm));
            }else{
                imBasicForm.setErrorCode(-1);
                imBasicForm.setErrorMessage("网易云信创建账户，返回空");
            }

        }else if(IMSignUtil.returnCode_errerparm.equals(gson.get("code"))){  //已注册
            String refreshToken = wyHttpUtil.imPost(imSignUtil.getIMRefreshToken(), paramMap);
            if(refreshToken==null){
                imBasicForm.setErrorCode(-1);
                imBasicForm.setErrorMessage("网易云信刷新账户，返回空");
            }
            JSONObject freshToken = JSONObject.parseObject(refreshToken);
            if(IMSignUtil.returnCode_success.equals(freshToken.get("code"))){
                if(freshToken.get("info")!=null){
                    Map<String, String> map = (Map) freshToken.get("info");
                    imBasicForm.setAccount(map.get("accid"));//account 当accid
                    imBasicForm.setImToken(map.get("token"));
                    imBasicForm.setName(map.get("name"));
                    log.info("网易云信刷新账户返回："+ JSON.toJSONString(imBasicForm));
                }else{
                    imBasicForm.setErrorCode(-1);
                    imBasicForm.setErrorMessage("网易云信创建账户，返回空");
                }
            }
        }
        else{
            imBasicForm.setErrorCode(-1);
            imBasicForm.setErrorMessage("网易云信创建账户调用失败！");
        }
        return imBasicForm;
    }

    /**
     * 根据登录账户获取imtoken
     *
     * @param account
     * @return
     */
    @Override
    public String getIMTokenByAccount(String account) {
        UcUsersFullExample ucUsersFullExample = new UcUsersFullExample();
        ucUsersFullExample.createCriteria().andAccountEqualTo(account);
        List<UcUsersFull> ucUsersFulls = ucUsersFullMapper.selectByExample(ucUsersFullExample);
        Integer userId = 0;
        if(ucUsersFulls!=null && ucUsersFulls.size()>0){
            userId = ucUsersFulls.get(0).getId();
        }else{
            return "";
        }
        UcFormAttrValues ucFormAttrValues = new UcFormAttrValues();
        ucFormAttrValues.setAttrKey("token");
        ucFormAttrValues.setObjectId(userId.longValue());
        List<UcFormAttrValues> list = ucFormAttrValuesMapper.selectByExample(ucFormAttrValues);
        if(list!=null && list.size()>0){
          //  String attrValue = list.get(0).getAttrValue();
            return  list.get(0).getAttrValue();
        }else{
            //第一次获取token
            IMBasicForm imBasicForm = new IMBasicForm();
            imBasicForm.setAccount(account);
            imBasicForm = createAcount(imBasicForm);
            //创建token记录
           // UcFormAttrValues ucFormAttrValues = new UcFormAttrValues();
           // ucFormAttrValues.setAttrKey("token");
            ucFormAttrValues.setAttrValue(imBasicForm.getImToken());
            ucFormAttrValues.setIsDeleted("N");
            ucFormAttrValues.setFormId(90L);//生产值
            ucFormAttrValues.setAttrId(3050L);//自定义值，因为该字段不为空
            ucFormAttrValues.setExchangeId(6982912);//
            ucFormAttrValues.setGmtCreate(new Date());
            ucFormAttrValues.setGmtModify(new Date());
            ucFormAttrValuesMapper.insertSelective(ucFormAttrValues);
            return imBasicForm.getImToken();
        }
    }


    /**
     * 根据手机号获取前台个人用户账号
     * @param mobile
     * @return
     */
    @Override
    public String getAccountByMobile(String mobile){
        String account = ucUsersFullMapper.getAccountByMobile(mobile);
        return account;
    }

    /**
     * 根据姓名获取用户account
     *
     * @param name
     * @return
     */
    @Override
    public List<Map<String,String>> getAccountByRealName(String name) {
        return  ucUsersFullMapper.getAccountByRealName(name);
    }

    @Override
    public List<IMUserForm> getIMUserFormByRealName(String name) {
        return  ucUsersFullMapper.getIMUserFormByRealName(name);
    }

    /**
     * 判断是否注册
     *
     * @param account
     * @return
     */
    @Override
    public boolean isRegist(String account) {
        if(StringUtils.isEmpty(account)){
            return true;
        }
        List<String> listIds = ucUsersFullMapper.isRegist(account);
        if(listIds != null && listIds.size()>0){
            return true;
        }
        return false;
    }

    /**
     * 获取推荐人列表
     *
     * @param mobile
     * @return
     */
    @Override
    public List<Map<String, String>> getInvitedUsers(String mobile) {
        List<Map<String, String>> users =  ucUsersFullMapper.getInvitedUsers(mobile);
        return users;
    }

}
