package com.space.common.lp.util;

import com.alibaba.fastjson.JSONArray;
import org.apache.commons.lang.StringUtils;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.util.*;
import java.util.Map.Entry;

@Component
public class SignUtil {

	/**
	 * 恒生数据同步接口（埋点）
	 */
	@Value("${hsburypointUrl}")
	private String hsburypointUrl;

	public String getHsburypointUrl() {
		return hsburypointUrl;
	}

	//私钥地址
	@Value("${tjs.privateKeyPath}")
	private  String privateKeyPath;
	//公钥地址
	@Value("${tjs.publicKeyPath}")
	private  String publicKeyPath ;
	//私钥密码
	@Value("${tjs.privatePassWord:123456}")
	private  String privatePassWord;
	
	//平台ID
	@Value("${hshuiyuan.platformId:0f0e1f751500e7a680388b05639d1624}")
	private  String platformId;
	//四大空间id
	@Value("${starspace.platformId:2e2302818a996993c08f2f07c9606e79}")
	private  String spacePlatformId;
	//终端标识
	@Value("${hshuiyuan.appKey:web}")
	private  String appKey;
	
	//恒生私钥用于请求参数加密
	@Value("${hshuiyuan.privateKeyHS:MIICdgIBADANBgkqhkiG9w0BAQEFAASCAmAwggJcAgEAAoGBANgzjpGMQ3IEGMqP\no9PaD++oBszG/lgY1dGAOebLeINcge2MX1TjRqzCPnjzYtDR/o5GdSd+K/Wf3VB7\nUer/F8Gw7rTMJC+hNabTzOHXygOG1tgMyJ7GTwAhPJyM+WwchXmZNXfvmnYRxu/t\nZY5ov+hTXR1IxNfz9ycGy8f2Ob1fAgMBAAECgYAgZGEY53X3cCuytaCrDgHTO06B\ngdL7qgTnFZoXPSb6L3L7/0sNMdwV6ChqALUuajgEYwQMfbfiXihPdZqJZdzODr4w\n3NVCIUuW5CqCC2OO+FHoLBGTGEKRhuDtVoYVoPrXXDXZbCGklHSP5rArlXhZRPk2\nJcJZOeqcbqrtRd33IQJBAPYCn7l0JUFUc0lSmw0c6PuY9RFNXh8RXDRffEYzszzR\nZ4IWWm4Bq1/5LeYe09ebvSdvNBUDI2HO3qKiFOLvai8CQQDg+w7Qq6KlZQrFVmwT\nxB2mTr4KApZod+qli5f19up1/uNePX+kMUs5+TyPUU6PeXTlAFCGoFVtenp31nrD\n8oPRAkAVYK7+j6A5KByIj5wXrJ52VpldMoruSjTn/DAxbYayz0OeY1DiZFS/F0ks\nyRsBjnAGgDxXYxltA2wHV+xWuBVTAkEAm1PaK6mENoqnQA1lutPY4JxWylR1AZVh\nNIBHHzMlNugOlF8DRBogZNs1u4EYKyhg00Y/UmNZ96bq7NfwlF5YMQJAGUrDRrq3\nhxN+UZlIl2VdU7eCJM7h8wMYcyX64p/701s+yfziMBco68rnSZkqy+UaQsNyOT0w\nMVEP/Kvg1Kn9hg==}")
	private  String privateKeyHS ;
	
	//恒生公钥钥用于请求参数加密
	@Value("${hshuiyuan.publicKeyHS:MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQDYM46RjENyBBjKj6PT2g/vqAbM\nxv5YGNXRgDnmy3iDXIHtjF9U40aswj5482LQ0f6ORnUnfiv1n91Qe1Hq/xfBsO60\nzCQvoTWm08zh18oDhtbYDMiexk8AITycjPlsHIV5mTV375p2Ecbv7WWOaL/oU10d\nSMTX8/cnBsvH9jm9XwIDAQAB}")
	private  String publicKeyHS ;

	/**
	 * 四大空姐公钥用于请求参数加密
	 */
	@Value("${starSpace.publicKeyHS}")
	private  String publicKeySpace ;

	public String getPublicKeySpace(){
		return publicKeySpace;
	}

	/**
	 * 恒生请求今日访问量接口
	 */
	@Value("${hsAccNumUrl:http://mardealapi.tjfae.com/api/pv?visitDateBegin=}")
	private  String hsAccNumUrl;
	public String getHsAccNumUrl() {
		return hsAccNumUrl;
	}
	// 请求地址IP
	@Value("${hshuiyuan.urlPath:http://ipoducuat.tjfae.com/service}")
	private  String urlPath ;

