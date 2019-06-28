package com.space.common.util;

import org.apache.commons.lang3.text.StrBuilder;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.SerializationConfig;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 字符串工具类
 *
 * @author ruoyi
 */
public class StringUtils extends org.apache.commons.lang3.StringUtils
{
	/** 空字符串 */
	private static final String NULLSTR = "";

	/** 下划线 */
	private static final char SEPARATOR = '_';

	/**
	 * 获取参数不为空值
	 *
	 * @param value defaultValue 要判断的value
	 * @return value 返回值
	 */
	public static <T> T nvl(T value, T defaultValue)
	{
		return value != null ? value : defaultValue;
	}

	/**
	 * * 判断一个Collection是否为空， 包含List，Set，Queue
	 *
	 * @param coll 要判断的Collection
	 * @return true：为空 false：非空
	 */
	public static boolean isEmpty(Collection<?> coll)
	{
		return isNull(coll) || coll.isEmpty();
	}

	/**
	 * * 判断一个Collection是否非空，包含List，Set，Queue
	 *
	 * @param coll 要判断的Collection
	 * @return true：非空 false：空
	 */
	public static boolean isNotEmpty(Collection<?> coll)
	{
		return !isEmpty(coll);
	}

	/**
	 * * 判断一个对象数组是否为空
	 *
	 * @param objects 要判断的对象数组
	 ** @return true：为空 false：非空
	 */
	public static boolean isEmpty(Object[] objects)
	{
		return isNull(objects) || (objects.length == 0);
	}

	/**
	 * * 判断一个对象数组是否非空
	 *
	 * @param objects 要判断的对象数组
	 * @return true：非空 false：空
	 */
	public static boolean isNotEmpty(Object[] objects)
	{
		return !isEmpty(objects);
	}

	/**
	 * * 判断一个Map是否为空
	 *
	 * @param map 要判断的Map
	 * @return true：为空 false：非空
	 */
	public static boolean isEmpty(Map<?, ?> map)
	{
		return isNull(map) || map.isEmpty();
	}

	/**
	 * * 判断一个Map是否为空
	 *
	 * @param map 要判断的Map
	 * @return true：非空 false：空
	 */
	public static boolean isNotEmpty(Map<?, ?> map)
	{
		return !isEmpty(map);
	}

	/**
	 * * 判断一个字符串是否为空串
	 *
	 * @param str String
	 * @return true：为空 false：非空
	 */
	public static boolean isEmpty(String str)
	{
		return isNull(str) || NULLSTR.equals(str.trim());
	}

	/**
	 * * 判断一个字符串是否为非空串
	 *
	 * @param str String
	 * @return true：非空串 false：空串
	 */
	public static boolean isNotEmpty(String str)
	{
		return !isEmpty(str);
	}

	/**
	 * * 判断一个对象是否为空
	 *
	 * @param object Object
	 * @return true：为空 false：非空
	 */
	public static boolean isNull(Object object)
	{
		return object == null;
	}

	/**
	 * * 判断一个对象是否非空
	 *
	 * @param object Object
	 * @return true：非空 false：空
	 */
	public static boolean isNotNull(Object object)
	{
		return !isNull(object);
	}

	/**
	 * * 判断一个对象是否是数组类型（Java基本型别的数组）
	 *
	 * @param object 对象
	 * @return true：是数组 false：不是数组
	 */
	public static boolean isArray(Object object)
	{
		return isNotNull(object) && object.getClass().isArray();
	}

	/**
	 * 去空格
	 */
	public static String trim(String str)
	{
		return (str == null ? "" : str.trim());
	}

	/**
	 * 截取字符串
	 *
	 * @param str 字符串
	 * @param start 开始
	 * @return 结果
	 */
	public static String substring(final String str, int start)
	{
		if (str == null)
		{
			return NULLSTR;
		}

		if (start < 0)
		{
			start = str.length() + start;
		}

		if (start < 0)
		{
			start = 0;
		}
		if (start > str.length())
		{
			return NULLSTR;
		}

		return str.substring(start);
	}

	/**
	 * 截取字符串
	 *
	 * @param str 字符串
	 * @param start 开始
	 * @param end 结束
	 * @return 结果
	 */
	public static String substring(final String str, int start, int end)
	{
		if (str == null)
		{
			return NULLSTR;
		}

		if (end < 0)
		{
			end = str.length() + end;
		}
		if (start < 0)
		{
			start = str.length() + start;
		}

		if (end > str.length())
		{
			end = str.length();
		}

		if (start > end)
		{
			return NULLSTR;
		}

		if (start < 0)
		{
			start = 0;
		}
		if (end < 0)
		{
			end = 0;
		}

		return str.substring(start, end);
	}

