package com.space.common.util;

import org.apache.commons.codec.binary.Base64;

import java.io.*;

/**
 * @author lihan
 * @Title: Img2Base64Util
 * @Description: * 将图片转换为Base64<br>
 * 将base64编码字符串解码成img图片
 * @date 2018-12-10 15:33
 */
public class Img2Base64Util {

    public static void main(String[] args) {
        String imgFile = "e:\\1.jpg";//待处理的图片
        String imgbese=getImgStr(imgFile);
        System.out.println(imgbese.length());
        System.out.println(imgbese);
//        String imgFilePath = "d:\\332.jpg";//新生成的图片
//        generateImage(imgbese,imgFilePath);
    }
    /**
     * 将图片转换成Base64编码
     * @param imgFile 待处理图片
     * @return
     */
    public static String getImgStr(String imgFile){
        //将图片文件转化为字节数组字符串，并对其进行Base64编码处理


        InputStream in = null;
        byte[] data = null;
        //读取图片字节数组
        try
        {
            in = new FileInputStream(imgFile);
            data = new byte[in.available()];
            in.read(data);
            in.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        return new String(Base64.encodeBase64(data));
    }

    /**
     * 对字节数组字符串进行Base64解码并生成图片
     * @param imgStr 图片数据
     * @param imgFilePath 保存图片全路径地址
     * @return
     */
    public static boolean generateImage(String imgStr,String imgFilePath){
        //
        if (imgStr == null) //图像数据为空
            return false;

        try
        {
            //Base64解码
            byte[] b = Base64.decodeBase64(imgStr);
            for(int i=0;i<b.length;++i)
            {
                if(b[i]<0)
                {//调整异常数据
                    b[i]+=256;
                }
            }
            //生成jpeg图片

            OutputStream out = new FileOutputStream(imgFilePath);
            out.write(b);
            out.flush();
            out.close();
            return true;
        }
        catch (Exception e)
        {
            return false;
        }
    }

    /**
     * 对字节数组字符串进行Base64解码并生成图片
     * @param imgStr 图片数据
     * @return
     */
    public static File generateImageFile(String fileName,String imgStr){
        try
        {
            //Base64解码
            byte[] b = Base64.decodeBase64(imgStr);
            for(int i=0;i<b.length;++i)
            {
                if(b[i]<0)
                {//调整异常数据
                    b[i]+=256;
                }
            }
            File file = new File(fileName);
            OutputStream output = new FileOutputStream(file);
            BufferedOutputStream bufferedOutput = new BufferedOutputStream(output);
            bufferedOutput.write(b);
            return file;
        }
        catch (Exception e)
        {
            return null;
        }
    }

}
