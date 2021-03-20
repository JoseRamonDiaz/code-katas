package com.codekata._15.diversion;

import org.junit.Test;

import java.util.HashSet;

import static org.junit.Assert.assertEquals;

public class SetUtilsTest {

    @Test
    public void testDuplicateArray() {
        SetUtils arrayUtils = new SetUtils();

        assertEquals(new HashSet<String>() {
            /**
             *
             */
            private static final long serialVersionUID = 1L;

            {
                add("00");
                add("01");
                add("10");
                add("11");
            }
        }, arrayUtils.duplicateAndAddZerosAndOnes(new HashSet<String>() {
            /**
             *
             */
            private static final long serialVersionUID = 1L;

            {
                add("0");
                add("1");
            }
        }));
    }


}
