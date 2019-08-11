package com.codekata._15.diversion;

import org.junit.Test;

import java.util.HashSet;

import static org.junit.Assert.assertEquals;

public class ArrayUtilsTest {

    @Test
    public void testDuplicateArray(){
        ArrayUtils arrayUtils = new ArrayUtils();

        assertEquals(new HashSet<>() {
            {
                add("00");
                add("01");
                add("10");
                add("11");
            }
        }, arrayUtils.duplicateAndAddZerosAndOnes(new HashSet<>(){
            {
                add("0");
                add("1");
            }
        }));
    }


}
