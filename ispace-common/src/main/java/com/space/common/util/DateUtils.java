package com.space.common.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * 
 * @author lihan 时间的一些操作工具
 */
public class DateUtils {

	public static final int YEAR = 1;
	public static final int MONTH = 2;
	public static final int DAY = 3;
	public static final int HOUR = 4;
	public static final int MINUTE = 5;
	public static final int SECOND = 6;

	public static final String DATE_STANDARD = "yyyy-MM-dd HH:mm:ss";
	public static final String DATE_SIMPLE = "yyyy-MM-dd";
	public static final String DATE_SIMPLE_BACKSLASH = "yyyy/MM/dd";
	public static final String DATE_SIMPLE_NOINTERVAL = "yyyyMMdd";

	/**
	 * 格式转化 YYYY-MM-DD HH:mm:ss
	 * 
	 * @param date
	 * @return
	 */
	public static String parseDateForStandard(Date date) {
		return parseDate(date, DATE_STANDARD);
	}

	/**
	 * 自定义模版
	 * 
	 */
	public static String parseDate(Date date, String pattern) {
		if(date==null)return "";
		DateFormat df = new SimpleDateFormat(pattern);
		return df.format(date);
	}

	/**
	 * 格式转化 YYYY-MM-DD
	 * 
	 * @param date
	 * @return
	 */
	public static String parseDateForSimple(Date date) {
		return parseDate(date, DATE_SIMPLE);
	}

	/**
	 * 格式转化 YYYY-MM-DD
	 * 
	 * @return
	 */
	public static Date parseDateForSimple(String dateStr) {
		return parseDate(dateStr, DATE_SIMPLE);
	}
	
	/**
	 * @param date
	 * @return
	 * @description 格式化时间YYYYMMDD
	 * @version 1.0
	 * @author shower
	 * @update Jun 16, 2014 12:11:54 PM
	 */
	public static String parseDateForSImpleNoInterval(Date date){
		return parseDate(date, DATE_SIMPLE_NOINTERVAL);
	}
	
	
	/**
	 * 
	 * @param dateStr 
	 * @param dateSimple
	 * @return
	 */
	public static Date parseDate(String dateStr, String dateSimple) {
		try {
			return new SimpleDateFormat(dateSimple).parse(dateStr);
		} catch (ParseException e) {
		}
		return null;
	}

	/**
	 * 格式转化 YYYY/MM/DD
	 * 
	 * @param date
	 * @return
	 */
	public static String parseDateForSimpleBackslash(Date date) {
		return parseDate(date, DATE_SIMPLE_BACKSLASH);
	}

	/**
	 * 根据类型 返回 提前当前时间 date 前 time （如 ：3） type （如：天）
	 * 
	 * @param type
	 *            本类常量
	 * @param date
	 *            操作时间
	 * @param time
	 *            提前量
	 * @return
	 */
	public static Date getBeforeTime(int type, Date date, int time) {
		Calendar cl = Calendar.getInstance();
		cl.setTime(date);
		if (type == YEAR) {
			cl.set(Calendar.YEAR, cl.get(Calendar.YEAR) - time);
		} else if (type == MONTH) {
			cl.set(Calendar.MONTH, cl.get(Calendar.MONTH) - time);
		} else if (type == DAY) {
			cl.set(Calendar.DAY_OF_MONTH, cl.get(Calendar.DAY_OF_MONTH) - time);
		}
		return cl.getTime();
	}

	/**
	 * 根据类型 返回 提前当前时间 date 后 time （如 ：3） type （如：天）
	 * 
	 * @param type
	 *            本类常量
	 * @param date
	 *            操作时间
	 * @param time
	 *            退后量
	 * @return
	 */
	public static Date getEndTime(int type, Date date, int time) {
		Calendar cl = Calendar.getInstance();
		cl.setTime(date);
		if (type == YEAR) {
			cl.add(Calendar.YEAR, time);
		} else if (type == MONTH) {
			cl.add(Calendar.MONTH, time);
		} else if (type == DAY) {
			cl.add(Calendar.DAY_OF_MONTH, time);
		} else if (type == HOUR) {
			cl.add(Calendar.HOUR, time);
		} else if (type == MINUTE) {
			cl.add(Calendar.MINUTE, time);
		} else if (type == SECOND) {
			cl.add(Calendar.SECOND, time);
		}
		return cl.getTime();
	}

