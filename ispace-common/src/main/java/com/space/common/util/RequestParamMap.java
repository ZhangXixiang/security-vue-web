package com.space.common.util;

import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

/**
 * 处理请求参数为map
 */
public class RequestParamMap {

    public static Map getParamMap(HttpServletRequest request){

        Map paramMap=new HashMap();
        Enumeration enu=request.getParameterNames();
        while(enu.hasMoreElements()){
            String paraName=(String)enu.nextElement();
            paramMap.put(paraName,request.getParameter(paraName));
        }
        return paramMap;
    }
}
