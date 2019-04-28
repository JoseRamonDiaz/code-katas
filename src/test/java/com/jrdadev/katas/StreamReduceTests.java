package com.jrdadev.katas;

import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import junit.framework.TestCase;

public class StreamReduceTests extends TestCase {
	private StreamReduce sr;
	
	protected void setUp() {
		sr = new StreamReduce();
	}
	
	public void testSumIntegers() throws Exception{
		assertEquals(10,  sr.sumIntegers(asList(1, 2, 3, 4)));
	}
	
    public void testTransformShouldConvertCollectionElementsToUpperCase() throws Exception {
        List<String> collection = asList("My", "name", "is", "John", "Doe");
        List<String> expected = asList("MY", "NAME", "IS", "JOHN", "DOE");
        List<String> transformedCollection = sr.transform(collection);
        assertThat(transformedCollection).hasSameElementsAs(expected);
    }
    
    public void testLessThanFourChar() throws Exception {
    	List<String> collection = asList("My", "name", "is", "John", "Doe");
        List<String> expected = asList("My", "is", "Doe");
        assertThat(sr.filterLessThanFourChar(collection)).hasSameElementsAs(expected);
    }
}
