package com.jrda.design_patterns.prototype;

import org.junit.Test;

import static org.junit.Assert.*;

public class NameListTest {
    @Test
    public void testNameList(){
        NameList nameList = new NameListImpl();
        nameList.getNameList().add("Pachi");

        NameList nameList1 = nameList.clone();
        nameList1.getNameList().set(0, "Christopher");

        assertNotEquals("Pachi", nameList.getNameList().get(0));
    }
}
