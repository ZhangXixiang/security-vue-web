package com.space.controller;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import com.space.annotation.BuryingPoint;
import com.space.common.dto.model.RestApiModel;
import com.space.common.dto.star.*;
import com.space.common.enums.ResponseStatusCode;
import com.space.common.util.RequestParamMap;
import com.space.common.util.StringUtils;
import com.space.common.util.WEBUtils;
import com.space.common.util.redis.RedisUtil;
import com.space.mybatis.model.Cms2AdvApp;
import com.space.service.BannerService;
import com.space.service.IndexService;
import com.space.util.HSDataSynchroService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.ClassPathResource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.imageio.ImageIO;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.awt.geom.RoundRectangle2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.google.zxing.client.j2se.MatrixToImageConfig.BLACK;
import static com.google.zxing.client.j2se.MatrixToImageConfig.WHITE;


/**
 * 首页数据接口
 */
@RestController
@RequestMapping(value = "/starspace/restapi/index", produces = "application/json")
public class IndexController extends BaseMobileController {


    private final static Logger logger = LoggerFactory.getLogger(IndexController.class);

    @Autowired
    private BannerService bannerService;

    @Autowired
    private IndexService indexService;

    @Autowired
    private RedisUtil redisUtil;

    @Value("${closeVersion}")
    private String closeVersion;

    @Autowired
    private HSDataSynchroService hsDataSynchroService;

    /**
     * 获取首页公告，平台访问量,本所动态，媒体聚焦，专业声音
     */
    @BuryingPoint("四大空间app首页")
    @RequestMapping(value = "/datas", method = RequestMethod.POST)
    public String bannerList() {
        logger.info("请求首页数据接口开始：");
        RestApiModel resultApiModel = new RestApiModel();
        Map<String, Object> map = new HashMap();
        try {
            /**banner */
            List<BannerForm> banners = bannerService.getBanners("adv01", 0, 3);//轮播
            map.put("firstBanner", banners);
            List<BannerForm> keyBanners = bannerService.getImpBanners("adv04");//首页重点推荐
            map.put("keyBanners", keyBanners);
            List<BannerForm> fiveUnion = bannerService.getFiveUnionBanners("adv06");//五大联盟
            map.put("fiveUnion", fiveUnion);

            /**首页公告（转让公告）*/
            List<NoticeForm> indexNotice = indexService.getIndexNotice("zrgg", 0, 3);
            map.put("indexNotice", indexNotice);
            /**首页访问量*/
            map.put("accessNum", indexService.getAccessNum());
            /**
             * 专业资讯
             */
            List<NoticeForm> dynamic = indexService.getIndexNotice("xwdt", 0, 3);//本所动态
            map.put("dynamic", dynamic);
            List<NoticeForm> focus = indexService.getIndexNotice("qtxx", 0, 3);//媒体聚焦 = indexService.getIndexNotice();
            map.put("focus", focus);
            List<NoticeForm> vocality = indexService.getIndexNotice("zysy", 0, 3);//本所动态 = indexService.getIndexNotice();
            map.put("vocality", vocality);
            List<NoticeForm> tjsys = indexService.getIndexNotice("tjsy", 0, 3);//天金视界
            map.put("tjsys", tjsys);
            resultApiModel.setContent(map);
        } catch (Exception e) {
            logger.error("bannerList error message:{},exception:{}", e.getMessage(), e);
            //错误信息
            resultApiModel.setCodeMessage(ResponseStatusCode.serverError.getCode(), ResponseStatusCode.serverError.getDesc());
        }
        logger.info("请求首页数据接口结束!");
        return resultApiModel.toJson();
    }

