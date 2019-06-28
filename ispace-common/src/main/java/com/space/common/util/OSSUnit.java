package com.space.common.util;

import com.aliyun.oss.OSSClient;
import com.aliyun.oss.model.Bucket;
import com.aliyun.oss.model.OSSObject;
import com.aliyun.oss.model.ObjectMetadata;
import com.aliyun.oss.model.PutObjectResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Calendar;
import java.util.Random;

@Component
public class OSSUnit {

	private static final Logger LOG = LoggerFactory.getLogger(OSSUnit.class);
	/**
	 * 阿里云API的外网域名
	 */
	private static String ENDPOINT;
	/**
	 * 	阿里云API的密钥Access Key ID
	 */
	private static String ACCESS_KEY_ID;
	/**
	 *	阿里云API的密钥Access Key Secret=
	 */
	private static String ACCESS_KEY_SECRET;

	/**
	 * 存储空间名
	 */
	private static String BUCKET_NAME;

	@Value("${ENDPOINT}")
	public void setENDPOINT(String ENDPOINT) {
		OSSUnit.ENDPOINT = ENDPOINT;
	}
	@Value("${AccessKeyId}")
	public void setAccessKeyId(String accessKeyId) {
		ACCESS_KEY_ID = accessKeyId;
	}
	@Value("${AccessKeySecret}")
	public void setAccessKeySecret(String accessKeySecret) {
		ACCESS_KEY_SECRET = accessKeySecret;
	}

	@Value("${BUCKET_NAME}")
	public void setBucketName(String BUCKET_NAME) {
		OSSUnit.BUCKET_NAME = BUCKET_NAME;
	}
	/**
	 * 获取阿里云OSS客户端对象
	 * */
	public static OSSClient getOSSClient(){
		return new OSSClient(ENDPOINT,ACCESS_KEY_ID,ACCESS_KEY_SECRET);
	}

	/**
	 * 新建Bucket  --Bucket权限:私有
	 * @param bucketName bucket名称
	 * @return true 新建Bucket成功
	 * */
	public static final boolean createBucket(OSSClient client, String bucketName){
		Bucket bucket = client.createBucket(bucketName);
		return bucketName.equals(bucket.getName());
	}

	/**
	 * 删除Bucket
	 * @param bucketName bucket名称
	 * */
	public static final void deleteBucket(OSSClient client, String bucketName){
		client.deleteBucket(bucketName);
		LOG.info("删除" + bucketName + "Bucket成功");
	}

	/**
	 * 向阿里云的OSS存储中存储文件  --file也可以用InputStream替代
	 * @param client OSS客户端
	 * @param file 上传文件
	 * @param bucketName bucket名称
	 * @param diskName 上传文件的目录  --bucket下文件的路径
	 * @return String 唯一MD5数字签名
	 * */
	public static final String uploadObject2OSS(OSSClient client, File file, String bucketName, String diskName) {
		String resultStr = null;
		try {
			InputStream is = new FileInputStream(file);
			String fileName = file.getName();
			Long fileSize = file.length();
			//创建上传Object的Metadata
			ObjectMetadata metadata = new ObjectMetadata();
			metadata.setContentLength(is.available());
			metadata.setCacheControl("no-cache");
			metadata.setHeader("Pragma", "no-cache");
			metadata.setContentEncoding("utf-8");
			metadata.setContentType(getContentType(fileName));
			metadata.setContentDisposition("filename/filesize=" + fileName + "/" + fileSize + "Byte.");
			//上传文件
			/*
			   bucketName - Bucket名称。
			   key - object的key。
			   input - 输入流。
			   metadata - object的元信息ObjectMetadata，若该元信息未包含Content-Length， 则采用chunked编码传输请求数据。
			 */
			PutObjectResult putResult = client.putObject(bucketName, diskName + fileName, is, metadata);
			//解析结果
			resultStr = putResult.getETag();
		} catch (Exception e) {
			LOG.error("上传阿里云OSS服务器异常." + e.getMessage(), e);
		}
		return resultStr;
	}

	/**
	 * 根据key获取OSS服务器上的文件输入流
	 * @param client OSS客户端
	 * @param bucketName bucket名称
	 * @param diskName 文件路径
	 * @param key Bucket下的文件的路径名+文件名
	 */
	public static final InputStream getOSS2InputStream(OSSClient client, String bucketName, String diskName, String key){
		/*	bucketName - Bucket名称。
			key - Object Key*/
		OSSObject ossObj = client.getObject(bucketName, diskName + key);
		return ossObj.getObjectContent();
	}

