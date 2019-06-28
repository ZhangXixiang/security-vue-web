package com.space.common.util;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

//import java.io.IOException;
//import java.nio.channels.FileChannel;
//import it.sauronsoftware.jave.Encoder;
//import it.sauronsoftware.jave.MultimediaInfo;

public class FileUtil {

	/**
	 * 获取图片宽高
	 * @param file  图片文件
	 * @return 宽度
	 */
	public static Map<String, String> getImgWidth(File file) {
		InputStream is = null;
		BufferedImage src = null;
		Map<String, String> res = new HashMap<String, String>();
		try {
			is = new FileInputStream(file);
			src = javax.imageio.ImageIO.read(is);
			Integer wide = src.getWidth(); // 得到源图宽
			Integer high = src.getHeight(); // 得到源图高
			is.close();
			res.put("wide", wide.toString());
			res.put("high", high.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return res;
	}

	/**
	 * 获取视频宽高
	 * @param file  图片文件
	 * @return 宽度
	 */
	public static Map<String, String> getVideoWidth(File source) {
//		Encoder encoder = new Encoder();
//		FileChannel fc= null;
//		Map<String, String> res = new HashMap<String, String>();
//		try {
//			MultimediaInfo m = encoder.getInfo(source);
//			//视频帧宽高
//			res.put("wide", m.getVideo().getSize().getWidth() + "");
//			res.put("high", m.getVideo().getSize().getHeight() + "");
//		} catch (Exception e) {
//			e.printStackTrace();
//		}finally {
//			if (null!=fc){
//				try {
//					fc.close();
//				} catch (IOException e) {
//					e.printStackTrace();
//				}
//			}
//		}
//		return res;
		return null;
	}
}