	/**
	 * 格式化文本, {} 表示占位符<br>
	 * 此方法只是简单将占位符 {} 按照顺序替换为参数<br>
	 * 如果想输出 {} 使用 \\转义 { 即可，如果想输出 {} 之前的 \ 使用双转义符 \\\\ 即可<br>
	 * 例：<br>
	 * 通常使用：format("this is {} for {}", "a", "b") -> this is a for b<br>
	 * 转义{}： format("this is \\{} for {}", "a", "b") -> this is \{} for a<br>
	 * 转义\： format("this is \\\\{} for {}", "a", "b") -> this is \a for b<br>
	 *
	 * @param template 文本模板，被替换的部分用 {} 表示
	 * @param params 参数值
	 * @return 格式化后的文本
	 */
	public static String format(String template, Object... params)
	{
		if (isEmpty(params) || isEmpty(template))
		{
			return template;
		}
		return StrFormatter.format(template, params);
	}

	/**
	 * 驼峰首字符小写
	 */
	public static String uncapitalize(String str)
	{
		int strLen;
		if (str == null || (strLen = str.length()) == 0)
		{
			return str;
		}
		return new StrBuilder(strLen).append(Character.toLowerCase(str.charAt(0))).append(str.substring(1)).toString();
	}

	/**
	 * 下划线转驼峰命名
	 */
	public static String toUnderScoreCase(String s)
	{
		if (s == null)
		{
			return null;
		}
		StringBuilder sb = new StringBuilder();
		boolean upperCase = false;
		for (int i = 0; i < s.length(); i++)
		{
			char c = s.charAt(i);

			boolean nextUpperCase = true;

			if (i < (s.length() - 1))
			{
				nextUpperCase = Character.isUpperCase(s.charAt(i + 1));
			}

			if ((i > 0) && Character.isUpperCase(c))
			{
				if (!upperCase || !nextUpperCase)
				{
					sb.append(SEPARATOR);
				}
				upperCase = true;
			}
			else
			{
				upperCase = false;
			}

			sb.append(Character.toLowerCase(c));
		}

		return sb.toString();
	}

	/**
	 * 是否包含字符串
	 *
	 * @param str 验证字符串
	 * @param strs 字符串组
	 * @return 包含返回true
	 */
	public static boolean inStringIgnoreCase(String str, String... strs)
	{
		if (str != null && strs != null)
		{
			for (String s : strs)
			{
				if (str.equalsIgnoreCase(trim(s)))
				{
					return true;
				}
			}
		}
		return false;
	}

	/**
	 * 将下划线大写方式命名的字符串转换为驼峰式。如果转换前的下划线大写方式命名的字符串为空，则返回空字符串。 例如：HELLO_WORLD->HelloWorld
	 *
	 * @param name 转换前的下划线大写方式命名的字符串
	 * @return 转换后的驼峰式命名的字符串
	 */
	public static String convertToCamelCase(String name)
	{
		StringBuilder result = new StringBuilder();
		// 快速检查
		if (name == null || name.isEmpty())
		{
			// 没必要转换
			return "";
		}
		else if (!name.contains("_"))
		{
			// 不含下划线，仅将首字母大写
			return name.substring(0, 1).toUpperCase() + name.substring(1);
		}
		// 用下划线将原始字符串分割
		String[] camels = name.split("_");
		for (String camel : camels)
		{
			// 跳过原始字符串中开头、结尾的下换线或双重下划线
			if (camel.isEmpty())
			{
				continue;
			}
			// 首字母大写
			result.append(camel.substring(0, 1).toUpperCase());
			result.append(camel.substring(1).toLowerCase());
		}
		return result.toString();
	}




