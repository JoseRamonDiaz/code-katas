package com.jrda.kata_log.banking;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.Date;

import org.junit.Test;

public class DateWrapperTest {
	@Test
	public void testGetDate() throws InterruptedException {
		Date startDate = new Date();
		Thread.sleep(10);//wait to make date bigger than startDate
		DateWrapper dateWrapper = new DateWrapper();
		Date date = dateWrapper.getDate();
		assertNotNull(date);
		Thread.sleep(10);//wait to make endDate bigger than date
		Date endDate = new Date();
		assertTrue(date.after(startDate));
		assertTrue(date.before(endDate));
	}
}