	/**
	 * 根据key删除OSS服务器上的文件
	 * @param client OSS客户端
	 * @param bucketName bucket名称
	 * @param diskName 文件路径
	 * @param key Bucket下的文件的路径名+文件名
	 */
	public static void deleteFile(OSSClient client, String bucketName, String diskName, String key){
		client.deleteObject(bucketName, diskName + key);
		LOG.info("删除" + bucketName + "下的文件" + diskName + key + "成功");
	}

	/**
	 * 通过文件名判断并获取OSS服务文件上传时文件的contentType
	 * @param fileName 文件名
	 * @return 文件的contentType
	 */
	public static final String getContentType(String fileName){
		String fileExtension = fileName.substring(fileName.lastIndexOf("."));
		if(".bmp".equalsIgnoreCase(fileExtension)){ return "image/bmp";}
		if(".gif".equalsIgnoreCase(fileExtension))
		{
			return "image/gif";
		}
		if(".jpeg".equalsIgnoreCase(fileExtension) || ".jpg".equalsIgnoreCase(fileExtension)  || ".png".equalsIgnoreCase(fileExtension) )
		{
			return "image/jpeg";
		}
		if(".html".equalsIgnoreCase(fileExtension)) {
			return "text/html";
		}
		if(".txt".equalsIgnoreCase(fileExtension)) {
			return "text/plain";
		}
		if(".vsd".equalsIgnoreCase(fileExtension)){
			return "application/vnd.visio";
		}
		if(".ppt".equalsIgnoreCase(fileExtension) || ".pptx".equalsIgnoreCase(fileExtension)) {
			return "application/vnd.ms-powerpoint";
		}
		if(".doc".equalsIgnoreCase(fileExtension) || ".docx".equalsIgnoreCase(fileExtension)) {
			return "application/msword";
		}
		if(".xml".equalsIgnoreCase(fileExtension)) {
			return "text/xml";
		}
		return "text/html";
	}


	/**
	 * 获取文件50年的有效地址
	 * @param ossClient
	 * @param key
	 * @param bucketName
	 * @return
	 */
	public static String getUrl(OSSClient ossClient,String key,String bucketName) {
		// 设置URL过期时间为50年  3600* 1000*24*365*50
   /*Date expiration = new Date(System.currentTimeMillis() + 3600 * 1000 * 24 * 365 * 50);
   // 生成URL
   URL url = ossClient.generatePresignedUrl(bucketName,key,expiration);
   if (url != null) {
      return url.toString();
   }
   return null;*/
		return bucketName+"."+ENDPOINT+"/"+key;
	}

	/**
	 * 上传，并返回在文件oss上的存储路径
	 * @param is
	 * @param fileName
	 * @return
	 */
	public static final String uploadInfo(InputStream is, String fileName){
		OSSClient client = getOSSClient();
		String resultUrl = "";
		try {
			Random random = new Random(); // 定义一个随机数
			long a = System.currentTimeMillis();
			String current = String.valueOf(a);
			String randomName = random.nextInt(9000) + 1000 + current;// 产生随机数组合
			String prefix = fileName.substring(fileName.lastIndexOf(".") + 1);// 得到文件后缀
			fileName = randomName + "." + prefix;// 生成最终文件名
			ObjectMetadata metadata = new ObjectMetadata();// ObjectMetaData是用户对该object的描述
			metadata.setCacheControl("no-cache");
			metadata.setHeader("Pragma", "no-cache");
			metadata.setContentEncoding("utf-8");
			metadata.setContentType(getContentType(fileName));
			Calendar cal = Calendar.getInstance();
			int year = cal.get(1);
			int month = cal.get(2) + 1;
			String diskName = year + "/" + month + "/";
			client.putObject(BUCKET_NAME, diskName + fileName, is, metadata);
			//resultUrl = "https://存储空间的名称.oss-cn-shenzhen.aliyuncs.com/" + diskName + fileName;
			resultUrl = "https://"+BUCKET_NAME+"."+ENDPOINT+"/" + diskName + fileName;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			client.shutdown();
		}
		return resultUrl;
	}
}