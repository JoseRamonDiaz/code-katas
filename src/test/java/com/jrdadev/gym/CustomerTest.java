package com.jrdadev.gym;

import org.junit.Ignore;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class CustomerTest {
    @Ignore("Not implemented yet")
    @Test
    public void testGetMembership(){
        Customer c = new Customer();
        Membership m = new Membership();
        LocalDate expectedDate = LocalDate.parse("7/17/19");
        m.setStartDate(expectedDate);

        c.setMembership(m);

        assertEquals(m, c.getMembership());
    }
}
