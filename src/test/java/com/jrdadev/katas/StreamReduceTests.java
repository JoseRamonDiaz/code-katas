package com.jrdadev.katas;

import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

public class StreamReduceTests {
	private StreamReduce sr;
	
	protected void setUp() {
		sr = new StreamReduce();
	}
	
	@Test
	public void testSumIntegers() throws Exception{
		setUp();
		assertEquals(10,  sr.sumIntegers(asList(1, 2, 3, 4)));
	}
	
	@Test
    public void transformShouldConvertCollectionElementsToUpperCase() throws Exception {
    	setUp();
        List<String> collection = asList("My", "name", "is", "John", "Doe");
        List<String> expected = asList("MY", "NAME", "IS", "JOHN", "DOE");
        List<String> transformedCollection = sr.transform(collection);
        assertThat(transformedCollection).hasSameElementsAs(expected);
    }
    
	@Test
    public void lessThanFourChar() throws Exception {
    	setUp();
    	List<String> collection = asList("My", "name", "is", "John", "Doe");
        List<String> expected = asList("My", "is", "Doe");
        assertThat(sr.filterLessThanFourChar(collection)).hasSameElementsAs(expected);
    }
}
