package com.jrdadev.gym;

import org.junit.Before;
import org.junit.Test;

import java.util.Date;

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
		Date expectedDate = DateUtils.parse("7/17/19");
        m.setStartDate(expectedDate);
        assertEquals(expectedDate, m.getStartDate());
    }
    
    @Test
    public void isNotVigentTest() {
    	Date startDate = DateUtils.parse("7/17/19");
    	Date endDate = DateUtils.parse("8/16/19");
    	m.setStartDate(startDate);
    	m.setEndDate(endDate);
    	
    	assertFalse(m.isVigent());
    }

    @Test
    public void isVigentTest() {
    	Date startDate = DateUtils.parse("7/17/19");
    	Date endDate = DateUtils.parse("9/16/19");
    	m.setStartDate(startDate);
    	m.setEndDate(endDate);
    	
    	assertTrue(m.isVigent());
    }
    
    @Test
    public void lastVigentDayTest() {
    	Date startDate = DateUtils.parse("7/17/19");
    	Date endDate = DateUtils.parse("8/31/19");
    	m.setStartDate(startDate);
    	m.setEndDate(endDate);
    	
    	assertTrue(m.isVigent());
    }
}