	/**
	 * Object转换为json字符串
	 * param str
	 * return
	 */
	public static String paseObjToString(Object obj){
		ObjectMapper objectMapper=new ObjectMapper();
//		objectMapper.disable(DeserializationConfig.Feature.FAIL_ON_UNKNOWN_PROPERTIES);
		objectMapper.configure(SerializationConfig.Feature.FAIL_ON_EMPTY_BEANS, false);
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		objectMapper.setDateFormat(format);
		try {
			return objectMapper.writeValueAsString(obj);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "";
	}
	/**
	 * 字符串转换为整形
	 * @param str
	 * @return
	 */
	public static int paseStringToInt(String str){
		if(str==null || "".equals(str)){
			return 0;
		}
		return Integer.parseInt(str);
	}



	/**
	 * @param str
	 * @param t
	 * @return
	 * @description json字符串转换为Object
	 * @version 1.0
	 * @author shower
	 * @update May 28, 2014 12:24:49 PM
	 */
	public static <T> T paseStringToOBj(String str,Class<T> t){
		ObjectMapper objectMapper=new ObjectMapper();
		try {
			objectMapper.enableDefaultTyping();
			return  objectMapper.readValue(str, t);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * json字符串转换为Map
	 * @param jsonStr
	 * @return
	 * @version 1.0
	 * @author shower
	 * @update 2016年7月11日 下午4:20:45
	 */
	public static Map<Object,Object> paseJsonStrToMap(String jsonStr){
		ObjectMapper mapper = new ObjectMapper();
		try{
			Map<Object,Object> map = mapper.readValue(jsonStr, Map.class);
			return map;
		}catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}


	/**
	 * int转换为字符串
	 * @param in
	 * @return
	 */
	public static String[] paseIntToString(int[] in){
		String[] str=new String[in.length];
		for(int i=0;i<in.length;i++ ){
			str[i]=String.valueOf(in[i]);
		}
		return str;
	}


	public static StringBuffer genDateHql(String column,String flag,String date){
		StringBuffer hql=new StringBuffer();
		hql.append(" and date_format(o.").append(column).append(",'%Y-%m-%d')")
				.append(flag).append("'")
				.append(date).append("'");
		return hql;
	}


	/**
	 * @param str
	 * @return
	 * @description 屏蔽长度大于0的字符串str（不区分中文、英文、全角字符、半字符，各占一位长度）
	 * 如str：张，                                    则显示：张**
	 * 如str：a，                                      则显示：a**
	 * 如str：张三，                               则显示：张**
	 * 如str：ab，                                    则显示：a**
	 * 如str：张三四，                           则显示：张**
	 * 如str：abc，                                   则显示：a**
	 * 如str：张三四五，                       则显示：张三**
	 * 如str：abcd，                                则显示：ab**
	 * 如str：张三四五六，                  则显示：张三**六
	 * 如str：abcde，                             则显示：ab**e
	 * 如str：张三四五六七，            则显示：张三**六七
	 * 如str：abcdef，                           则显示：ab**ef
	 * 如str：张三四五六七八，        则显示：张三**七八
	 * 如str：abcdefg，                        则显示：ab**fg
	 * @version 1.0
	 * @author shower
	 * @update May 16, 2014 11:16:08 AM
	 */
	public static String shieldStr(String str){
		if(str != null && str.length()>0){
			switch(str.length()){
				case 0 : return str;
				case 1 : return str+"**";
				case 2 : return str.substring(0,1)+"**";
				case 3 : return str.substring(0,1)+"**";
				case 4 : return str.substring(0,2)+"**";
				case 5 : return str.substring(0,2)+"**"+str.substring(str.length()-1, str.length());
				default : return str.substring(0,2)+"**"+str.substring(str.length()-2, str.length());
			}
		}else{
			return str;
		}
	}

	/**
	 * 验证字符串是否包含空格
	 * @param str
	 * @return
	 */
	public static boolean checkBlank(String str){
		if(str!=null){
			Pattern pattern = Pattern.compile("[\\s]+");
			Matcher matcher = pattern.matcher(str);
			boolean flag = false;
			while(matcher.find()){
				flag=true;
			}
			return flag;
		}
		return true;
	}

	/**
	 *
	 * 判断字符串是否为空,为空返回true
	 * @param str
	 * @return
	 * @description
	 * @version 1.0
	 * @author shower
	 * @update Jun 10, 2014 6:34:26 PM
	 */
	public static boolean isNull(String str){
		if(str == null || "".equals(str) || "".equals(str.trim()) || "null".equals(str.trim())){
			return true;
		}
		return false;
	}
	/**
	 * 判断字符串是否为手机号
	 * @param phoneStr
	 * @return
	 * @version 1.0
	 * @author shower
	 * @update 2015年6月17日 下午5:41:58
	 */
	public static boolean isPhone(String phoneStr){
		if(isNull(phoneStr)){
			return false;
		}
		String regExp = "^1[3|4|5|7|8][0-9]{9}$";
		Pattern p = Pattern.compile(regExp);
		Matcher m = p.matcher(phoneStr);
		return m.find();//boolean
	}



	/**关于中文乱码的处理，解析出错，则抛出异常**/
	public static String conversionEncodingUTF8(String parameter, HttpServletRequest request)throws UnsupportedEncodingException {

		request.setCharacterEncoding("utf-8");
		String afterParameter = new String(parameter.getBytes("ISO-8859-1"), "utf-8");
		return afterParameter;

	}

	/**
	 * 获取字符串的长度，如果有中文，则每个中文字符计为2位
	 *
	 * @param value
	 *            指定的字符串
	 * @return 字符串的长度
	 * @author lihan
	 */
	public static int length(String value) {
		int valueLength = 0;
		String chinese = "[\u0391-\uFFE5]";
		if(value == null ||value.trim().length() == 0){
			return 0;
		}
		/* 获取字段值的长度，如果含中文字符，则每个中文字符长度为2，否则为1 */
		for (int i = 0; i < value.length(); i++) {
			/* 获取一个字符 */
			String temp = value.substring(i, i + 1);
			/* 判断是否为中文字符 */
			if (temp.matches(chinese)) {
				/* 中文字符长度为2 */
				valueLength += 2;
			} else {
				/* 其他字符长度为1 */
				valueLength += 1;
			}
		}
		return valueLength;
	}

	/**
	 *
	 * @Title: isNumeric
	 * @Description: 判断字符串是否全为数字,是数字返回true，否则反之
	 * @param @param str
	 * @param @return 设定文件
	 * @return boolean 返回类型
	 * @author lihan
	 * @throws
	 */
	public static boolean isNumeric(String str) {
		for (int i = str.length(); --i >= 0;) {
			int chr = str.charAt(i);
			if (chr < 48 || chr > 57)
				return false;
		}
		return true;
	}

	/***
	 * @todo 去除非法字符，可能限制的有点多，可以适当的去（主要在拼装sql的时候使用，防止sql注入）
	 * @author binger
	 * @time 2015年7月9日下午3:34:29
	 */
	public static String NoChar(String Htmlstring)
	{
		if (Htmlstring == null)
		{
			return "";
		}
		else
		{
			//删除脚本
			if(Htmlstring.contains("<script[^>]*?>.*?</script>")){
				Htmlstring = Pattern.compile("<script[^>]*?>.*?</script>",Pattern.CASE_INSENSITIVE).matcher(Htmlstring).replaceAll("");
			}
			//删除HTML
			if(Htmlstring.contains("<(.[^>]*)>")){
				Htmlstring = Pattern.compile("<(.[^>]*)>").matcher(Htmlstring).replaceAll("");
			}
			if(Htmlstring.contains("-->")){
				Htmlstring = Pattern.compile("-->").matcher(Htmlstring).replaceAll("");
			}
			if(Htmlstring.contains("<!--.*")){
				Htmlstring = Pattern.compile("<!--.*").matcher(Htmlstring).replaceAll("");
			}
			if(Htmlstring.contains("&(quot|#34);")){
				Htmlstring = Pattern.compile("&(quot|#34);").matcher(Htmlstring).replaceAll("\"");
			}
			if(Htmlstring.contains("&(amp|#38);")){
				Htmlstring = Pattern.compile("&(amp|#38);").matcher(Htmlstring).replaceAll("&");
			}
			if(Htmlstring.contains("&(lt|#60);")){
				Htmlstring = Pattern.compile("&(lt|#60);").matcher(Htmlstring).replaceAll("<");
			}
			if(Htmlstring.contains("&(gt|#62);")){
				Htmlstring = Pattern.compile("&(gt|#62);").matcher(Htmlstring).replaceAll(">");
			}
			if(Htmlstring.contains("&(nbsp|#160);")){
				Htmlstring = Pattern.compile("&(nbsp|#160);").matcher(Htmlstring).replaceAll(" ");
			}
			if(Htmlstring.contains("&(iexcl|#161);")){
				Htmlstring = Pattern.compile("&(iexcl|#161);").matcher(Htmlstring).replaceAll("\"xa1");
			}
			if(Htmlstring.contains("&(cent|#162);")){
				Htmlstring = Pattern.compile("&(cent|#162);").matcher(Htmlstring).replaceAll("\"xa2");
			}
			if(Htmlstring.contains("&(pound|#163);")){
				Htmlstring = Pattern.compile("&(pound|#163);").matcher(Htmlstring).replaceAll("\"xa3");
			}
			if(Htmlstring.contains("&(copy|#169);")){
				Htmlstring = Pattern.compile("&(copy|#169);").matcher(Htmlstring).replaceAll("\"xa9");
			}
			if(Htmlstring.contains("&#(\"d+);")){
				Htmlstring = Pattern.compile("&#(\"d+);").matcher(Htmlstring).replaceAll("");
			}
			if(Htmlstring.contains("xp_cmdshell")){
				Htmlstring = Pattern.compile("xp_cmdshell").matcher(Htmlstring).replaceAll("");
			}
			//删除与数据库相关的词
			if(Htmlstring.contains("select")||Htmlstring.contains("SELECT")){
				Htmlstring = Pattern.compile("select",Pattern.CASE_INSENSITIVE).matcher(Htmlstring).replaceAll("");
			}
			if(Htmlstring.contains("case")||Htmlstring.contains("CASE")){
				Htmlstring = Pattern.compile("case",Pattern.CASE_INSENSITIVE).matcher(Htmlstring).replaceAll("");
			}
			if(Htmlstring.contains(" end ")||Htmlstring.contains(" END ")){
				Htmlstring = Pattern.compile(" end ",Pattern.CASE_INSENSITIVE).matcher(Htmlstring).replaceAll("");
			}
			if(Htmlstring.contains(" when ")||Htmlstring.contains(" WHEN ")){
				Htmlstring = Pattern.compile(" when ",Pattern.CASE_INSENSITIVE).matcher(Htmlstring).replaceAll("");
			}
			if(Htmlstring.contains(" insert ")||Htmlstring.contains("INSERT")){
				Htmlstring = Pattern.compile(" insert ",Pattern.CASE_INSENSITIVE).matcher(Htmlstring).replaceAll("");
			}
			if(Htmlstring.contains(" count ")||Htmlstring.contains("COUNT")){
				Htmlstring = Pattern.compile(" count ",Pattern.CASE_INSENSITIVE).matcher(Htmlstring).replaceAll("");
			}
			if(Htmlstring.contains("delete")||Htmlstring.contains("DELETE")){
				Htmlstring = Pattern.compile( "delete",Pattern.CASE_INSENSITIVE).matcher(Htmlstring).replaceAll("");
			}
			if(Htmlstring.contains("drop")||Htmlstring.contains("DROP")){
				Htmlstring = Pattern.compile("drop",Pattern.CASE_INSENSITIVE).matcher(Htmlstring).replaceAll("");
			}
			if(Htmlstring.contains("truncate")||Htmlstring.contains("TRUNCATE")){
				Htmlstring = Pattern.compile("truncate",Pattern.CASE_INSENSITIVE).matcher(Htmlstring).replaceAll("");
			}
			if(Htmlstring.contains("mid")||Htmlstring.contains("MID")){
				Htmlstring = Pattern.compile("mid",Pattern.CASE_INSENSITIVE).matcher(Htmlstring).replaceAll("");
			}
			if(Htmlstring.contains("char")||Htmlstring.contains("CHAR")){
				Htmlstring = Pattern.compile("char",Pattern.CASE_INSENSITIVE).matcher(Htmlstring).replaceAll("");
			}
			if(Htmlstring.contains("xp_cmdshell")||Htmlstring.contains("XP_CMDSHELL")){
				Htmlstring = Pattern.compile("xp_cmdshell",Pattern.CASE_INSENSITIVE).matcher(Htmlstring).replaceAll("");
			}
			if(Htmlstring.contains("exec master")||Htmlstring.contains("EXEC MASTER")){
				Htmlstring = Pattern.compile("exec master",Pattern.CASE_INSENSITIVE).matcher(Htmlstring).replaceAll("");
			}
			if(Htmlstring.contains("net localgroup administrators")||Htmlstring.contains("NET LOCALGROUP ADMINISTRATORS")){
				Htmlstring = Pattern.compile("net localgroup administrators",Pattern.CASE_INSENSITIVE).matcher(Htmlstring).replaceAll("");
			}
			if(Htmlstring.contains("and")||Htmlstring.contains("AND")){
				Htmlstring = Pattern.compile("and",Pattern.CASE_INSENSITIVE).matcher(Htmlstring).replaceAll("");
			}
			if(Htmlstring.contains("net user")||Htmlstring.contains("NET USER")){
				Htmlstring = Pattern.compile("net user",Pattern.CASE_INSENSITIVE).matcher(Htmlstring).replaceAll("");
			}
			if(Htmlstring.contains("information")||Htmlstring.contains("INFORMATION")){
				Htmlstring = Pattern.compile("information",Pattern.CASE_INSENSITIVE).matcher(Htmlstring).replaceAll("");
			}
			if(Htmlstring.contains(" or ")||Htmlstring.contains(" OR ")){
				Htmlstring = Pattern.compile(" or ",Pattern.CASE_INSENSITIVE).matcher(Htmlstring).replaceAll("");
			}
			if(Htmlstring.contains("net")||Htmlstring.contains("NET")){
				Htmlstring = Pattern.compile("net",Pattern.CASE_INSENSITIVE).matcher(Htmlstring).replaceAll("");
			}
			if(Htmlstring.contains("script")||Htmlstring.contains("SCRIPT")){
				Htmlstring = Pattern.compile("script",Pattern.CASE_INSENSITIVE).matcher(Htmlstring).replaceAll("");
			}
			if(Htmlstring.contains("from")||Htmlstring.contains("FROM")){
				Htmlstring = Pattern.compile("from",Pattern.CASE_INSENSITIVE).matcher(Htmlstring).replaceAll("");
			}
			if(Htmlstring.contains("update")||Htmlstring.contains("UPDATE")){
				Htmlstring = Pattern.compile("update",Pattern.CASE_INSENSITIVE).matcher(Htmlstring).replaceAll("");
			}
			if(Htmlstring.contains("where")||Htmlstring.contains("WHERE")){
				Htmlstring = Pattern.compile("where",Pattern.CASE_INSENSITIVE).matcher(Htmlstring).replaceAll("");
			}
			if(Htmlstring.contains("order")||Htmlstring.contains("PRDER")){
				Htmlstring = Pattern.compile("order",Pattern.CASE_INSENSITIVE).matcher(Htmlstring).replaceAll("");
			}
			if(Htmlstring.contains("group")||Htmlstring.contains("GROUP")){
				Htmlstring = Pattern.compile("group",Pattern.CASE_INSENSITIVE).matcher(Htmlstring).replaceAll("");
			}
			if(Htmlstring.contains("by")||Htmlstring.contains("BY")){
				Htmlstring = Pattern.compile("by",Pattern.CASE_INSENSITIVE).matcher(Htmlstring).replaceAll("");
			}
			if(Htmlstring.contains("ROOT")||Htmlstring.contains("root")){
				Htmlstring = Pattern.compile("root",Pattern.CASE_INSENSITIVE).matcher(Htmlstring).replaceAll("");
			}
			//特殊的字符
			Htmlstring = Htmlstring.indexOf('<') > 0 ? Htmlstring.replace("<", ""):Htmlstring;
			Htmlstring = Htmlstring.indexOf('>') > 0 ? Htmlstring.replace(">", ""):Htmlstring;
			Htmlstring = Htmlstring.indexOf('*') > 0 ? Htmlstring.replace("*", ""):Htmlstring;
			Htmlstring = Htmlstring.indexOf('-') > 0 ? Htmlstring.replace("-", ""):Htmlstring;
			Htmlstring = Htmlstring.indexOf('?') > 0 ? Htmlstring.replace("?", ""):Htmlstring;
			Htmlstring = Htmlstring.indexOf("'") > 0 ? Htmlstring.replace("'", ""):Htmlstring;
			Htmlstring = Htmlstring.indexOf(',') > 0 ? Htmlstring.replace(",", ""):Htmlstring;
			Htmlstring = Htmlstring.indexOf('/') > 0 ? Htmlstring.replace("/", ""):Htmlstring;
			Htmlstring = Htmlstring.indexOf(';') > 0 ? Htmlstring.replace(";", ""):Htmlstring;
			Htmlstring = Htmlstring.indexOf('\r') > 0 ? Htmlstring.replace("\r", ""):Htmlstring;
			Htmlstring = Htmlstring.indexOf('\n') > 0 ? Htmlstring.replace("\n", ""):Htmlstring;
			Htmlstring = Htmlstring.indexOf('(') > 0 ? Htmlstring.replace("(", ""):Htmlstring;
			Htmlstring = Htmlstring.indexOf(')') > 0 ? Htmlstring.replace(")", ""):Htmlstring;
			return Htmlstring;
		}
	}
	/***
	 * @todo 是否含有非法字符，true:含有;false:不含
	 * @author binger
	 * @time 2015年7月9日下午3:34:29
	 */
	public static boolean IllegalChar(String Htmlstring)
	{
		if(isNull(Htmlstring)) return false;
		//删除脚本
		if(Htmlstring.contains("<script[^>]*?>.*?</script>")){
			return true;
		}
		//删除HTML
		if(Htmlstring.contains("<(.[^>]*)>")){
			return true;
		}
		if(Htmlstring.contains("-->")){
			return true;
		}
		if(Htmlstring.contains("<!--.*")){
			return true;
		}
		if(Htmlstring.contains("&(quot|#34);")){
			return true;
		}
		if(Htmlstring.contains("&(amp|#38);")){
			return true;
		}
		if(Htmlstring.contains("&(lt|#60);")){
			return true;
		}
		if(Htmlstring.contains("&(gt|#62);")){
			return true;
		}
		if(Htmlstring.contains("&(nbsp|#160);")){
			return true;
		}
		if(Htmlstring.contains("&(iexcl|#161);")){
			return true;
		}
		if(Htmlstring.contains("&(cent|#162);")){
			return true;
		}
		if(Htmlstring.contains("&(pound|#163);")){
			return true;
		}
		if(Htmlstring.contains("&(copy|#169);")){
			return true;
		}
		if(Htmlstring.contains("&#(\"d+);")){
			return true;
		}
		if(Htmlstring.contains("xp_cmdshell")){
			return true;
		}
		//删除与数据库相关的词
		if(Htmlstring.contains("select")||Htmlstring.contains("SELECT")){
			return true;
		}
		if(Htmlstring.contains("case")||Htmlstring.contains("CASE")){
			return true;
		}
		if(Htmlstring.contains(" end ")||Htmlstring.contains(" END ")){
			return true;
		}
		if(Htmlstring.contains(" when ")||Htmlstring.contains(" WHEN ")){
			return true;
		}
		if(Htmlstring.contains(" insert ")||Htmlstring.contains("INSERT")){
			return true;
		}
		if(Htmlstring.contains(" count ")||Htmlstring.contains("COUNT")){
			return true;
		}
		if(Htmlstring.contains("delete")||Htmlstring.contains("DELETE")){
			return true;
		}
		if(Htmlstring.contains("drop")||Htmlstring.contains("DROP")){
			return true;
		}
		if(Htmlstring.contains("truncate")||Htmlstring.contains("TRUNCATE")){
			return true;
		}
		if(Htmlstring.contains("mid")||Htmlstring.contains("MID")){
			return true;
		}
		if(Htmlstring.contains("char")||Htmlstring.contains("CHAR")){
			return true;
		}
		if(Htmlstring.contains("xp_cmdshell")||Htmlstring.contains("XP_CMDSHELL")){
			return true;
		}
		if(Htmlstring.contains("exec master")||Htmlstring.contains("EXEC MASTER")){
			return true;
		}
		if(Htmlstring.contains("net localgroup administrators")||Htmlstring.contains("NET LOCALGROUP ADMINISTRATORS")){
			return true;
		}
		if(Htmlstring.contains("and")||Htmlstring.contains("AND")){
			return true;
		}
		if(Htmlstring.contains("net user")||Htmlstring.contains("NET USER")){
			return true;
		}
		if(Htmlstring.contains("information")||Htmlstring.contains("INFORMATION")){
			return true;
		}
		if(Htmlstring.contains(" or ")||Htmlstring.contains(" OR ")){
			return true;
		}
		if(Htmlstring.contains("net")||Htmlstring.contains("NET")){
			return true;
		}
		if(Htmlstring.contains("script")||Htmlstring.contains("SCRIPT")){
			return true;
		}
		if(Htmlstring.contains("from")||Htmlstring.contains("FROM")){
			return true;
		}
		if(Htmlstring.contains("update")||Htmlstring.contains("UPDATE")){
			return true;
		}
		if(Htmlstring.contains("where")||Htmlstring.contains("WHERE")){
			return true;
		}
		if(Htmlstring.contains("order")||Htmlstring.contains("PRDER")){
			return true;
		}
		if(Htmlstring.contains("group")||Htmlstring.contains("GROUP")){
			return true;
		}
		if(Htmlstring.contains("by")||Htmlstring.contains("BY")){
			return true;
		}
		if(Htmlstring.contains("ROOT")||Htmlstring.contains("root")){
			return true;
		}
		//特殊的字符
		if(Htmlstring.indexOf('<') > 0){
			return true;
		}
		if( Htmlstring.indexOf('>') > 0){
			return true;
		}
		if( Htmlstring.indexOf('*') > 0){
			return true;
		}
		if( Htmlstring.indexOf('-') > 0){
//				return true; //是不是限制的太死了。时间查询都不可以了 2016-04-01
		}
		if( Htmlstring.indexOf('?') > 0){
			return true;
		}
		if( Htmlstring.indexOf("'") > 0){
			return true;
		}
		if( Htmlstring.indexOf(',') > 0){
			return true;
		}
		if( Htmlstring.indexOf('/') > 0){
			return true;
		}
		if( Htmlstring.indexOf(';') > 0){
			return true;
		}
		if( Htmlstring.indexOf('\r') > 0){
			return true;
		}
		if( Htmlstring.indexOf('\n') > 0){
			return true;
		}
		if( Htmlstring.indexOf('(') > 0){
			return true;
		}
		if( Htmlstring.indexOf(')') > 0){
			return true;
		}
		return false;
	}
	/***
	 * @todo 只过滤字符不包含单词，true:含有;false:不含
	 * @author binger
	 */
	public static boolean IllegalCharacter(String Htmlstring)
	{
		if(isNull(Htmlstring)) return false;
		if(Htmlstring.contains("-->")){
			return true;
		}
		if(Htmlstring.contains("<!--.*")){
			return true;
		}
		if(Htmlstring.contains("&(quot|#34);")){
			return true;
		}
		if(Htmlstring.contains("&(amp|#38);")){
			return true;
		}
		if(Htmlstring.contains("&(lt|#60);")){
			return true;
		}
		if(Htmlstring.contains("&(gt|#62);")){
			return true;
		}
		if(Htmlstring.contains("&(nbsp|#160);")){
			return true;
		}
		if(Htmlstring.contains("&(iexcl|#161);")){
			return true;
		}
		if(Htmlstring.contains("&#(\"d+);")){
			return true;
		}
		//特殊的字符
		if(Htmlstring.indexOf('<') > 0){
			return true;
		}
		if( Htmlstring.indexOf('>') > 0){
			return true;
		}
		if( Htmlstring.indexOf('*') > 0){
			return true;
		}
		if( Htmlstring.indexOf('-') > 0){
//				return true; //是不是限制的太死了。时间查询都不可以了 2016-04-01
		}
		if( Htmlstring.indexOf('?') > 0){
			return true;
		}
		if( Htmlstring.indexOf("'") > 0){
			return true;
		}
		if( Htmlstring.indexOf(',') > 0){
			return true;
		}
		if( Htmlstring.indexOf('/') > 0){
			return true;
		}
		if( Htmlstring.indexOf(';') > 0){
			return true;
		}
		if( Htmlstring.indexOf('\r') > 0){
			return true;
		}
		if( Htmlstring.indexOf('\n') > 0){
			return true;
		}
		if( Htmlstring.indexOf('(') > 0){
			return true;
		}
		if( Htmlstring.indexOf(')') > 0){
			return true;
		}
		return false;
	}

	public static String getEncoding(String str) {
		String encode = "UTF-8";
		try {
			if (str.equals(new String(str.getBytes(encode), encode))) {
				String s = encode;
				return s;
			}
		} catch (Exception exception) {
		}
		encode = "ISO-8859-1";
		try {
			if (str.equals(new String(str.getBytes(encode), encode))) {
				String s1 = encode;
				return s1;
			}
		} catch (Exception exception1) {
		}
		encode = "GB2312";
		try {
			if (str.equals(new String(str.getBytes(encode), encode))) {
				String s2 = encode;
				return s2;
			}
		} catch (Exception exception2) {
		}
		encode = "GBK";
		try {
			if (str.equals(new String(str.getBytes(encode), encode))) {
				String s3 = encode;
				return s3;
			}
		} catch (Exception exception3) {
		}
		return "";
	}
	public static void main(String[] args) {
		System.out.println(NoChar("name=(select (CASE WHEN 9044*(SELECT 9044 FROM INFORMATION_SCHEMA.CHARACTER_SETS) END))&status=&title=Mr.&"));
	}

	public static String trimToEmpty(String string) {
		return string == null ? "" : string.trim();
	}

	public static boolean equals(String str1, String str2) {
		return str1 == null ? str2 == null : str1.equals(str2);
	}

	public static String filterHtmlTag(String content){
		return content.replaceAll("<[.[^<]]*>","").replaceAll("\\s*|\t|\r|\n", "").replaceAll("&nbsp;","");
	}
}