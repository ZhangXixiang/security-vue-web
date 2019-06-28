package com.space.service.impl;

import com.github.pagehelper.PageHelper;
import com.space.common.dto.star.BannerForm;
import com.space.common.dto.star.BasicForm;
import com.space.common.dto.star.ContactForm;
import com.space.common.dto.star.NoticeForm;
import com.space.common.lp.hsApi.HsMemberService;
import com.space.common.util.redis.RedisUtil;
import com.space.mybatis.dao.Cms2AdvAppMapper;
import com.space.mybatis.dao.Cms2BaseDictMapper;
import com.space.mybatis.dao.Cms2ContExtMapper;
import com.space.service.PPPService;
import org.apache.commons.lang.StringEscapeUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.Map;

/**
 * ppp
 */
@Service
public class PPPServiceImpl implements PPPService {

    @Autowired
    private Cms2ContExtMapper cms2ContExtMapper;

    @Autowired
    private Cms2BaseDictMapper cms2BaseDictMapper;
    @Autowired
    private Cms2AdvAppMapper cms2AdvAppMapper;
    @Autowired
    private RedisUtil redisUtil;

    @Autowired
    private HsMemberService hsMemberService;
    @Value("${contactInfo}")
    private String contactInfo;
    @Value("${versionCode:2605}")
    private String versionCode;

    @Value("${downPic}")
    private String downPic;

    /**
     * 获取首页公告列表
     *
     * @return
     */
    @Override
    public List<NoticeForm> getIndexNotice(String channelCode, int currentPage, int pageSize) {
        PageHelper.startPage(currentPage, pageSize);
        List<NoticeForm> noticeForms = cms2ContExtMapper.selectIndexNotice(channelCode);
        for(NoticeForm noticeForm : noticeForms){
            noticeForm.setTitle(StringEscapeUtils.unescapeHtml(noticeForm.getTitle()));
        }
        return noticeForms;
    }

    /**
     * 根据类型获取资讯列表 分页
     *
     * @param basicForm
     * @return
     */
    @Override
    public List<NoticeForm> getNoticeByType(BasicForm basicForm) {
        int page = 0;
        int pageSize = 5;
        if(!StringUtils.isBlank(basicForm.getCurrPage())){
            page = Integer.parseInt(basicForm.getCurrPage());
        }
        if(!StringUtils.isBlank(basicForm.getPageSize())){
            pageSize = Integer.parseInt(basicForm.getPageSize());
        }
        PageHelper.startPage(page,pageSize);
        List<NoticeForm> noticeForms = cms2ContExtMapper.selectIndexNotice(basicForm.getType());
        for(NoticeForm noticeForm : noticeForms){
            noticeForm.setTitle(StringEscapeUtils.unescapeHtml(noticeForm.getTitle()));
        }
        return noticeForms;
    }

    /**
     * 根据id获取详情
     *
     * @param contId
     * @return
     */
    @Override
    public Map getNoticeById(String contId) {
        Map map = cms2BaseDictMapper.selectByContId(contId);
        map.put("title",StringEscapeUtils.unescapeHtml((String) map.get("title")));
        return map;
    }

    /**
     * 获取某类资讯总条数
     *
     * @param basicForm
     * @return
     */
    @Override
    public Long countNoticeByType(BasicForm basicForm) {
        return cms2ContExtMapper.countNoticeByType(basicForm.getType());
    }

    /**
     * 资讯公告点击查看量加1操作
     *
     * @param contId
     */
    @Override
    public void updateViewCount(String contId) {
        cms2ContExtMapper.updateViewCount(contId);
    }


    /**
     * 获取某类资讯id集合
     *
     * @param channerCode
     * @return
     */
    @Override
    public List<String> getNoticeIdsByType(String channerCode) {
        return cms2ContExtMapper.getNoticeIdsByType(channerCode);
    }

    /**
     * 根据广告类型获取banner
     *
     * @param type
     * @return
     */
    @Override
    public List<BannerForm> getPPPBanner(String type) {
        if(redisUtil.hasKey(type)){
            return (List<BannerForm>)redisUtil.get(type);
        }
        List<BannerForm> pppBanner = cms2ContExtMapper.getPPPBanner(type);
        if(pppBanner!= null && pppBanner.size()>0){
            redisUtil.set(type,pppBanner,3600*24);
        }
        return  pppBanner;
    }

    /**
     * 获取联系人信息
     *
     * @return
     */
    @Override
    public ContactForm getContactInfo() {
        if(redisUtil.hasKey("ContactForm")){
            return (ContactForm)redisUtil.get("ContactForm");
        }
        /**一期写死*/
        ContactForm contactForm  = new ContactForm();
        String[] split = contactInfo.split("\\|");
        for(String contact : split){
            if(contact.startsWith("name")){
                try {
                    contactForm.setName((new String(contact.substring(4).getBytes("ISO-8859-1"),"UTF-8")));
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                }
            }
            if(contact.startsWith("mobile")){
                contactForm.setMobile(contact.substring(6));
            }
            if(contact.startsWith("email")){
                contactForm.setEmail(contact.substring(5));
            }
        }
        redisUtil.set("ContactForm",contactForm);
        return contactForm ;
    }

}