	// 请求四大空间接口地址IP starspace.urlPath =https://ipodspace.tjfae.com/service
	@Value("${starspace.urlPath:https://ipodspace.tjfae.com/service}")
	private  String starSpaceUrlPath ;
	
	// 登记结算系统请求地址
	@Value("${hshuiyuan.ipodregUrlPath:http://ipodreguat.tjfae.com/service}")
	private  String ipodregUrlPath ;

	/**
	 * 请求运营管理系统url
	 */
	@Value("${yunyingUrlPath}")
	private  String yunyingUrlPath;
	public String getYunyingUrlPath() {
		return yunyingUrlPath;
	}
	
	// 登记结算系统平台ID
	@Value("${hshuiyuan.ipodregPlatformId:2e2302818a996993c08f2f07c9606e79}")
	private String ipodregPlatformId;
	
	//企业信息查询接口
	public  final String  QUERYCOMPINFOREQUEST = "QueryCompInfoRequest";
	//个人信息查询接口
	public  final String  QUERYUSERINFOREQUEST = "QueryUserInfoRequest";
	//用户登陆接口
	public  final String  LOGINBYACCOUNTREQUEST = "LoginByAccountRequest";
	//用户登出接口
	public  final String  LOGOUTBYACCOUNTREQUEST = "LogoutByAccountRequest";
	//用户注册接口
	public  final String  USERREGISTERREQUEST = "UserRegisterRequest";
	//用户发短信接口
	public final String USERMOBILECODEREQUEST = "userMobileCodeRequest";
	//快捷登录短信接口
	public final String SENDMESSAGEREQUEST = "SendMessageRequest";
	//修改密码
	public final String USERCHANGEPWDREQUEST = "userChangePwdRequest";

	/**
	 * 用户手机密码重置接口
	 */
	public final String USERRESETPWDREQUEST = "userResetPwdRequest";

	//用户注册手机号校验接口
	public final String CHECKUSERPHONEREQUEST = "CheckUserPhoneRequest";
	//实名认证通知接口
	public final String CERTIFICATIONREQUEST = "CertificationRequest";
	// 投资人名册同步接口
	public final String RECEIVE_INVESTOR_REQUEST = "ReceiveInvestorRequest";
	// 更换手机号接口
	public final String USERCHANGECELLPHONEREQUEST = "userChangeCellPhoneRequest";

