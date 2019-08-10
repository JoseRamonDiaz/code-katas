package com.codekata._15.diversion;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ArrayUtilsTest {

    @Test
    public void testDuplicateArray(){
        ArrayUtils arrayUtils = new ArrayUtils();

        assertEquals(new ArrayList<>() {
            {
                add("00");
                add("01");
                add("10");
                add("11");
            }
        }, arrayUtils.duplicateAndAddZerosAndOnes(new ArrayList<String>(){
            {
                add("0");
                add("1");
            }
        }));
    }


}
