package com.codekata._15.diversion;

import org.junit.Test;

import java.util.HashSet;

import static org.junit.Assert.assertEquals;

public class DiversionTest {

    @Test
    public void testCombinationsGeneration() throws Exception {
        Diversion diversion = new Diversion();
        assertEquals(new HashSet<>(){
            /**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			{
                add("0");
                add("1");
            }
        }, diversion.generateCombinations(1));

        assertEquals(new HashSet<>(){
            /**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			{
                add("00");
                add("01");
                add("11");
                add("10");
            }
        }, diversion.generateCombinations(2));
    }

    @Test
    public void testAdjacentOnes() throws Exception {
        Diversion diversion = new Diversion();

        assertEquals(0, diversion.getAdjacentOnes(diversion.generateCombinations(1)));
        assertEquals(1, diversion.getAdjacentOnes(diversion.generateCombinations(2)));
        assertEquals(3, diversion.getAdjacentOnes(diversion.generateCombinations(3)));//doble + 1
        assertEquals(8, diversion.getAdjacentOnes(diversion.generateCombinations(4)));//doble + 2
        assertEquals(19, diversion.getAdjacentOnes(diversion.generateCombinations(5)));//doble + 3
        assertEquals(43, diversion.getAdjacentOnes(diversion.generateCombinations(6)));//doble + 5
        assertEquals(94, diversion.getAdjacentOnes(diversion.generateCombinations(7)));//doble + 8
        assertEquals(201, diversion.getAdjacentOnes(diversion.generateCombinations(8)));//doble + 13
        assertEquals(423, diversion.getAdjacentOnes(diversion.generateCombinations(9)));//doble + 21
    }
}