	/**
	 *统一会员对外接口
	 */
	/**
	 * 3.1.	我的关注
	 */
	public final String QUERYMYCOLLECTIONFUNDINFOLISTREQUEST = "QueryMyCollectionFundinfoRequest";
	/**
	 * 3.2.	撮合项目列表
	 */
	public final String QUERYFUNDINFOLISTREQUEST = "QueryFundinfoListRequest";
	/**
	 * 3.3.	资产交易列表
	 */
	public final String QUERYASSERTPRODUCTLISTREQUEST = "QueryAssertProductListRequest";
	/**
	 * 3.5.	资产交易详情
	 */
	public final String QUERYASSERTPRODUCTINFOREQUEST = "QueryAssertProductInfoRequest";
	/**
	 * 3.6.	项目留言查阅
	 */
	public final String MESSAGEQUERYREQUEST = "MessageQueryRequest";
	/**
	 * 3.7.	项目留言提交
	 */
	public final String MESSAGESUBMITREQUEST = "MessageSubmitRequest";
	/**
	 * 3.8.	项目评分查阅
	 */
	public final String GETSCOREINFOREQUEST = "GetScoreInfoRequest";
	/**
	 * 3.9.	项目评分提交
	 */
	public final String POSTSCOREINFOREQUEST = "PostScoreInfoRequest";
	/**
	 * 3.10.	首页统计
	 */
	public final String QUERYHOMESTATISTICSINFOREQUEST  = "QueryHomeStatisticsInfoRequest ";
	/**
	 * 3.11.	我的发布撮合
	 */
	public final String QUERYMYINFOMATIONLISTREQUEST = "QueryMyInfomationListRequest";
	/**
	 *3.12.	我的发布资产交易
	 */
	public final String QUERYMYASSERTPRODUCTLISTREQUEST = "QueryMyAssertProductListRequest";
	/**
	 *3.13.	我的足迹
	 */
	public final String QUERYMYFOOTPRINTREQUEST = "QueryMyFootprintRequest";
	/**
	 *3.14.	我的访客
	 */
	public final String QUERYMYVISITORREQUEST = "QuerymyVisitorRequest";
	/**
	 *3.15.	我的留言列表
	 */
	public final String PROJECTWITHMESSAGELISTREQUEST = "ProjectWithMessageListRequest";
	/**
	 *3.16.	我的留言详情
	 */
	//public final String MESSAGEDETAILREQUEST = "MessageDetailRequest";
	/**
	 *3.17.	观看历史列表
	 */
	public final String QUERYVIEWRECORDPAGEREQUEST = "QueryViewRecordPageRequest";
	/**
	 *3.18.	离线空间列表
	 */
	public final String QUERYJOINRECORDPAGEREQUEST = "QueryJoinRecordPageRequest";
	/**
	 *3.19.	站内信列表
	 */
	public final String QUERYMSGPAGEREQUEST = "QueryMsgPageRequest";
	/**
	 *3.20.	站内信详情
	 */
	public final String GETMESSAGEBYIDREQUEST = "GetMessageByIdRequest";
	/**
	 *3.21.	获取省份接口
	 */
	public final String GETPROVINCEDATAREQUEST = "GetProvinceDataRequest";
	/**
	 *3.22.	根据省份获取市区接口
	 */
	public final String GETCITYDATAREQUEST = "GetCityDataRequest";
	/**
	 * 3.23.	个人会员注册（丁烁）
	 	功能说明：根据pc端个人注册方式提供个人会员注册接口。
	 */
	public final String PERSONREGISTERREQUEST = "PersonRegisterRequest";
	/**
	 * 3.58.	修改用户头像
	 	功能说明：修改用户头像
	 */
	public final String UPDATEUSERIMAGEREQUEST = "UpdateUserImageRequest";
	/**
	 * 企业注册
	 */
	public final String AGENTREGISTERREQUEST = "AgentRegisterRequest";

	public String getPrivateKeyPath() {
        return privateKeyPath;
    }
	public String getPublicKeyPath() {
        return publicKeyPath;
    }
	public String getPrivatePassWord() {
        return privatePassWord;
    }
	public String getPlatformId() {
        return platformId;
    }
    public  String getSpacePlatformId(){
		return spacePlatformId;
	}
	public String getAppKey() {
        return appKey;
    }
	public String getPrivateKeyHS() {
        return privateKeyHS;
    }
	public String getPublicKeyHS() {
        return publicKeyHS;
    }
	public String getUrlPath() {
        return urlPath;
    }
    public String getStarSpaceUrlPath(){
		return starSpaceUrlPath;
	}
	public String getIpodregUrlPath() {
		return ipodregUrlPath;
	}
	public String getIpodregPlatformId() {
		return ipodregPlatformId;
	}

	/**
	 * 实例化公钥
	 *
	 * @return
	 */
	private PublicKey getPubKey(String pubKey) {
		PublicKey publicKey = null;
		try {
			java.security.spec.X509EncodedKeySpec bobPubKeySpec = new java.security.spec.X509EncodedKeySpec(new BASE64Decoder().decodeBuffer(pubKey));
			// RSA对称加密算法
			KeyFactory keyFactory;
			keyFactory = KeyFactory.getInstance("RSA");
			// 取公钥匙对象
			publicKey = keyFactory.generatePublic(bobPubKeySpec);
		}catch (Exception e) {
			e.printStackTrace();
		}
		return publicKey;
	}

	/**
	 * 实例化私钥
	 *
	 * @return
	 */
	private PrivateKey getPrivateKey(String priKey) {
		PrivateKey privateKey = null;
		PKCS8EncodedKeySpec priPKCS8;
		try {
			priPKCS8 = new PKCS8EncodedKeySpec(new BASE64Decoder().decodeBuffer(priKey));
			KeyFactory keyf = KeyFactory.getInstance("RSA");
			privateKey = keyf.generatePrivate(priPKCS8);
		}catch (Exception e) {
			e.printStackTrace();
		}
		return privateKey;
	}


