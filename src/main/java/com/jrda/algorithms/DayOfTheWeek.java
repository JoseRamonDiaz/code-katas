package com.jrda.algorithms;

public class DayOfTheWeek {
	private static final int daysPerMonth[] = new int[]{
			31, //January
			28, //Feb
			31, //March
			30, //April
			31, //May
			30, //Jun
			31, //July
			31, //August
			30, //Sept
			31, //Oct
			30, //Nov
			31  //Dec
		};
	private static final String[] weekDays = new String[] {"Friday", "Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday"};
	
	
	public String dayOfTheWeek(int day, int month, int year) {
        int c = 0;
        
        c += countDaysOfPastYears(year);
        c += countDaysOfCurrentYear(month, year);
        c += day - 1;
        
        return weekDays[c%7];
    }
	
	protected int countDaysOfCurrentYear(int month, int year) {
		int c = 0;
		
		for (int i = 0; i < month - 1 ; i++) {
			if (i == 1 && isLeapYear(year))
				c += 29;
			else
				c += daysPerMonth[i];
		}
		
		return c;
	}
	
	protected int countDaysOfPastYears(int year) {
		int c = 0;
		
		for (int i = 1971; i < year; i++) {
			if (isLeapYear(i))
				c += 366;
			else 
				c += 365;
		}
		
		return c;
	}

	protected boolean isLeapYear(int year) {
		if (year % 400 == 0) {
			return true;
		}
		
		if (year % 100 == 0) {
			return false;
		}
		
		if (year % 4 == 0) {
			return true;
		}
		
		return false;
	}
	
}
