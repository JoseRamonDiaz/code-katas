package com.jrda.kata_log.banking;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.when;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class DateTimeTest {
	private DateTime dateTime;
	private Date testDate0;
	private Date testDate1;
	private String expectedDate0;
	private String expectedDate1;
	
	@Before
	public void init() {
		dateTime = new DateTime();
		testDate0 = new Date(1612006918178L);
		testDate1 = new Date(1612007293934L);
		expectedDate0 = "2021-01-30 05:41:58.178";
		expectedDate1 = "2021-01-30 05:48:13.934";
	}
	
	@Test
	public void testFormatter() {
		String dateString = dateTime.formatDate(testDate0);
		assertNotNull(dateString);
		assertFalse(dateString.isEmpty());
		assertEquals(expectedDate0, dateString);
		
		String dateString2 = dateTime.formatDate(testDate1);
		assertEquals(expectedDate1, dateString2);
	}
	
	@Test
	public void testGetStringDate() {
		DateWrapper dateWrapper = Mockito.mock(DateWrapper.class);
		when(dateWrapper.getDate()).thenReturn(testDate0, testDate1);
		dateTime.setDateWrapper(dateWrapper);
		
		String strDate = dateTime.getDate();
		assertNotNull(strDate);
		assertFalse(strDate.isEmpty());
		assertEquals(expectedDate0, strDate);
		
		String strDate2 = dateTime.getDate();
		assertEquals(expectedDate1, strDate2);
	}
}