	/**
	 * 两个时间 之间 差的天数
	 * 
	 * @param d1
	 * @param d2
	 * @return 一个int数组 int[0]标识 d1 和 d2 的大小 d1>d2 ==1 d1<d2==-1 d1==d2==0 int[1]
	 *         为 差距天数
	 */
	public static int[] getDaybetweenTwoDate(Date d1, Date d2) {
		int[] ints = new int[2];
		d1 = cleanDate(d1);
		d2 = cleanDate(d2);
		long day1 = d1.getTime();
		long day2 = d2.getTime();
		long between = 0;
		if (day1 > day2) {
			between = (day1 - day2) / (24 * 60 * 60 * 1000);
			ints[0] = 1;
		} else if (day2 > day1) {
			between = (day2 - day1) / (24 * 60 * 60 * 1000);
			ints[0] = -1;
		} else {
			between = 0;
			ints[0] = 0;
		}
		if (between == 0) {
			ints[0] = 0;
		}
		ints[1] = (int) between;
		return ints;
	}

	/**
	 * 两个时间 之间 差的天数
	 * 
	 * @return 一个int数组 int[0]标识 d1 和 d2 的大小 d1>d2 ==1 d1<d2==-1 d1==d2==0 int[1]
	 *         为 差距天数
	 */
	public static int[] getDaybetweenTwoDate(long l1, long l2) {
		Date d1 = new Date(l1);
		Date d2 = new Date(l2);
		int[] ints = new int[2];
		d1 = cleanDate(d1);
		d2 = cleanDate(d2);
		long day1 = d1.getTime();
		long day2 = d2.getTime();
		long between = 0;
		if (day1 > day2) {
			between = (day1 - day2) / (24 * 60 * 60 * 1000);
			ints[0] = 1;
		} else if (day2 > day1) {
			between = (day2 - day1) / (24 * 60 * 60 * 1000);
			ints[0] = -1;
		} else {
			between = 0;
			ints[0] = 0;
		}
		if (between == 0) {
			ints[0] = 0;
		}
		ints[1] = (int) between;
		return ints;
	}

	/**
	 * 将 时 分 秒 清零
	 * 
	 * @param date
	 * @return
	 */
	public static Date cleanDate(Date date) {
		Calendar cl = Calendar.getInstance();

		cl.setTime(date);
		cl.set(Calendar.HOUR_OF_DAY, 0);
		cl.set(Calendar.MINUTE, 0);
		cl.set(Calendar.SECOND, 0);
		return cl.getTime();
	}

	/**
	 * 将时间 变为 此天的最后一刻
	 * 
	 * @param date
	 * @return
	 */
	public static Date lastMoment(Date date) {
		Calendar cl = Calendar.getInstance();
		cl.setTime(date);

		cl.set(Calendar.HOUR_OF_DAY, 23);
		cl.set(Calendar.MINUTE, 59);
		cl.set(Calendar.SECOND, 0);
		return cl.getTime();
	}

	/**
	 * 獲得精確的年齡
	 * 
	 * @param birthday
	 *            生日
	 * @return 計算所得的年齡
	 */
	public static int getAge(Date birthday) {

		Calendar birth = Calendar.getInstance();
		if (birthday != null) {
			birth.setTime(birthday);
		} else {
			return 0;
		}
		return getAge(birth);
	}

	/**
	 * 獲得精確到毫秒的年齡
	 * 
	 * @param birth
	 *            生日
	 * @return 計算所得的年齡
	 */
	public static int getAge(Calendar birth) {
		Calendar now = Calendar.getInstance();
		if (birth.after(now)) {
			return -1;
		}
		if (birth.equals(now)) {
			return 0;
		}
		int age = now.get(Calendar.YEAR) - birth.get(Calendar.YEAR);
		if (now.get(Calendar.MONTH) - birth.get(Calendar.MONTH) < 0) {
			return age - 1;
		}
		if (now.get(Calendar.MONTH) - birth.get(Calendar.MONTH) > 0) {
			return age;
		}
		if (now.get(Calendar.DAY_OF_MONTH) - birth.get(Calendar.DAY_OF_MONTH) < 0) {
			return age - 1;
		}
		if (now.get(Calendar.DAY_OF_MONTH) - birth.get(Calendar.DAY_OF_MONTH) > 0) {
			return age;
		}
		if (now.get(Calendar.HOUR_OF_DAY) - birth.get(Calendar.HOUR_OF_DAY) < 0) {
			return age - 1;
		}
		if (now.get(Calendar.HOUR_OF_DAY) - birth.get(Calendar.HOUR_OF_DAY) > 0) {
			return age;
		}
		if (now.get(Calendar.MINUTE) - birth.get(Calendar.MINUTE) < 0) {
			return age - 1;
		}
		if (now.get(Calendar.MINUTE) - birth.get(Calendar.MINUTE) > 0) {
			return age;
		}
		if (now.get(Calendar.SECOND) - birth.get(Calendar.SECOND) < 0) {
			return age - 1;
		}
		if (now.get(Calendar.SECOND) - birth.get(Calendar.SECOND) > 0) {
			return age;
		}
		if (now.get(Calendar.MILLISECOND) - birth.get(Calendar.MILLISECOND) < 0) {
			return age - 1;
		}
		if (now.get(Calendar.MILLISECOND) - birth.get(Calendar.MILLISECOND) > 0) {
			return age;
		}
		return age;
	}
	
