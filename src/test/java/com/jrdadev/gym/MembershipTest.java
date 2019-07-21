package com.jrdadev.gym;

import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.assertEquals;

public class MembershipTest {

    @Test
    public void testStartDateMembership(){
        Membership m = new Membership();
        Date expectedDate = new Date("7/17/19");
        m.setStartDate(expectedDate);

        assertEquals(expectedDate, m.getStartDate());
    }

}