    /**
     * 根据code获取一类资讯列表
     *
     * @param basicForm
     * @return
     */
    @RequestMapping(value = "/noticeList", method = RequestMethod.POST)
    public String noticeList(BasicForm basicForm, HttpServletRequest request) {
        logger.info("请求资讯数据接口开始，请求参数：" + StringUtils.paseObjToString(basicForm));
        RestApiModel resultApiModel = new RestApiModel();
        if (org.apache.commons.lang3.StringUtils.isBlank(basicForm.getType())) {
            resultApiModel.setCodeMessage(ResponseStatusCode.lostParams.getCode(), ResponseStatusCode.lostParams.getDesc());
        } else {
            try {
                /**资讯*/
                Long totle = indexService.countNoticeByType(basicForm);
                resultApiModel.setKeyAndValue("totalItem", totle);//总条数

                List<NoticeForm> indexNotice = indexService.getNoticeByType(basicForm);
                resultApiModel.setContent(indexNotice);
                //异步调用数据同步接口
                Map paramMaps = RequestParamMap.getParamMap(request);
                paramMaps.put("secondModule","资讯公告类列表");//二级模块
                paramMaps.put("thirdModule","");//三级模块
                hsDataSynchroService.pushDataToHS(paramMaps, WEBUtils.getServerUrl(request),WEBUtils.getIpAddr(request),request.getRequestURI());
            } catch (Exception e) {
                logger.error("noticeList error message:{},exception:{}", e.getMessage(), e);
                //错误信息
                resultApiModel.setCodeMessage(ResponseStatusCode.serverError.getCode(), ResponseStatusCode.serverError.getDesc());
            }
        }
        logger.info("请求资讯数据接口结束！");
        return resultApiModel.toJson();
    }

    /**
     * 根据id获取资讯详情
     *
     * @param contId
     * @return
     */
    @RequestMapping(value = "/getNoticeDetail", method = RequestMethod.POST)
    public String getNoticeDetail(String contId, HttpServletRequest request, HttpServletResponse response) {
        logger.info("请求资讯详情接口开始，请求参数 contId：" + contId);
        RestApiModel resultApiModel = new RestApiModel();
        if (org.apache.commons.lang3.StringUtils.isBlank(contId)) {
            resultApiModel.setCodeMessage(ResponseStatusCode.lostParams.getCode(), ResponseStatusCode.lostParams.getDesc());
        } else {
            try {
                /**资讯*/
                Map notice = indexService.getNoticeById(contId);
                if (notice != null) {
                    resultApiModel.setContent(notice);
                    indexService.updateViewCount(contId);

                    //异步调用数据同步接口
                    Map paramMaps = RequestParamMap.getParamMap(request);
                    paramMaps.put("secondModule","资讯公告");//二级模块
                    paramMaps.put("thirdModule","资讯公告详情");//三级模块
                    hsDataSynchroService.pushDataToHS(paramMaps, WEBUtils.getServerUrl(request),WEBUtils.getIpAddr(request),request.getRequestURI());

                } else {
                    resultApiModel.setCodeMessage(ResponseStatusCode.serverError.getCode(), ResponseStatusCode.serverError.getDesc());
                }
            } catch (Exception e) {
                logger.error("getNoticeDetail error message:{},exception:{}", e.getMessage(), e);
                //错误信息
                resultApiModel.setCodeMessage(ResponseStatusCode.serverError.getCode(), ResponseStatusCode.serverError.getDesc());
            }
        }
        logger.info("请求资讯详情接口结束！");
        response.setHeader("Access-Control-Allow-Origin", "*");
        return resultApiModel.toJson();
    }

    /**
     * 获取首页渠道url
     *
     * @param type
     * @return
     */
    @RequestMapping(value = "/chanleUrl", method = RequestMethod.POST)
    public String chanleUrl(String version, String type) {
        logger.info("请求获取首页渠道url接口开始,version:" + version);
        RestApiModel resultApiModel = new RestApiModel();
        if (org.apache.commons.lang3.StringUtils.isEmpty(type) || org.apache.commons.lang3.StringUtils.isEmpty(version)) {
            resultApiModel.setCodeMessage(ResponseStatusCode.lostParams.getCode(), ResponseStatusCode.lostParams.getDesc());
        } else {
            if (closeVersion.equals(version)) {
                resultApiModel = this.chanleUrl_v1(type);
            } else {
                logger.info("请求获取首页渠道url正式版接口开始,type:" + type);
                String url = bannerService.getChanleUrl(type);
                resultApiModel.setContent(url);
                logger.info("请求获取首页渠道url正式版接口结束,返回值={}",resultApiModel.toJson());
            }
        }
        logger.info("请求获取首页渠道url接口结束");
        return resultApiModel.toJson();
    }

