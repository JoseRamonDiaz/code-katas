package com.codekata._05.blooming;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class BloomFilterTest {

	@Test
	public void testStoreHashesToArray() {
		BloomFilter bf = new BloomFilter();
	 	assertTrue( bf.search("a") );
	}
	
}
