package com.space.common.util;

import java.util.UUID;

/**
 * @author lihan
 * @Title: UUIDUtils
 * @Description: UUIDUtils 生成uuid
 * @date 2018-12-07 9:44
 */
public class UUIDUtils {

    /** 得到uuid(已经剔除"-"符号) eg:841ff836d69a467aa7094792c325eb26**/
    public static String getUUID() {
        return UUID.randomUUID().toString().replace("-", "");
    }

    public static void main(String[] args) {
        System.out.println("格式前的UUID ： " + UUID.randomUUID().toString());
        System.out.println("格式化后的UUID ：" + getUUID());
    }
}
