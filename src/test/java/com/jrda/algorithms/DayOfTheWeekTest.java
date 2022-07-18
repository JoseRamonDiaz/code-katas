package com.jrda.algorithms;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class DayOfTheWeekTest {
	@Test
	public void testLeapYear() {
		DayOfTheWeek dayOfTheWeek = new DayOfTheWeek();
		assertTrue(dayOfTheWeek.isLeapYear(2016));
		assertTrue(dayOfTheWeek.isLeapYear(2024));
		assertTrue(dayOfTheWeek.isLeapYear(2020));
		assertTrue(dayOfTheWeek.isLeapYear(2400));
		assertFalse(dayOfTheWeek.isLeapYear(2100));
		assertFalse(dayOfTheWeek.isLeapYear(2200));
		assertFalse(dayOfTheWeek.isLeapYear(2900));
	}
	
	@Test
	public void testCountPastYearsDays() {
		DayOfTheWeek dayOfTheWeek = new DayOfTheWeek();
		assertEquals(0, dayOfTheWeek.countDaysOfPastYears(1971));
		assertEquals(365, dayOfTheWeek.countDaysOfPastYears(1972));
		assertEquals(365 * 2 + 1, dayOfTheWeek.countDaysOfPastYears(1973));
	}
	
	@Test
	public void testCountDaysOfCurrentYear() {
		DayOfTheWeek dayOfTheWeek = new DayOfTheWeek();
		assertEquals(60, dayOfTheWeek.countDaysOfCurrentYear(3, 1972));
		assertEquals(0, dayOfTheWeek.countDaysOfCurrentYear(1, 1972));
		assertEquals(31, dayOfTheWeek.countDaysOfCurrentYear(2, 1972));
	}
	
	@Test
	public void testDayOfTheWeek() {
		DayOfTheWeek dayOfTheWeek = new DayOfTheWeek();
		assertEquals("Saturday", dayOfTheWeek.dayOfTheWeek(02, 1, 1971));
		assertEquals("Friday", dayOfTheWeek.dayOfTheWeek(8, 1, 1971));
		assertEquals("Saturday", dayOfTheWeek.dayOfTheWeek(31, 8, 2019));
		assertEquals("Sunday", dayOfTheWeek.dayOfTheWeek(18, 7, 1999));
		assertEquals("Sunday", dayOfTheWeek.dayOfTheWeek(15, 8, 1993));
	}
}
