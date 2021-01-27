package com.jrdadev.gym;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class MembershipTest {
	Membership m;
	
	@Before
	public void init() {
		m = new Membership();
	}

    @Test
    public void testStartDateMembership(){
		LocalDate expectedDate = LocalDate.parse("2019-07-17");
        m.setStartDate(expectedDate);
        assertEquals(expectedDate, m.getStartDate());
    }
    
    @Test
    public void isNotVigentTest() {
    	LocalDate startDate = LocalDate.parse("2019-07-17");
    	LocalDate endDate = LocalDate.parse("2019-08-16");
    	m.setStartDate(startDate);
    	m.setEndDate(endDate);
    	
    	assertFalse(m.isVigent());
    }

    @Ignore("Not implemented yet")
    @Test
    public void isVigentTest() {
    	LocalDate startDate = LocalDate.parse("2019-07-17");
    	LocalDate endDate = LocalDate.parse("2019-09-16");
    	m.setStartDate(startDate);
    	m.setEndDate(endDate);
    	
    	assertTrue(m.isVigent());
    }

    @Ignore("Not implemented yet")
    @Test
    public void lastVigentDayTest() {
    	LocalDate startDate = LocalDate.parse("2019-07-17");
    	LocalDate endDate = LocalDate.parse("2019-08-31");
    	m.setStartDate(startDate);
    	m.setEndDate(endDate);
    	
    	assertTrue(m.isVigent());
    }
}