    /**
     * 发行版返回url为空
     *
     * @param type
     * @return
     */
    private RestApiModel chanleUrl_v1(String type) {
        logger.info("请求获取首页渠道url发行版接口开始,type:" + type);
        RestApiModel resultApiModel = new RestApiModel();
        resultApiModel.setContent(null);
        logger.info("请求获取首页渠道url发行版接口结束");
        return resultApiModel;
    }

    /**
     * 安卓获取最新版本号
     *
     * @return
     */
    @RequestMapping(value = "/localVersion", method = RequestMethod.POST)
    public String localVersion() {
        logger.info("请求获取版本号");
        RestApiModel resultApiModel = new RestApiModel();
        String localVersion = indexService.getLocalVersion();
        resultApiModel.setContent(localVersion);
        logger.info("请求获取版本号结束");
        return resultApiModel.toJson();
    }

    /**
     * 获取下载连接url
     * @return
     */
    @RequestMapping(value = "/downPic", method = RequestMethod.POST)
    public String downPic(HSBasicForm hsBasicForm) {
        logger.info("请求下载连接开始");
        RestApiModel resultApiModel = new RestApiModel();
        String downPic = indexService.downPic();
        resultApiModel.setContent(downPic);
        logger.info("请求下载连接结束");
        return resultApiModel.toJson();
    }

    /**
     * 生成二维码方法  不带logo
     *
     * @param  content 要生成的内容
     * @param resp response对象
     * @throws Exception 抛出异常
     */
    @RequestMapping(value = "/qrcode")
    public void getQrcode(String content, HttpServletResponse resp) throws Exception {
        ServletOutputStream stream = null;
        try {
            stream = resp.getOutputStream();
            Map<EncodeHintType, Object> hints = new HashMap<>();
            //编码
            hints.put(EncodeHintType.CHARACTER_SET, "UTF-8");
            //边框距
            hints.put(EncodeHintType.MARGIN, 0);
            QRCodeWriter qrCodeWriter = new QRCodeWriter();
            BitMatrix bm = qrCodeWriter.encode(content, BarcodeFormat.QR_CODE, 200, 200, hints);
            MatrixToImageWriter.writeToStream(bm, "png", stream);
        } catch (WriterException e) {
            e.getStackTrace();

        } finally {
            if (stream != null) {
                stream.flush();
                stream.close();
            }
        }
    }