	/**
     * 用私钥生成签名
     * @param parmDataMap 参数对象
     * @param privateKey 私钥
     * @return 生成的sign签名串
     */
    public  String genSign(Map<String, Object> parmDataMap, String privateKey) {
    	String sign = "";
    	try {
			String sortPramData = sortMap(parmDataMap);
			if (StringUtils.startsWith(sortPramData, "&"))
				sortPramData = sortPramData.substring(1);
			System.out.println("生成签名排序后的参数："+sortPramData);
			sign = RSAUtils.sign(sortPramData.getBytes(), privateKey);
		} catch (Exception e) {
			e.printStackTrace();
		}
    	return sign;
    }
    
    
    /**
     * 用私钥生成签名（需要平台id,aookey参与加签）
     * @param parmDataMap 参数对象
     * @return 生成的sign签名串
     */
    public  String genSignTJS(Map<String, Object> parmDataMap) {
		parmDataMap.put("platformId",platformId);
		parmDataMap.put("appKey", appKey);
		String sign = "";
		try {
			String sortPramData = sortMap(parmDataMap);
			if (StringUtils.startsWith(sortPramData, "&"))
				sortPramData = sortPramData.substring(1);
			System.out.println("生成签名排序后的参数："+sortPramData);
			String pfxPath = privateKeyPath;
			String priKeyPass = privatePassWord;
			PrivateKey privateKey = RsaReadUtil.getPrivateKeyFromFile(pfxPath,priKeyPass);
			sign = RSAUtils.signTJS(sortPramData.getBytes(), privateKey);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return sign;
    }
    
    @SuppressWarnings("unchecked")
    public  String sortMap(Map<String, Object> map) {
		StringBuilder msg = new StringBuilder ();
		if (map.containsKey ("sign")) {
			map.remove ("sign");
		}
		TreeMap<String, Object> treeMap = new TreeMap<String, Object> (new CustomTreeMapComparator<String> ());
		treeMap.putAll (map);
		Object[] keys = treeMap.keySet ().toArray ();
		if (null != keys && keys.length > 0) {
			for (int i = 0; i < keys.length; i++) {
				if (null != treeMap.get (keys[i])) {
					Object value = treeMap.get (keys[i]);
					if (value instanceof JSONArray) {
						JSONArray jsonArray = (JSONArray) value;
						for (Object jsonObj : jsonArray) {
							msg.append (sortMap ((Map<String, Object>) jsonObj));
						}
					} else
						if (value instanceof String && null != value.toString () && !"".equals (value.toString ())) {
							msg.append ("&").append (keys[i]).append ("=").append (value.toString ());
						} else if (value instanceof Long || value instanceof Double || value instanceof Float) {
							msg.append ("&").append (keys[i]).append ("=").append (value);
						}
				}
			}
		}
		return msg.toString ();
	}
    public  String doPost(String url,Map<String,String> map,String charset){  
        HttpClient httpClient = null;
        HttpPost httpPost = null;
        String result = null;  
        try{  
            httpClient = HttpClients.createDefault();
            httpPost = new HttpPost(url);
            // 注意content-type要使用application/x-www-form-urlencoded这种方式
            httpPost.setHeader("Content-type", "application/x-www-form-urlencoded; charset=utf-8");
            //设置参数  
            List<NameValuePair> list = new ArrayList<NameValuePair>();
            Iterator iterator = map.entrySet().iterator();  
            while(iterator.hasNext()){  
                Entry<String,String> elem = (Entry<String, String>) iterator.next();  
                list.add(new BasicNameValuePair(elem.getKey(),elem.getValue()));
            }  
            if(list.size() > 0){  
                UrlEncodedFormEntity entity = new UrlEncodedFormEntity(list,charset);
                httpPost.setEntity(entity);  
            }  
            HttpResponse response = httpClient.execute(httpPost);
            if(response != null){  
                HttpEntity resEntity = response.getEntity();
                if(resEntity != null){  
                    result = EntityUtils.toString(resEntity,charset);
                    System.out.println("Post请求返回值："+result);
                }  
            }  
        }catch(Exception ex){  
            ex.printStackTrace();  
        }  
        return result;  
    }  
    
    public  void doGet(String urlNameString){
    	try {
            // 根据地址获取请求
            HttpGet request = new HttpGet(urlNameString);//这里发送get请求
            // 获取当前客户端对象
            HttpClient httpClient = new DefaultHttpClient();
            // 通过请求对象获取响应对象
            HttpResponse response = httpClient.execute(request);
            
            // 判断网络连接状态码是否正常(0--200都数正常)
            if (response.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
                String result= EntityUtils.toString(response.getEntity(),"utf-8");
                System.out.println("Get 请求返回值：" + result);
            } 
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
