package com.jrdadev.gym;

import java.text.DateFormat;
import java.text.ParseException;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
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
	
	public static LocalDate dateToLocalDate(Date d) {
		Instant instant = Instant.ofEpochMilli(d.getTime()); 
		LocalDateTime localDateTime = LocalDateTime.ofInstant(instant, ZoneId.systemDefault());
		LocalDate localDate = localDateTime.toLocalDate();
		return localDate;
	}
}