	/**
	 * get the months from a past time to now
	 * 
	 * @param date
	 * @return 過去到現在的月數
	 */
	public static int getMonthsFromNow(Date date) {
		Calendar now = Calendar.getInstance();
		Calendar past = Calendar.getInstance();
		past.setTime(date);
		int months = now.get(Calendar.MONTH) - past.get(Calendar.MONTH);
		int years = now.get(Calendar.YEAR) - past.get(Calendar.YEAR);
		return years * 12 + months;
	}
	
	public static String getMonthsBeginDate() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.DATE, 1);// 设为当前月的1号
		calendar.set(Calendar.HOUR, 0);
		calendar.set(Calendar.MINUTE,0);
		calendar.set(Calendar.SECOND,0);
		return sdf.format(calendar.getTime());
	}
	
	public static String getMonthsEnd() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.DAY_OF_MONTH, calendar.getActualMaximum(Calendar.DAY_OF_MONTH));
		calendar.set(Calendar.HOUR, 0);
		calendar.set(Calendar.MINUTE,0);
		calendar.set(Calendar.SECOND,0);
		return sdf.format(calendar.getTime());
	}
	
	public static void main(String[] args) {
		System.out.println(DateUtils.getMonthsBeginDate());
		System.out.println(DateUtils.getMonthsEnd());
	}
	
	/**
	 * @param startDate
	 * @param endDate
	 * @return
	 * @description 获得两date相差的年月日
	 * @version 1.0
	 * @author shower
	 * @update May 14, 2014 3:23:26 PM
	 * @update 2014-06-05 标的详情页右侧商户信息的合作时间精确到月即可
	 */
	public static String getSubYMDStrByDates(Date startDate, Date endDate){
		if(startDate == null){
			startDate = new Date();
		}
		if(endDate == null){
			endDate = new Date();
		}
		long l=endDate.getTime() - startDate.getTime();//相差毫秒数
		long sumDays = l/(24*60*60*1000);//相差总天数
		long years=sumDays/(12*30);//相差多少年
		long months=(sumDays - years*12*30)/30;//相差多少年多少月
		long days = sumDays - years*12*30 - months*30;//相差多少年多少月多少日
		if(years <1){
			if(months<1){
				if(days<1){
					return  "0天";//+days+"天";//相差时间
				}else{
					return  days+"天";//+days+"天";//相差时间
				}
			}else{
				if(days<1){
					return  months+"个月";//+days+"天";//相差时间
				}else{
					if(months>=11){
						return  "1年";//+days+"天";//相差时间
					}else{
						return  (months+1)+"个月";//+days+"天";//相差时间
					}
				}
			}
		}else{
			if(days<1){
				return  years+"年"+months+"个月";//+days+"天";//相差时间
			}else{
				if(months>=11){
					return  (years+1)+"年";//+days+"天";//相差时间
				}else{
					return  years+"年"+(months+1)+"个月";//+days+"天";//相差时间
				}
			}
		}
	}
	
	/**
	 * @param startDate
	 * @param endDate
	 * @return
	 * @description 获得两date相差的年月日时分秒
	 * @version 1.0
	 * @author shower
	 * @update May 14, 2014 3:23:57 PM
	 */
	public static String getSubYMDHMSStrByDates(Date startDate, Date endDate){
		if(startDate == null){
			startDate = new Date();
		}
		if(endDate == null){
			endDate = new Date();
		}
		long l=endDate.getTime() - startDate.getTime();//相差毫秒数
		long sumDays = l/(24*60*60*1000);//相差总天数
		long years=sumDays/(12*30);//相差多少年
		long months=(sumDays - years*12*30)/30;//相差多少年多少月
		long days = sumDays - years*12*30 - months*30;//相差多少年多少月多少日
	    long hour=(l/(60*60*1000)-sumDays*24);//相差多少天多少小时
	    long min=((l/(60*1000))-sumDays*24*60-hour*60);//相差多少天多少小时多少分
	    long s=(l/1000-sumDays*24*60*60-hour*60*60-min*60);//相差多少天多少小时多少分多少秒
	    return  years+"年"+months+"月"+days+"天"+hour+"小时"+min+"分"+s+"秒";//相差时间
	}
}