    private static final // 二维码的配置
        Map<EncodeHintType, Object> hints = new HashMap() {{
        put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.H); // 容错级别
        put(EncodeHintType.CHARACTER_SET, "utf-8"); // 文字编码
        put(EncodeHintType.MARGIN, 1); // 外边距
    }};

    /**
     * 带logo
     * @param content
     * @param response
     * @throws Exception
     */
    @RequestMapping(value = "/generateWithLogo", method = {RequestMethod.GET, RequestMethod.POST})
    public void generateWithLogo( String content, HttpServletResponse response) throws Exception {
        long start = System.currentTimeMillis();
        Integer width =300;
        Integer height=300;
        if (null == content) {
            throw new Exception("content is null");
        }
        OutputStream outputStream = response.getOutputStream();
        BitMatrix bitMatrix = new MultiFormatWriter().encode(content, BarcodeFormat.QR_CODE, width, height, hints);
        BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                image.setRGB(x, y, (bitMatrix.get(x, y) ? BLACK : WHITE));
            }
        }
        Graphics2D g2 = image.createGraphics();

        ClassPathResource classPathResource = new ClassPathResource("logo.png");
        InputStream inputStream = classPathResource.getInputStream();
        File file=new File("logo.png");

        inputstreamtofile(inputStream, file);
        g2.drawImage(ImageIO.read(file), width / 5 * 2, height / 5 * 2, width / 5, height / 5, null); // logo.png自行设置
        g2.setStroke(new BasicStroke(5, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
        g2.setColor(Color.white);
        g2.draw(new RoundRectangle2D.Float(width / 5 * 2, height / 5 * 2, width / 5, height / 5, 20, 20));
        g2.dispose();
        image.flush();
        ImageIO.write(image, "png", outputStream);
        long endtime = System.currentTimeMillis();
        logger.info((endtime-start)+"耗时");
    }

    public void inputstreamtofile(InputStream ins, File file) {
        try {
            OutputStream os = new FileOutputStream(file);
            int bytesRead = 0;
            byte[] buffer = new byte[8192];
            while ((bytesRead = ins.read(buffer, 0, 8192)) != -1) {
                os.write(buffer, 0, bytesRead);
            }
            os.close();
            ins.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 首页连接图片
     * @return
     */
    @RequestMapping(value = "/chanlePic")
    public String getChanlePic(Cms2AdvAppForm cms2AdvAppForm){
        RestApiModel restApiModel = new RestApiModel();
        List<Cms2AdvApp> chanlePic = indexService.getChanlePic(cms2AdvAppForm);
        restApiModel.setContent(chanlePic);
        return restApiModel.toJson();
    }

    /**
     * 请求下一条资讯
     * @param contId 当前id
     * @param next next 下一条， prev 上一条
     * @param request
     * @param response
     * @return
     */
    @RequestMapping(value = "/getNextNotice", method = RequestMethod.POST)
    public String getNextNotice(String contId, String next, String channerCode, HttpServletRequest request, HttpServletResponse response) {
        logger.info("请求资讯详情翻页接口开始，请求参数 contId：" + contId+"next:"+next+"channerCode:"+channerCode);
        RestApiModel resultApiModel = new RestApiModel();
        if (org.apache.commons.lang3.StringUtils.isBlank(contId) || org.apache.commons.lang3.StringUtils.isBlank(channerCode)) {
            resultApiModel.setCodeMessage(ResponseStatusCode.lostParams.getCode(), ResponseStatusCode.lostParams.getDesc());
        } else {
            response.setHeader("Access-Control-Allow-Origin", "*");
            try {
                List<String> idList = null;
                if(redisUtil.hasKey(channerCode)){
                     idList = (List<String>)redisUtil.get(channerCode);
                }else {
                    //向redis中存储该类资讯id的list
                    idList = indexService.getNoticeIdsByType(channerCode);
                    redisUtil.set(channerCode,idList,600);
                }
                //判断是否最后一条  //不存在
                int index = idList.indexOf(contId);
                String indexId=null;
                if("next".equals(next) && index!= idList.size()-1){
                    indexId = idList.get(index + 1);
                }else if("prev".equals(next) && index >0){
                    indexId = idList.get(index - 1);
                }else {
                    resultApiModel.setCodeMessage(ResponseStatusCode.lastNotice.getCode(), ResponseStatusCode.lastNotice.getDesc());
                    return resultApiModel.toJson();
                }
                /**资讯*/
                Map notice = indexService.getNoticeById(indexId);
                if (notice != null) {
                    resultApiModel.setContent(notice);
                    indexService.updateViewCount(indexId);
                    //异步调用数据同步接口
                    Map paramMaps = RequestParamMap.getParamMap(request);
                    paramMaps.put("secondModule","资讯公告");//二级模块
                    paramMaps.put("thirdModule","资讯公告详情");//三级模块
                    hsDataSynchroService.pushDataToHS(paramMaps, WEBUtils.getServerUrl(request),WEBUtils.getIpAddr(request),request.getRequestURI());

                } else {
                    resultApiModel.setCodeMessage(ResponseStatusCode.serverError.getCode(), ResponseStatusCode.serverError.getDesc());
                }
            } catch (Exception e) {
                logger.error("getNoticeDetail error message:{},exception:{}", e.getMessage(), e);
                //错误信息
                resultApiModel.setCodeMessage(ResponseStatusCode.serverError.getCode(), ResponseStatusCode.serverError.getDesc());
            }
        }
        logger.info("请求资讯详情翻页接口！");

        return resultApiModel.toJson();
    }

    @RequestMapping("getAccessNum")
    public String getAccessNum(HttpServletResponse response){
        RestApiModel restApiModel = new RestApiModel();
        String accessNum = indexService.getAccessNum();
        restApiModel.setContent(accessNum);
        response.setHeader("Access-Control-Allow-Origin", "*");
        return restApiModel.toJson();
    }
}
