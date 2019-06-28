package com.space.common.util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DataUtil {

	public static int compare_date(String begin, String end) {
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm");
		try {
			Date beginDate = df.parse(begin);
			Date endDate = df.parse(end);
			if (beginDate.getTime() > endDate.getTime()) {
				return 1;
			} else if (beginDate.getTime() < endDate.getTime()) {
				return -1;
			} else {
				return 0;
			}
		} catch (Exception exception) {
			exception.printStackTrace();
		}
		return 0;
	}

}
