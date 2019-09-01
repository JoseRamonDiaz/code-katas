package com.jrdadev.gym;

import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.assertEquals;

public class CustomerTest {
    @Test
    public void testGetMembership(){
        Customer c = new Customer();
        Membership m = new Membership();
        Date expectedDate = DateUtils.parse("7/17/19");
        m.setStartDate(expectedDate);

        c.setMembership(m);

        assertEquals(m, c.getMembership());
    }
}
