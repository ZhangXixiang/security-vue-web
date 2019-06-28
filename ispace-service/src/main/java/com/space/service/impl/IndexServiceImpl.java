package com.space.service.impl;

import com.github.pagehelper.PageHelper;
import com.space.common.dto.star.BasicForm;
import com.space.common.dto.star.Cms2AdvAppForm;
import com.space.common.dto.star.InfoForm;
import com.space.common.dto.star.NoticeForm;
import com.space.common.lp.hsApi.HsMemberService;
import com.space.common.util.redis.RedisUtil;
import com.space.mybatis.dao.Cms2AdvAppMapper;
import com.space.mybatis.dao.Cms2BaseDictMapper;
import com.space.mybatis.dao.Cms2ContExtMapper;
import com.space.mybatis.model.Cms2AdvApp;
import com.space.mybatis.model.Cms2BaseDict;
import com.space.mybatis.model.Cms2BaseDictExample;
import com.space.service.IndexService;
import org.apache.commons.lang.StringEscapeUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2019/1/24 0024.
 */
@Service
public class IndexServiceImpl implements IndexService {

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

    @Value("${versionCode:2605}")
    private String versionCode;

    @Value("${downPic}")
    private String downPic;
    @Value("${redictUrl}")
    private String redictUrl;

//    @ApolloConfig
//    private Config config;

//    @Value("${hello}")
//    private  String hello;



    /**
     * 获取首页公告列表
     *
     * @return
     */
    @Override
    public List<NoticeForm> getIndexNotice(String channelCode, int currentPage, int pageSize) {
        PageHelper.startPage(currentPage, pageSize);
        List<NoticeForm> noticeForms = cms2ContExtMapper.selectIndexNotice(channelCode);

//        Integer defaultRequestTimeout = 200;
//        Integer configIntProperty = config.getIntProperty("hello1",defaultRequestTimeout);

        for(NoticeForm noticeForm : noticeForms){
            noticeForm.setTitle(StringEscapeUtils.unescapeHtml(noticeForm.getTitle()));
            if(!StringUtils.isEmpty(noticeForm.getLink())){
                noticeForm.setLink(redictUrl+noticeForm.getContId());
            }
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
            if(!StringUtils.isEmpty(noticeForm.getLink())){
                noticeForm.setLink(redictUrl+noticeForm.getContId());
            }
        }
        return noticeForms;
    }

    /**
     * 获取平台访问量
     *
     * @return
     */
    @Override
    public String getAccessNum() {
        Cms2BaseDictExample cms2BaseDictExample = new Cms2BaseDictExample();
        Cms2BaseDictExample.Criteria criteria = cms2BaseDictExample.createCriteria();
        criteria.andCodeEqualTo("cms_count_key");
        List<Cms2BaseDict> cms2BaseDicts = cms2BaseDictMapper.selectByExample(cms2BaseDictExample);

        //调恒生平台访问量接口
       // int todayAccessNum = hsMemberService.QueryTodayAccessNum(DateUtils.parseDateForSImpleNoInterval(new Date()));
        int todayAccessNum = hsMemberService.QueryTodayAccessNum("20190524");
        if(cms2BaseDicts!= null && cms2BaseDicts.size()>0){
            return (Integer.parseInt(cms2BaseDicts.get(0).getValue())+todayAccessNum)+"";
        }
        return todayAccessNum+"";
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

    @Override
    public String getNoticeLinkById(String contId) {
        String link = cms2BaseDictMapper.getNoticeLinkByContId(contId);
        return link;
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
     * 获取资讯公告列表
     *
     * @return
     */
    @Override
    public List<Map> getNoticeList(InfoForm information) {
        return cms2ContExtMapper.getNoticeList(information);
    }

    /**
     * 获取banner列表
     *
     * @param information
     * @return
     */
    @Override
    public List<Map> getBannerList(InfoForm information) {
        return cms2ContExtMapper.getBannerList(information);
    }

    /**
     * 获取资讯类型名称，code
     *
     * @return
     */
    @Override
    public List<Map> getChanles() {
        if(!redisUtil.hasKey("Chanles")){
            redisUtil.set("Chanles",cms2ContExtMapper.getChanles(),3600);
        }
        return  (List<Map>)redisUtil.get("Chanles");
    }

    /**
     * 获取轮播版位类
     *
     * @return
     */
    @Override
    public List<Map> getAdvSpace() {
        if(!redisUtil.hasKey("AdvSpace")){
            redisUtil.set("AdvSpace",cms2ContExtMapper.getAdvSpace(),3600);
        }
        return  (List<Map>)redisUtil.get("AdvSpace");
    }

    @Override
    public Map getDetailInformation(String id) {
        if(!redisUtil.hasKey("notice"+id)){
            redisUtil.set("notice"+id,cms2BaseDictMapper.getInfoByContId(id),3600);
        }
        return (Map)redisUtil.get("notice"+id);
    }

    /**
     * 新建资讯公告
     *
     * @param map
     * @return
     */
    @Override
    public int addInformation(Map map) {
        return 0;
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
     * 获取安卓最新版本code
     *
     * @return
     */
    @Override
    public String getLocalVersion() {
        return versionCode;
    }

    /**
     * 获取下载连接url
     *
     * @return
     */
    @Override
    public String downPic() {
        return downPic;
    }

    /**
     * 首页连接图片
     *
     * @return
     */
    @Override
    public List<Cms2AdvApp> getChanlePic(Cms2AdvAppForm cms2AdvAppForm) {

        List<Cms2AdvApp> cms2AdvApps = cms2AdvAppMapper.selectByExample(cms2AdvAppForm);
        return cms2AdvApps;
    }

    /**
     * 创建Cms2AdvApp
     *
     * @param cms2AdvAppForm
     * @return
     */
    @Override
    public int saveChanlePic(Cms2AdvAppForm cms2AdvAppForm) {
        //逻辑判断
        return cms2AdvAppMapper.saveChanlePic(cms2AdvAppForm);
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

}
