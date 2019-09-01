package com.jrdadev.gym;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;

public class DateUtils {
	public static Date parse(String s) {
		try {
			return privParse(s);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	private static Date privParse(String s) throws ParseException {
		DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT);
		return df.parse(s);
	}
}
